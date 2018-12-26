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
  <script type="text/javascript" src="/Tour/static/js/My97DatePicker/WdatePicker.js"></script>
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
  
	<!--左侧-->
	<jsp:include page="left.jsp"></jsp:include>

	<!--右侧-->
    <div class="main_right fright">
    	<div class="title clearfix"><font class="yh f16">酒店预定</font><span class="fright f12">网站首页 > <a href="#">酒店预定</a></span></div>
    	
        <div class="newsnr">
        
      <form action="/Tour/Nmg/sy_hoteladd2" method="post"  onsubmit="return checkform()">
      <input type="hidden" name="id" value="${bean.id }"/>
      <div class="nr" align="center">
        
        <p style="text-indent: 2em">预定天数:&nbsp; &nbsp; <input style="width:50%;height:30px;" type="text" name="number" id="numberid"></p>
        <p style="text-indent: 2em">预定日期:&nbsp; &nbsp; <input type="text" name="times" id="timesid" onfocus="WdatePicker({isShowWeek:true})"><img onclick="WdatePicker({el:'d12'})" src="/Tour/static/js/My97DatePicker/skin/datePicker.gif" width="16" height="22" align="absmiddle"></p>
      <div align="right">
         &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
          <input style="width:80px; height:25px;" type="submit" value="提交">
           <input style="width:80px; height:25px;" onclick="javascript:history.go(-1);"  type="button" value="返回" />
         </div>
       </div>
      </form>
  </div>       
    </div>
</div>
<jsp:include page="down.jsp"></jsp:include>
<script src="/Tour/static/js/all.js" type="text/javascript"></script>
<script language="javascript" type="text/javascript">

function checkform()
{
	 
	 if (document.getElementById('numberid').value=="")
	{
		alert("预定天数不能为空");
		return false;
	}
	var valid=/^\d*$/;
	if(!valid.test(document.getElementById('numberid').value)){
		alert("预定天数必须是数字");
		return false;
	}
	 
	 if (document.getElementById('timesid').value=="")
	{
		alert("预定日期不能为空");
		return false;
	}

	return true;
	
}
</script>
</body>
</html>