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
    	<div class="title clearfix"><font class="yh f16">用户留言</font><span class="fright f12">网站首页 > <a href="#">用户留言</a></span></div>
    	
        <div class="newsnr">
        
        <c:forEach items="${list}" var="bean">
         <table width="100%" border="1"  cellpadding="0" cellspacing="0" style="background-color: #b9d8f3;">
         <tr style="text-align: center; COLOR: #0076C8; BACKGROUND-COLOR: #F4FAFF; font-weight: bold">
         <td width="30%">
         用户：${bean.user.username } <p/>留言时间： ${fn:substring(bean.createtime,0, 16)}</td><td width="70%">${bean.content }
         </td>
         </tr>
         <tr style="text-align: center; ">
         <c:if test="${bean.manager!=null}">
        <td width="30%">
         管理员：${bean.manager.username } <p/>回复时间： ${fn:substring(bean.recreatetime,0, 16)}</td><td width="70%">${bean.recontent }
         </td>
        </c:if> 
         </tr>
         </table>
         <br/>
       </c:forEach>

      <form action="/Tour/Nmg/liuyanadd" method="post"  onsubmit="return checkform()">
      <div class="nr" align="center">
        <p style="text-indent: 2em"><textarea align="left" style="width:80%;" cols="20" rows="5"  name="content" id="contentid" ></textarea></p>
         
         <div align="right">
         &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
          <input style="width:80px; height:25px;" type="submit" value="提交">
           <input style="width:80px; height:25px;" type="reset" value="重置">
         </div>
       </div>
      </form>
     
  </div>       
    </div>
</div>
<jsp:include page="down.jsp"></jsp:include>
<script src="/Tour/static/js/all.js" type="text/javascript"></script>

</body>
</html>