<%@page import="com.nmg.entity.Manager"%>
<%@ page language="java" import="java.util.* " pageEncoding="UTF-8"%>
<% 
Manager manager = (Manager) session.getAttribute("manager");
if (manager==null){
	response.sendRedirect("/Tour/Nmg/loginIndex"); 
	return;
}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
</head>

<frameset rows="83,*" cols="*" framespacing="0" frameborder="no" border="0">
  <frame src="/Tour/static2/top.jsp" name="topFrame" scrolling="no" noresize="noresize" id="topFrame" /> 
  <frame src="/Tour/static2/center.jsp" name="mainFrame" id="mainFrame" /> 
</frameset>

<noframes><body>
</body>
</noframes></html>








