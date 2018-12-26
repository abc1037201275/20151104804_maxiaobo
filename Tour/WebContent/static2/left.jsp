<%@ page language="java" import="java.util.*,com.nmg.entity.User" pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>jQuery垂直可折叠手风琴菜单 - 站长素材</title>
<link rel=stylesheet type=text/css href="/Tour/static2/css/zzsc.css"/>
<script type=text/javascript src="/Tour/static2/js/jquery.min.js"></script>
</head>
<body>
<!-- 代码 开始 -->
 <div id="firstpane" class="menu_list">
  
    <p class="menu_head">新闻管理</p>
    <div style="display:none" class=menu_body >
      <a href="/Tour/Nmg/gonggaoadd" target="rightFrame">新闻添加</a>
       <a href="/Tour/Nmg/gonggaolist" target="rightFrame">新闻信息管理</a>
    </div>
    <p class="menu_head">注册用户管理</p>
    <div style="display:none" class=menu_body >
      <a href="/Tour/Nmg/userlist" target="rightFrame">用户信息管理</a>
    </div>
    <p class="menu_head">留言管理</p>
    <div style="display:none" class=menu_body >
      <a href="/Tour/Nmg/liuyanlist" target="rightFrame">留言管理</a>
    </div>
      <p class="menu_head">景点管理</p>
    <div style="display:none" class=menu_body >
      <a href="/Tour/Nmg/jingdianadd" target="rightFrame">景点添加</a>
       <a href="/Tour/Nmg/jingdianlist" target="rightFrame">景点管理</a>
    </div>
      
     <p class="menu_head">酒店管理</p>
    <div style="display:none" class=menu_body >
      <a href="/Tour/Nmg/hoteladd" target="rightFrame">酒店添加</a>
       <a href="/Tour/Nmg/hotellist" target="rightFrame">酒店管理</a>
        
    </div>
     <p class="menu_head">旅游线路管理</p>
    <div style="display:none" class=menu_body >
      <a href="/Tour/Nmg/xianluadd" target="rightFrame">旅游线路添加</a>
       <a href="/Tour/Nmg/xianlulist" target="rightFrame">旅游线路管理</a>
      
    </div>
    
    <p class="menu_head">预定管理</p>
    <div style="display:none" class=menu_body >
     <a href="/Tour/Nmg/reshotellist" target="rightFrame">酒店预定管理</a>
    </div>
    
</div>
<script type=text/javascript>
$(document).ready(function(){
	$("#firstpane .menu_body:eq(0)").show();
	$("#firstpane p.menu_head").click(function(){
		$(this).addClass("current").next("div.menu_body").slideToggle(300).siblings("div.menu_body").slideUp("slow");
		$(this).siblings().removeClass("current");
	});
	$("#secondpane .menu_body:eq(0)").show();
	$("#secondpane p.menu_head").mouseover(function(){
		$(this).addClass("current").next("div.menu_body").slideDown(500).siblings("div.menu_body").slideUp("slow");
		$(this).siblings().removeClass("current");
	});
	
});
</script>

<!-- 代码 结束 -->

</body>
</html>