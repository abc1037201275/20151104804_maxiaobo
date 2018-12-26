<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
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
<form action="/Tour/Nmg/hotelupdate2" method="post"  onsubmit="return checkform()" enctype="multipart/form-data">
<input type="hidden" name="id" value="${bean.id }"/>
<table width="70%" border="0" cellspacing="0" cellpadding="0">
  <tr>
  
    <td height="30" background="/Tour/static2/images/tab_05.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="12" height="30"><img src="/Tour/static2/images/tab_03.gif" width="12" height="30" /></td>
        <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="46%" valign="middle"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="95%" class="STYLE1"><span class="STYLE3"></span>酒店信息修改</td>
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
        <td><table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="b5d6e6" onmouseover="changeto()"  onmouseout="changeback()">   
          
             <tr>
            <td width="auto" height="22"  bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">酒店名称</span></div></td>
            <td width="auto" height="22"  bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">
            <input style="width:50%"  type="text" name="name" id="nameid" value="${bean.name }"/>
            </span></div></td>
          </tr>
          
          <tr>
            <td width="auto" height="22"  bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">单价（元/日）</span></div></td>
            <td width="auto" height="22"  bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">
            <input style="width:50%"  type="text" name="price" id="priceid" value="${bean.price }"/>
            </span></div></td>
          </tr>
          
         <tr>
            <td width="auto" height="22"  bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">酒店联系电话</span></div></td>
            <td width="auto" height="22"  bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">
            <input style="width:50%"  type="text" name="tel" id="telid" value="${bean.tel }"/>
            </span></div></td>
          </tr>
          
          <tr>
            <td width="auto" height="22"  bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">酒店地址</span></div></td>
            <td width="auto" height="22"  bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">
            <input style="width:50%"  type="text" name="address" id="addressid" value="${bean.address }"/>
            </span></div></td>
          </tr>
         
          
          <tr>
            <td width="auto" height="22"  bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">酒店描述</span></div></td>
            <td width="auto" height="22"  bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">
             <textarea style="width:70%" cols="30" rows="5" class="STYLE6" name="content" id="contentid" >${bean.content }</textarea>
            </span></div></td>
          </tr>
          
      
          
         

         
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
            <td width="100%" class="STYLE4" height="22"  bgcolor="#FFFFFF"><div align="center">
           <input type="submit" value="提交"/>
           <input  onclick="javascript:history.go(-1);"  type="button" value="返回" />
            </div></td>
          </tr>
          
        </table></td>
        <td width="16"><img src="/Tour/static2/images/tab_20.gif" width="16" height="35" /></td>
      </tr>
    </table></td>
  </tr>
</table>
</form>
</body>
</html>
