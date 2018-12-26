<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%
	String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>
<!doctype html>
<html lang="zh-cn">
<head>
<meta charset="utf-8">
<title></title>
<meta name="description" content="[!--pagedes--]" />
<meta name="keywords" content="[!--pagekey--]" />
<link href="/Tour/static/css/master.css" type="text/css" rel="stylesheet" />
<link href="/Tour/static/css/base.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="/Tour/static/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="/Tour/static/js/jquery.SuperSlide.2.1.1.js"></script>
  <script type="text/javascript" src="<%=path %>/js/popup.js"></script>
  <script language="JavaScript" src="<%=path %>/js/public.js" type="text/javascript"></script>
 <script type="text/javascript">
	   function up()
		    {
		        var pop=new Popup({ contentType:1,isReloadOnClose:false,width:400,height:200});
	            pop.setContent("contentUrl","<%=path %>/upload/upload.jsp");
	            pop.setContent("title","文件上传");
	            pop.build();
	            pop.show();
	            //另一红上传方式可以参照进销存
		    }
	</script>
</head>


<body>
<jsp:include page="top.jsp"></jsp:include>

<div class="main clearfix ofHidden block yh">
  <input type="hidden" name="id" value="${bean.id }"/>
	<!--左侧-->
	<jsp:include page="left.jsp"></jsp:include>

	<!--右侧-->
    <div class="main_right fright">
    	<div class="title clearfix"><font class="yh f16">酒店预定</font><span class="fright f12">网站首页 > <a href="#">酒店预定</a></span></div>
    	
        <div class="newsnr">
        
       
         <table width="100%" border="1"  cellpadding="0" cellspacing="0" style="background-color: #b9d8f3;">
         <tr style="text-align: center; ">
         <td >酒店名称</td>
         <td >地址</td>
         <td >单价（元/日）</td>
         <td >预定用户</td>
         <td >预定天数</td>
         <td >预定日期</td>
         <td >合计费用</td>
         <td >添加时间</td>
           <td >操作</td>
         </tr>
        
          <c:forEach items="${list}" var="bean">
        
          <tr style="text-align: center; COLOR: #0076C8; BACKGROUND-COLOR: #F4FAFF; font-weight: bold">
        <td > ${bean.hotel.name }</td>
        <td > ${bean.hotel.address }</td>
        <td > ${bean.hotel.price }</td>
        <td > ${bean.user.username }</td>
        <td > ${bean.numer }</td>
        <td > ${bean.times }</td>
        <td > ${bean.heji }</td>
        <td > ${bean.createtime }</td>
        <td > <a href="/Tour/Nmg/reshoteldelete?id=${bean.id}">删除</a></td>
         </tr>
          </c:forEach>
         </table>
         <br/>
      
       <div>${pagerinfo }</div>
 
  </div>       
    </div>
</div>
<jsp:include page="down.jsp"></jsp:include>
<script src="/Tour/static/js/all.js" type="text/javascript"></script>

</body>
</html>