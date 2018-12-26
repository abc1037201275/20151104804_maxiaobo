<%@page import="com.nmg.entity.Jingdian"%>
<%@page import="com.nmg.dao.JingdianDao"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort();
%>
<!doctype html>
<html lang="zh-cn">
<head>
<meta charset="utf-8">
<title></title>
<meta name="description" content="[!--pagedes--]" />
<meta name="keywords" content="[!--pagekey--]" />
<link href="/Tour/static/css/master.css" type="text/css" rel="stylesheet" />
<link href="/Tour/static/css/base.css"type="text/css" rel="stylesheet" />
<script type="text/javascript" src="/Tour/static/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="/Tour/static/js/jquery.SuperSlide.2.1.1.js"></script>
<%

	//将景点信息显示在主页面
	List<Jingdian> list = (List<Jingdian>)request.getAttribute("list"); 
		
%>
</head>
<body>
	<jsp:include page="top.jsp"></jsp:include> 

	<div class="main clearfix ofHidden block yh">

		<!--左侧-->
 		<jsp:include page="left.jsp"></jsp:include> 

		<!--右侧-->
		<!--右侧-->
		<div class="main_right fright">
			<div class="title clearfix">
				<font class="yh f16">景点</font>
			</div>
			<ul class="clearfix pic_list">
				<%
					for (Jingdian bean : list) {
				%>
				<li>
					<a href="/Tour/Nmg/xq_jingdian?id=<%=bean.getId()%>" class="pic">
					<!-- 显示景点图片 -->
					<img src="/photo/<%=bean.getImgpath()%>"></a>
				<p>
					<a><%=bean.getName()%></a>
				</p>
				</li>
				<%
					}
				%>
			</ul>


		</div>



	</div>

	<jsp:include page="down.jsp"></jsp:include>


	<script src="/Tour/static/js/all.js" type="text/javascript"></script>
</body>
</html>