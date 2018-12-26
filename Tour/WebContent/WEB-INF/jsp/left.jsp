
<%@page import="com.nmg.entity.Gonggao"%>
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
<%
List<Gonggao> list = (List<Gonggao>)session.getAttribute("gonggaoList");
%>
</head>


<body>
	<!--左侧-->
	<div class="sidebar fleft">
    	
        <div class="title mt10">用户登录</div>
		<div class="contact_nr">
			<c:if test="${user==null}">
				<form action="/Tour/Nmg/ulogin" method="post"
					onsubmit="return checkform()">
					<h4>
						用户名：<input type="text" name="username" size="15" id="usernameid" />
					</h4>

					<h4>
						密&nbsp;&nbsp;&nbsp;码：<input type="password" name="password"
							size="15" id="passwordid" />
					</h4>
					<h5>
						<input style="width: 80px; height: 25px;" type="submit"
							name="submit" value="登陆" /> <input
							style="width: 80px; height: 25px;" type="reset" name="reset"
							value="重置" />
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="javascript:;"
							onClick="javascript:window.open('/Tour/Nmg/regJsp','','width=800,height=400,left=750, top=350,toolbar=no, status=no, menubar=no, resizable=yes, scrollbars=yes');return false;">新用户注册</a>
						<h5 />
				</form>

			</c:if>
			<input type="hidden" name="id" value="${bean.id }" />
			<c:if test="${user!=null  }">
				<form action="/Tour/Nmg/uloginout" method="post">
					<h4>当前用户：${user.username }</h4>
					<h4>当前状态：登录中</h4>
					<input style="width: 200px; height: 25px;" type="submit"
						name="submit" value="退出" />
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;


				</form>
			</c:if>
		</div>
<div class="title">新闻----------------------<a href="/Tour/Nmg/sy_gonggaolist">更多>></a></div>
		 <ul class="menu">
        	        <%
        for(int i=0;i<6;i++){
        Gonggao bean2 = list.get(i);
        String biaoti = bean2.getBiaoti();
        if(biaoti.length()>13){
        	biaoti=biaoti.substring(0, 12)+">>";
        }
        %>
            <li><a href="/Tour/Nmg/xq_gonggao?id=<%=bean2.getId() %>" ><%=biaoti %></a></li>

              <% 
        }
        %>

        </ul>
	</div>
<script src="/Tour/static/js/all.js" type="text/javascript"></script>
</body>
</html>