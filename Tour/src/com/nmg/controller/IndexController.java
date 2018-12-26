package com.nmg.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.nmg.dao.UserDao;
import com.nmg.entity.Gonggao;
import com.nmg.entity.Hotel;
import com.nmg.entity.Jingdian;
import com.nmg.entity.Liuyan;
import com.nmg.entity.Manager;
import com.nmg.entity.Reshotel;
import com.nmg.entity.User;
import com.nmg.entity.Xianlu;
import com.nmg.serviceImpl.GonggaoServiceImpl;
import com.nmg.serviceImpl.HotelServiceImpl;
import com.nmg.serviceImpl.JingdianServiceImpl;
import com.nmg.serviceImpl.LiuyanServiceImpl;
import com.nmg.serviceImpl.ManagerServiceImpl;
import com.nmg.serviceImpl.ReshotelServiceImpl;
import com.nmg.serviceImpl.UserServiceImpl;
import com.nmg.serviceImpl.XianluServiceImpl;
import com.nmg.util.Util;

@Controller
@RequestMapping("Nmg")
public class IndexController {
	
	@Resource
	private JingdianServiceImpl jingdianServiceImpl;
	@Resource
	private UserServiceImpl userServiceImpl;
	@Resource
	private XianluServiceImpl xianluServiceImpl;
	@Resource
	private HotelServiceImpl hotelServiceImpl;
	@Resource
	private ReshotelServiceImpl reshotelServiceImpl;
	@Resource
	private GonggaoServiceImpl gonggaoServiceImpl;
	@Resource
	private ManagerServiceImpl managerServiceImpl;
	@Resource
	private LiuyanServiceImpl liuyanServiceImpl;
	
	public UserServiceImpl getUserServiceImpl() {
		return userServiceImpl;
	}

