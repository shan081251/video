<%@ page language="java" import="java.util.*,pojo.User" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>视频网站</title>

	
  </head>
  <body>
  <%
  	User u=(User)session.getAttribute("user");
   %>
	你好：<%=u.getUsername() %>
</body>
</html>
