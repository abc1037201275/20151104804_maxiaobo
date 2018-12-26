<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
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

</head>


<body>
<jsp:include page="top.jsp"></jsp:include>

<div class="main clearfix ofHidden block yh">

	<!--左侧-->
	<jsp:include page="left.jsp"></jsp:include>

	<!--右侧-->
    <div class="main_right fright">
    	<div class="title clearfix"><font class="yh f16">服务指南</font><span class="fright f12">网站首页 > <a href="#">服务指南</a></span></div>
    	 <c:forEach items="${list}" var="bean">
    	<ul class="text_list">
        <li>> <span>${bean.createtime }</span><a href="method!xq_guide?id=${bean.id }">${bean.biaoti } </a></li>
      </ul>
      </c:forEach>
        <div class="page clearfix">${pagerinfo }</div>
        
    </div>



</div>


<jsp:include page="down.jsp"></jsp:include>


<script src="/Tour/static/js/all.js" type="text/javascript"></script>
</body>
</html>