	public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}

	public JingdianServiceImpl getJingdianServiceImpl() {
		return jingdianServiceImpl;
	}

	public void setJingdianServiceImpl(JingdianServiceImpl jingdianServiceImpl) {
		this.jingdianServiceImpl = jingdianServiceImpl;
	}
	//访问首页
	@RequestMapping("index")
	 public String toIndex(HttpServletRequest request,Model model)
	{ 
			
		List<Jingdian> list = jingdianServiceImpl.selectBeanList(0, 9, "");
		List<Gonggao> gonggaoList = gonggaoServiceImpl.selectGonggaoBeanList(0, 9, "");
		System.out.println(gonggaoList);
		request.setAttribute("list", list);
		request.getSession().setAttribute("gonggaoList", gonggaoList);
		return "index"; 
	}
	
	//用户登陆操作
	@RequestMapping(value="/ulogin", method = RequestMethod.POST)
		public void ulogin(HttpServletRequest request,HttpServletResponse response) throws Exception{

			User u = new User();
			List<User> list=null;
			User bean;
			u.setUsername(request.getParameter("username"));
			u.setPassword(request.getParameter("password"));
			try{
				list=userServiceImpl.selectUserBean(u);
			}catch(Exception e){
			
			}
		
			
			if (!list.isEmpty()) {
				HttpSession session = request.getSession();
				session.setAttribute("user",list.get(0));
				response.setCharacterEncoding("utf-8");response.setContentType("text/html; charset=utf-8");
				PrintWriter writer = response.getWriter();
				writer
						.print("<script  language='javascript'>alert('登录成功！');window.location.href='/Tour/Nmg/index'; </script>");
			} else {
				response.setCharacterEncoding("utf-8");response.setContentType("text/html; charset=utf-8");
				PrintWriter writer = response.getWriter();
				writer
						.print("<script  language='javascript'>alert('用户名或者密码错误！登录失败');window.location.href='/Tour/Nmg/index'; </script>");
			}

		}
	//用户退出
	@RequestMapping("uloginout")
	public void uloginout(HttpServletRequest request,HttpServletResponse response) throws IOException {

		HttpSession session = request.getSession();
		session.removeAttribute("user");
		response.setCharacterEncoding("utf-8");response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer
				.print("<script  language='javascript'>alert('退出成功！');window.location.href='/Tour/Nmg/index'; </script>");

	}
	
	//注册界面
	@RequestMapping("regJsp")
	public String toRegJsp(){
		return "register";
	}
	
	//用户注册操作
	@RequestMapping("register")
		public void register(HttpServletRequest request,HttpServletResponse response) throws IOException{

			response.setCharacterEncoding("utf-8");response.setContentType("text/html; charset=utf-8");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String truename = request.getParameter("truename");
			String telephone = request.getParameter("telephone");
			String jiguan = request.getParameter("jiguan");
			String address = request.getParameter("address");
			String xingbie = request.getParameter("xingbie");
			String age = request.getParameter("age");
			String email = request.getParameter("email");
			
			int i = userServiceImpl.selectUsernameBean(username);
			User bean;
			if(i==0){
				bean = new User();
				bean.setUsername(username);
				bean.setPassword(password);
				bean.setTruename(truename);
				bean.setTelephone(telephone);
				bean.setJiguan(jiguan);
				bean.setAddress(address);
				bean.setXingbie(xingbie);
				bean.setAge(age);
				bean.setEmail(email);
				bean.setCreatetime(new Date());
				userServiceImpl.insertUserBean(bean);
				
				response.setCharacterEncoding("gbk");
				response.getWriter().write("注册成功！您的用户名"+bean.getUsername()+"");
			}else{
				response.setCharacterEncoding("gbk");
				response.getWriter().write("提交失败，该用户已经注册过，请重新注册");
			}
			
		}
	//景点首页）
	@RequestMapping("sy_jingdian")
	public String sy_jingdian(HttpServletRequest request,HttpServletResponse response) throws IOException{
	
		List<Jingdian> list = jingdianServiceImpl.selectBeanList(0, 9, "");
		request.setAttribute("list", list);
		return "sy_jingdian";
	}
	
	//景点详情页面（
	@RequestMapping("xq_jingdian")
	public String xq_jingdian(HttpServletRequest request,HttpServletResponse response){
		String id = request.getParameter("id");
	
		Jingdian bean =jingdianServiceImpl.selectBean(id.toString());
	
		request.setAttribute("bean", bean);
		return "xq_jingdian";
	}
	
	//首页-旅游线路列表
	@RequestMapping("sy_xianlu")
		public String sy_xianlu(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
			List<Xianlu> list = xianluServiceImpl.selectXianluBeanList(0,1,"");
		
			request.setAttribute("list", list);
			return "sy_xianlu";
		}
	//线路详情页面（
	@RequestMapping("xq_xianlu")
	public String xq_xianlu(HttpServletRequest request,HttpServletResponse response){
		String id = request.getParameter("id");
		
		Xianlu bean =xianluServiceImpl.selectXianluBean(id.toString());
		request.setAttribute("bean", bean);
		return "xq_xianlu";
	}
	
	//首页-酒店列表
	@RequestMapping("sy_hotel")
		public String sy_hotel(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
			List<Hotel> list = hotelServiceImpl.selectHotelBeanList(0,1,"");
		
			request.setAttribute("list", list);
			return "sy_hotel";
		}
	//酒店详情页面（首页）
	@RequestMapping("xq_hotel")
	public String xq_hotel(HttpServletRequest request,HttpServletResponse response){
		String id = request.getParameter("id");
		Hotel bean =hotelServiceImpl.selectHotelBean(id.toString());
		request.setAttribute("bean", bean);
		
		return "xq_hotel";
	}
	//首页-退订酒店
	@RequestMapping("sy_reshotel")
		public String sy_reshotel(HttpServletRequest request,HttpServletResponse response) throws IOException{
		HttpSession session = request.getSession();
			User user = (User)session.getAttribute("user");	
			if (user == null) {
			response.setCharacterEncoding("utf-8");response.setContentType("text/html; charset=utf-8");
			PrintWriter writer = response.getWriter();
			writer.print("<script  language='javascript'>alert('请先登录');window.location.href='/Tour/Nmg/index' </script>");
			return null ;
			}
			List<Reshotel> list = reshotelServiceImpl.selectReshotelBeanListByUid(user.getId());
			
			request.setAttribute("list", list);
			return "sy_reshotel";
		}
	//退订操作
	@RequestMapping("reshoteldelete")
	public void reshoteldelete(HttpServletRequest request,HttpServletResponse response) throws IOException{

		String id = request.getParameter("id");
		Reshotel r = new Reshotel();
		r.setId(Integer.parseInt(id));
		reshotelServiceImpl.deleteReshotelBean(r);
		response.setCharacterEncoding("utf-8");response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer.print("<script  language='javascript'>alert('提交成功');window.location.href='/Tour/Nmg/sy_reshotel'; </script>");
		
	}
	
	
	//首页-公告列表
	@RequestMapping("sy_gonggaolist")
		public String sy_gonggaolist(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
			List<Gonggao> list = gonggaoServiceImpl.selectGonggaoBeanList(0,1,"");
		
			request.setAttribute("list", list);
			return "sy_gonggaolist";
		}
	//公告页面（首页）
	@RequestMapping("xq_gonggao")
	public String xq_gonggaolist(HttpServletRequest request,HttpServletResponse response){
		String id = request.getParameter("id");
		Gonggao bean =gonggaoServiceImpl.selectGonggaoBean(id.toString());
		request.setAttribute("bean", bean);
		
		return "xq_gonggao";
	}
	//用户登陆操作
	@RequestMapping(value="/login", method = RequestMethod.POST)
		public void login(HttpServletRequest request,HttpServletResponse response) throws Exception{

			Manager u = new Manager();
			List<Manager> list=null;
			Manager bean;
			u.setUsername(request.getParameter("username"));
			u.setPassword(request.getParameter("password"));
			try{
				list=managerServiceImpl.selectManagerBean(u);
			}catch(Exception e){
			
			}
		
			
			if (!list.isEmpty()) {
				HttpSession session = request.getSession();
				session.setAttribute("manager",list.get(0));
				response.setCharacterEncoding("gbk");response.setContentType("text/html; charset=utf-8");
				PrintWriter writer = response.getWriter();
				writer
						.print("<script  language='javascript'>alert('登录成功！');window.location.href='/Tour/Nmg/managerIndex'; </script>");
			} else {
				response.setCharacterEncoding("gbk");response.setContentType("text/html; charset=utf-8");
				PrintWriter writer = response.getWriter();
				writer
						.print("<script  language='javascript'>alert('用户名或者密码错误！登录失败');window.location.href='/Tour/Nmg/loginIndex'; </script>");
			}

		}
	//用户退出
	@RequestMapping("loginout")
	public void loginout(HttpServletRequest request,HttpServletResponse response) throws IOException {

		HttpSession session = request.getSession();
		session.removeAttribute("manager");
		response.setCharacterEncoding("gbk");response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer
				.print("<script  language='javascript'>alert('退出成功！');window.location.href='/Tour/Nmg/index'; </script>");

	}
	//管理员界面
	@RequestMapping("loginIndex")
	public String toLogin(HttpServletRequest request,HttpServletResponse response){

		return "admin/login";
	}
	
	
	@RequestMapping("managerIndex")
	public String managerIndex(HttpServletRequest request,HttpServletResponse response){

		return "admin/index";
	}
	
	
	//跳转到修改密码页面
	@RequestMapping("passwordupdate")
	public String passwordupdate(){
		return "admin/manager/passwordupdate";
	}
	//修改密码操作
	@RequestMapping("passwordupdate2")
	public void passwordupdate2(HttpServletRequest request,HttpServletResponse response) throws IOException{

		String password2 = request.getParameter("password2");
		HttpSession session = request.getSession();
		Manager manager = (Manager)session.getAttribute("manager");
		Manager bean = managerServiceImpl.selectManagerBean(manager).get(0);
		if(bean!=null){
			bean.setPassword(password2);
			managerServiceImpl.updateManagerBean(bean);
			response.setCharacterEncoding("utf8");
			PrintWriter writer = response.getWriter();
			writer.print("<script  language='javascript'>alert('操作成功'); </script>");
		}else{
			response.setCharacterEncoding("utf8");
			PrintWriter writer = response.getWriter();
			writer.print("<script  language='javascript'>alert('原密码错误,修改失败!!');window.location.href='/Tour/Nmg/passwordupdate'; </script>");
		}		
	}
	
	@RequestMapping("managerupdate")
		//跳转到管理员个人信息页面
		public String managerupdate(HttpServletRequest request,HttpServletResponse response){
			
			HttpSession session = request.getSession();
			Manager bean = (Manager)session.getAttribute("manager");	
			request.setAttribute("bean", bean);
			return "admin/manager/managerupdate";
		}
	@RequestMapping("gonggaoadd")
	public String gonggaoadd(){
		
		return "admin/gonggao/gonggaoadd";
	}
	
	//添加新闻操作
	@RequestMapping("gonggaoadd2")
	public void gonggaoadd2(HttpServletRequest request,HttpServletResponse response) throws IOException{

		String biaoti = request.getParameter("biaoti");
		String content = request.getParameter("content");
		Gonggao bean = new Gonggao();
		bean.setBiaoti(biaoti);
		bean.setContent(content);
		bean.setCreatetime(new Date());
		gonggaoServiceImpl.insertGonggaoBean(bean);
		response.setCharacterEncoding("utf-8");response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer.print("<script  language='javascript'>alert('提交成功');window.location.href='/Tour/Nmg/gonggaolist'; </script>");
		
	}
	//新闻列表
	@RequestMapping("gonggaolist")
	public String gonggaolist(HttpServletRequest request){
		String biaoti = request.getParameter("biaoti");
		List<Gonggao> list = gonggaoServiceImpl.selectGonggaoBeanList(0,0,"");
		request.setAttribute("list", list);
		return "admin/gonggao/gonggaolist";
	}
	//删除新闻操作
	@RequestMapping("gonggaodelete")
	public void gonggaodelete(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String id = request.getParameter("id");
	
		Gonggao bean =new Gonggao();
		bean.setId(Integer.parseInt(id));
		gonggaoServiceImpl.deleteGonggaoBean(bean);
		response.setCharacterEncoding("utf-8");response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer.print("<script  language='javascript'>alert('提交成功');window.location.href='/Tour/Nmg/gonggaolist'; </script>");
		
	}
	
	//跳转到更新新闻页面
	@RequestMapping("gonggaoupdate")
	public String gonggaoupdate(HttpServletRequest request,HttpServletResponse response){

		String id = request.getParameter("id");
		Gonggao bean =gonggaoServiceImpl.selectGonggaoBean(id);
		request.setAttribute("bean", bean);
		return "admin/gonggao/gonggaoupdate";

	}
	//更新新闻操作
	@RequestMapping("gonggaoupdate2")
	public void gonggaoupdate2(HttpServletRequest request,HttpServletResponse response) throws Exception{

	String biaoti = request.getParameter("biaoti");
	String content = request.getParameter("content");
	String id = request.getParameter("id");
	Gonggao bean =gonggaoServiceImpl.selectGonggaoBean(id);
	bean.setBiaoti(biaoti);
	bean.setContent(content);
	gonggaoServiceImpl.updateGonggaoBean(bean);
	response.setCharacterEncoding("utf-8");response.setContentType("text/html; charset=utf-8");
	PrintWriter writer = response.getWriter();
	writer.print("<script  language='javascript'>alert('提交成功');window.location.href='/Tour/Nmg/gonggaolist'; </script>");
	
}
	
	//跳转到添加酒店页面
	@RequestMapping("sy_hoteladd")
	//跳转到添加酒店预定页面
		public String sy_hoteladd(HttpServletRequest request,HttpServletResponse response) throws IOException{
			String id = request.getParameter("id");
			Hotel bean =hotelServiceImpl.selectHotelBean(id);
			HttpSession session = request.getSession();
			User user = (User)session.getAttribute("user");	
			if (user == null) {
				response.setCharacterEncoding("utf-8");response.setContentType("text/html; charset=utf-8");
				PrintWriter writer = response.getWriter();
				writer.print("<script  language='javascript'>alert('请先登录');window.location.href='/Tour/Nmg/xq_hotel?id="+id+"'; </script>");
				return null ;
			}
			
			request.setAttribute("bean", bean);

			return "sy_hoteladd";
		}
	//添加酒店预定操作
	@RequestMapping("sy_hoteladd2")
		public void sy_hoteladd2(HttpServletRequest request,HttpServletResponse response) throws IOException{
			HttpSession session = request.getSession();
			User user = (User)session.getAttribute("user");	
			Integer number = Integer.parseInt(request.getParameter("number"));
			String times = request.getParameter("times");
			String id = request.getParameter("id");
			Hotel b =hotelServiceImpl.selectHotelBean(id);
			Reshotel bean=new Reshotel();
			bean.setHotel(b);
			bean.setUser(user);
			bean.setNumer(number);
			bean.setTimes(times);
			bean.setHeji(bean.getNumer()*b.getPrice());
			bean.setCreatetime(new Date());
			reshotelServiceImpl.insertReshotelBean(bean);
			response.setCharacterEncoding("utf-8");response.setContentType("text/html; charset=utf-8");
			PrintWriter writer = response.getWriter();
			writer.print("<script  language='javascript'>alert('提交成功');window.location.href='/Tour/Nmg/sy_hotel'; </script>");
			
		}
	
	
	//留言信息列表
	@RequestMapping("sy_liuyan")
	public String sy_liuyan(HttpServletRequest request,HttpServletResponse response) throws IOException{ 


	List<Liuyan> list = liuyanServiceImpl.selectLiuyanBeanList(1,1,"");
		request.setAttribute("list", list);
		return "sy_liuyan";
	}
	
	//添加留言操作
	@RequestMapping("liuyanadd")
		public void liuyanadd(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
			HttpSession session = request.getSession();
			User user = (User)session.getAttribute("user");	
			if(user==null){
				response.setCharacterEncoding("utf-8");response.setContentType("text/html; charset=utf-8");
				PrintWriter writer = response.getWriter();
				writer.print("<script  language='javascript'>alert('请先登录');" +"window.location.href='/Tour/Nmg/sy_liuyan'; </script>");
				return ;
			}
			String content = request.getParameter("content");
			Liuyan bean = new Liuyan();
			bean.setContent(content);
			bean.setUser(user);
			bean.setCreatetime(new Date());
			liuyanServiceImpl.insertLiuyanBean(bean);
			response.setCharacterEncoding("utf-8");response.setContentType("text/html; charset=utf-8");
			PrintWriter writer = response.getWriter();
			writer.print("<script  language='javascript'>alert('提交成功');window.location.href='/Tour/Nmg/sy_liuyan'; </script>");
			
		}
	//用户列表
	@RequestMapping("userlist")
	public String userlist(HttpServletRequest request,HttpServletResponse response) throws IOException{ 
	List<User> list = userServiceImpl.selectUserBeanList(1,1,"");
		request.setAttribute("list", list);
		return "admin/user/userlist";
	}
	//删除用户操作
	@RequestMapping("userdelete")
	public void userdelete(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String id = request.getParameter("id");
		User bean =new User();
		bean.setId(Integer.parseInt(id));
		Liuyan l = new Liuyan();
		Reshotel r = new Reshotel();
		l.setUser(bean);
		r.setUser(bean);
		liuyanServiceImpl.deleteLiuyanUserBean(l);
		reshotelServiceImpl.deleteReshotelUserBean(r);
		userServiceImpl.deleteUserBean(bean);
		response.setCharacterEncoding("utf8");
		PrintWriter writer = response.getWriter();
		writer.print("<script  language='javascript'>alert('提交成功');window.location.href='/Tour/Nmg/userlist'; </script>");
		
	}
	//留言列表
	@RequestMapping("liuyanlist")
	public String liuyanlist(HttpServletRequest request,HttpServletResponse response) throws IOException{ 
	List<Liuyan> list = liuyanServiceImpl.selectLiuyanBeanList(1,1,"");
		request.setAttribute("list", list);
		return "admin/liuyan/liuyanlist";
	}
	//跳转到管理员回复页面
	@RequestMapping("liuyanupdate")
	public String liuyanupdate(HttpServletRequest request,HttpServletResponse response){
		String id = request.getParameter("id");
		Liuyan bean =liuyanServiceImpl.selectLiuyanBean(id);
		request.setAttribute("bean", bean);
		return "admin/liuyan/liuyanupdate";
	
	}
	@RequestMapping("liuyanupdate2")
	public void liuyanupdate2(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String id = request.getParameter("id");
		HttpSession session = request.getSession();
		Manager manager = (Manager)session.getAttribute("manager");	
		String recontent = request.getParameter("recontent");
		Liuyan bean = liuyanServiceImpl.selectLiuyanBean(id);
		bean.setRecontent(recontent);
		bean.setManager(manager);
		bean.setRecreatetime(new Date());
		liuyanServiceImpl.updateLiuyanBean(bean);
		response.setCharacterEncoding("utf-8");response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer.print("<script  language='javascript'>alert('提交成功');window.location.href='/Tour/Nmg/liuyanlist'; </script>");
		
	}
	
	//删除留言操作
	@RequestMapping("liuyandelete")
	public void liuyandelete(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String id = request.getParameter("id");
		Liuyan bean =liuyanServiceImpl.selectLiuyanBean(id);
		liuyanServiceImpl.deleteLiuyanBean(bean);
		response.setCharacterEncoding("utf-8");response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer.print("<script  language='javascript'>alert('提交成功');window.location.href='/Tour/Nmg/liuyanlist'; </script>");
		
	}
	//留言列表
	@RequestMapping("jingdianadd")
	public String jingdianadd(){
		return "admin/jingdian/jingdianadd";

	}

	
	//添加景点操作
	@RequestMapping("jingdianadd2")
		public void jingdianadd2(@RequestParam("uploadfile") MultipartFile address,HttpServletRequest request,HttpServletResponse response) throws IOException{

			String name = request.getParameter("name");
			String content = request.getParameter("content");
			
			//上传图片
			String savepath = "d:\\tour_img\\";
			String time = Util.getTime2();
			String imgpath = time+".jpg";
			
			//视频上传
			System.out.println("comming!");
			String path = request.getSession().getServletContext().getRealPath("/images1");
			System.out.println("path>>"+path);

			
			File dir = new File(savepath,imgpath);

			if(!dir.exists()){
				dir.mkdirs();
			}
			address.transferTo(dir);


			
			
			
			/////////
			Jingdian bean = new Jingdian();
			bean.setName(name);
			bean.setContent(content);
			bean.setImgpath(imgpath);
			bean.setCreatetime(new Date());
			jingdianServiceImpl.insertBean(bean);
			response.setCharacterEncoding("utf-8");response.setContentType("text/html; charset=utf-8");
			PrintWriter writer = response.getWriter();
			writer.print("<script  language='javascript'>alert('提交成功');window.location.href='/Tour/Nmg/jingdianlist'; </script>");
			
		}
	
	//留言列表
	@RequestMapping("jingdianlist")
	public String jingdianlist(HttpServletRequest request,HttpServletResponse response){
		List<Jingdian> list = jingdianServiceImpl.selectBeanList(1,1,"");
		request.setAttribute("list", list);
		return "admin/jingdian/jingdianlist";

	}
	

	//删除景点操作
	@RequestMapping("jingdiandelete")
	public void jingdiandelete(HttpServletRequest request,HttpServletResponse response) throws IOException{

		String id = request.getParameter("id");
		Jingdian bean =jingdianServiceImpl.selectBean(id);
		jingdianServiceImpl.deleteBean(bean);
		response.setCharacterEncoding("utf-8");response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer.print("<script  language='javascript'>alert('提交成功');window.location.href='/Tour/Nmg/jingdianlist'; </script>");
		
	}
	
	//跳转到更新景点页面
	@RequestMapping("jingdianupdate")
	public String jingdianupdate(HttpServletRequest request){

		String id = request.getParameter("id");
		Jingdian bean =jingdianServiceImpl.selectBean(id);
		request.setAttribute("bean", bean);
		return "admin/jingdian/jingdianupdate";
		
	}
	
	
	//更新景点操作
	@RequestMapping("jingdianupdate2")
	public void jingdianupdate2(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String name = request.getParameter("name");
		String content = request.getParameter("content");
		
	
		String id = request.getParameter("id");
		Jingdian bean =jingdianServiceImpl.selectBean(id);
		bean.setName(name);
		bean.setContent(content);

		jingdianServiceImpl.updateBean(bean);
		response.setCharacterEncoding("utf-8");response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer.print("<script  language='javascript'>alert('提交成功');window.location.href='/Tour/Nmg/jingdianlist'; </script>");
		
	}
	
	//跳转到添加酒店页面
	@RequestMapping("hoteladd")
	public String hoteladd(){
		return "admin/hotel/hoteladd";
	
	}
	//留言列表
	@RequestMapping("hotellist")
	public String hotellist(HttpServletRequest request,HttpServletResponse response) throws IOException{ 
	List<Hotel> list = hotelServiceImpl.selectHotelBeanList(1,1,"");
		request.setAttribute("list", list);
		return "admin/hotel/hotellist";
	}
	//添加酒店操作
	@RequestMapping("hoteladd2")
		public void hoteladd2(@RequestParam("uploadfile") MultipartFile address1,HttpServletRequest request,HttpServletResponse response) throws IOException{
			String name = request.getParameter("name");
			String price = request.getParameter("price");
			String tel = request.getParameter("tel");
			String address = request.getParameter("address");
			String content = request.getParameter("content");
			//上传图片
			//上传图片
			String savepath = "d:\\tour_img\\";
			String time = Util.getTime2();
			String imgpath = time+".jpg";
			
			//视频上传
		
			String path = request.getSession().getServletContext().getRealPath("/images1");
			
			File dir = new File(savepath,imgpath);

			if(!dir.exists()){
				dir.mkdirs();
			}
			address1.transferTo(dir);
			
			Hotel bean = new Hotel();
			bean.setName(name);
			bean.setPrice(Integer.parseInt(price));
			bean.setTel(tel);
			bean.setAddress(address);
			bean.setContent(content);
			bean.setImgpath(imgpath);
			bean.setCreatetime(new Date());
			hotelServiceImpl.insertHotelBean(bean);
			response.setCharacterEncoding("utf-8");response.setContentType("text/html; charset=utf-8");
			PrintWriter writer = response.getWriter();
			writer.print("<script  language='javascript'>alert('提交成功');window.location.href='/Tour/Nmg/hotellist'; </script>");
			
		}
		
		
		
		//删除酒店操作
	@RequestMapping("hoteldelete")
		public void hoteldelete(HttpServletRequest request,HttpServletResponse response) throws IOException{
			String id = request.getParameter("id");
			Hotel bean =hotelServiceImpl.selectHotelBean(id);
			hotelServiceImpl.deleteHotelBean(bean);
			response.setCharacterEncoding("utf-8");response.setContentType("text/html; charset=utf-8");
			PrintWriter writer = response.getWriter();
			writer.print("<script  language='javascript'>alert('提交成功');window.location.href='/Tour/Nmg/hotellist'; </script>");
			
		}
		
		//跳转到更新酒店页面
	@RequestMapping("hotelupdate")
		public String hotelupdate(HttpServletRequest request,HttpServletResponse response){
			String id = request.getParameter("id");
			Hotel bean =hotelServiceImpl.selectHotelBean(id);
			request.setAttribute("bean", bean);
			return "admin/hotel/hotelupdate";
		
		}
		
		
		//更新酒店操作
	@RequestMapping("hotelupdate2")
		public void hotelupdate2(HttpServletRequest request,HttpServletResponse response) throws IOException{
			String name = request.getParameter("name");
			String price = request.getParameter("price");
			String tel = request.getParameter("tel");
			String address = request.getParameter("address");
			String content = request.getParameter("content");
			
			
			String id = request.getParameter("id");
			Hotel bean =hotelServiceImpl.selectHotelBean(id);
			bean.setName(name);
			bean.setPrice(Integer.parseInt(price));
			bean.setTel(tel);
			bean.setAddress(address);
			bean.setContent(content);
			hotelServiceImpl.updateHotelBean(bean);
			response.setCharacterEncoding("utf-8");response.setContentType("text/html; charset=utf-8");
			PrintWriter writer = response.getWriter();
			writer.print("<script  language='javascript'>alert('提交成功');window.location.href='/Tour/Nmg/hotellist'; </script>");
			
		}
	//跳转到添加旅游线路页面-------------------------
	@RequestMapping("xianluadd")
		public String xianluadd(){
			return "admin/xianlu/xianluadd";
			
		}
		
		
		//添加旅游线路操作
	@RequestMapping("xianluadd2")
		public void xianluadd2(HttpServletRequest request,HttpServletResponse response) throws IOException{
			
			String staraddress = request.getParameter("staraddress");
			String endaddress = request.getParameter("endaddress");
			String price = request.getParameter("price");
			String content = request.getParameter("content");
			
			Xianlu bean = new Xianlu();
			bean.setStaraddress(staraddress);
			bean.setPrice(Integer.parseInt(price));
			bean.setEndaddress(endaddress);
			bean.setContent(content);
			bean.setCreatetime(new Date());
			xianluServiceImpl.insertXianluBean(bean);
			response.setCharacterEncoding("utf-8");response.setContentType("text/html; charset=utf-8");
			PrintWriter writer = response.getWriter();
			writer.print("<script  language='javascript'>alert('提交成功');window.location.href='/Tour/Nmg/xianlulist'; </script>");
			
		}
		
		
		
		//删除旅游线路操作
	@RequestMapping("xianludelete")
		public void xianludelete(HttpServletRequest request,HttpServletResponse response) throws IOException{
			String id = request.getParameter("id");
			Xianlu bean =xianluServiceImpl.selectXianluBean(id);

			xianluServiceImpl.deleteXianluBean(bean);
			response.setCharacterEncoding("utf-8");response.setContentType("text/html; charset=utf-8");
			PrintWriter writer = response.getWriter();
			writer.print("<script  language='javascript'>alert('提交成功');window.location.href='/Tour/Nmg/xianlulist'; </script>");
			
		}
		
		//跳转到更新旅游线路页面
	@RequestMapping("xianluupdate")
		public String xianluupdate(HttpServletRequest request,HttpServletResponse response){
	
			String id = request.getParameter("id");
			Xianlu bean =xianluServiceImpl.selectXianluBean(id);
			request.setAttribute("bean", bean);
			return "admin/xianlu/xianluupdate";
		
		}
		
		
		//更新旅游线路操作
	@RequestMapping("xianluupdate2")
		public void xianluupdate2(HttpServletRequest request,HttpServletResponse response) throws IOException{
			String staraddress = request.getParameter("staraddress");
			String endaddress = request.getParameter("endaddress");
			String price = request.getParameter("price");
			String content = request.getParameter("content");
			String id = request.getParameter("id");
			Xianlu bean =xianluServiceImpl.selectXianluBean(id);
			bean.setStaraddress(staraddress);
			bean.setPrice(Integer.parseInt(price));
			bean.setEndaddress(endaddress);
			bean.setContent(content);
			bean.setCreatetime(new Date());
			xianluServiceImpl.updateXianluBean(bean);
			response.setCharacterEncoding("utf-8");response.setContentType("text/html; charset=utf-8");
			PrintWriter writer = response.getWriter();
			writer.print("<script  language='javascript'>alert('提交成功');window.location.href='/Tour/Nmg/xianlulist'; </script>");
			
		}
		
	@RequestMapping("xianlulist")
	public String xianlulist(HttpServletRequest request,HttpServletResponse response) throws IOException{ 
	List<Xianlu> list = xianluServiceImpl.selectXianluBeanList(1,1,"");
		request.setAttribute("list", list);
		return "admin/xianlu/xianlulist";
	}
	
	//删除预定酒店操作
	@RequestMapping("reshoteldelete2")
	public void reshoteldelete2(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String id = request.getParameter("id");
		Reshotel bean =reshotelServiceImpl.selectReshotelBean(id);
		reshotelServiceImpl.deleteReshotelBean(bean);
		response.setCharacterEncoding("utf-8");response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer.print("<script  language='javascript'>alert('提交成功');window.location.href='/Tour/Nmg/reshotellist'; </script>");
		
	}
	
	@RequestMapping("reshotellist")
	public String reshotellist(HttpServletRequest request,HttpServletResponse response) throws IOException{ 
	List<Reshotel> list = reshotelServiceImpl.selectReshotelBeanList(1,1,"");
		request.setAttribute("list", list);
		return "admin/hotel/reshotellist";
	}
	
	
}
