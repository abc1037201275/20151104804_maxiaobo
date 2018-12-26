<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>无标题文档</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
.STYLE1 {font-size: 12px}
.STYLE3 {font-size: 12px; font-weight: bold; }
.STYLE4 {
	color: #03515d;
	font-size: 12px;
}
-->
</style>

</head>

<body>

<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
  
    <td height="30" background="/Tour/static2/images/tab_05.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="12" height="30"><img src="/Tour/static2/images/tab_03.gif" width="12" height="30" /></td>
        <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="46%" valign="middle"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="95%" class="STYLE1"><span class="STYLE3"></span>注册用户信息列表</td>
              </tr>
            </table></td>
         
            
          </tr>
        </table></td>
        <td width="16"><img src="/Tour/static2/images/tab_07.gif" width="16" height="30" /></td>
      </tr>
    </table></td>
  </tr>
  
  <tr>
    <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="8" background="/Tour/static2/images/tab_12.gif">&nbsp;</td>
        <td><table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="b5d6e6" >
          <tr>
           
            <td width="auto" height="22" background="/Tour/static2/images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">用户名</span></div></td>
            <td width="auto" height="22" background="/Tour/static2/images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">密码</span></div></td>
              <td width="auto" height="22" background="/Tour/static2/images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">真实姓名</span></div></td>
                <td width="auto" height="22" background="/Tour/static2/images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">手机号</span></div></td>
                  <td width="auto" height="22" background="/Tour/static2/images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">籍贯</span></div></td>
                    <td width="auto" height="22" background="/Tour/static2/images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">家庭地址</span></div></td>
                      <td width="auto" height="22" background="/Tour/static2/images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">性别</span></div></td>
                        <td width="auto" height="22" background="/Tour/static2/images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">年龄</span></div></td>
                        <td width="auto" height="22" background="/Tour/static2/images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">邮箱</span></div></td>
            <td width="auto" height="22" background="/Tour/static2/images/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">添加时间</span></div></td>
            <td width="auto" height="22" background="/Tour/static2/images/bg.gif" bgcolor="#FFFFFF" class="STYLE1"><div align="center">基本操作</div></td>
          </tr>
          <c:forEach items="${list}" var="bean">
          <tr>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">${bean.username }</span></div></td>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">${bean.password } </span></div></td>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">${bean.truename }</span></div></td>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">${bean.telephone }</span></div></td>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">${bean.jiguan }</span></div></td>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">${bean.address }</span></div></td>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">${bean.xingbie }</span></div></td>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">${bean.age }</span></div></td>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">${bean.email }</span></div></td>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">${bean.createtime }</span></div></td>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE4">
            <img src="/Tour/static2/images/del.gif" width="16" height="16" /><a href="/Tour/Nmg/userdelete?id=${bean.id}">删除</a>
            </span></div></td>
          </tr>
          </c:forEach>
        </table></td>
        <td width="8" background="/Tour/static2/images/tab_15.gif">&nbsp;</td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="35" background="/Tour/static2/images/tab_19.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="12" height="35"><img src="/Tour/static2/images/tab_18.gif" width="12" height="35" /></td>
        <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td class="STYLE4">&nbsp;&nbsp;${pagerinfo }</td>
           
          </tr>
        </table></td>
        <td width="16"><img src="/Tour/static2/images/tab_20.gif" width="16" height="35" /></td>
      </tr>
    </table></td>
  </tr>
</table>
</body>
</html>
