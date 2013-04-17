<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <link rel="stylesheet" type="text/css" href="<%=basePath %>css/index.css">
    <link href="<%=basePath %>css/ui-lightness/jquery-ui-1.10.1.custom.css" rel="stylesheet">
    <title>视频网站</title>

	
  </head>
  <body>
	<form action="userAction_login!login.action" method="post">
		<label>用户名：</label><input type="text" name="logid" class=":required :max_length;20"/><br/>
		<label>密码：</label><input type="password" name="logpass" class=":required :max_length;20"/><br/>
		<input type="submit" value="登录"/><input type="reset" value="重置"/>
	</form>
	<br/>
	<input type="text" readOnly="readOnly" class="date"/>
	<script src="<%=basePath %>js/jquery-1.9.1.js"></script>
	<script src="<%=basePath %>js/jquery-ui-1.10.1.custom.js"></script>
    <script src="<%=basePath %>js/vanadium.js"></script>
	<script src="<%=basePath %>js/validate.js"></script>
	<script type="text/javascript">
        $(function() {
        
         $(".date").datepicker();
         validate();
       	
        });

    </script>
</body>

</html>
