<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
  </head>
  <div align="center">
  <form action="${pageContext.request.contextPath}/Servlet_C" method="post">
    <table border=1>
      <tr>
        <td>用户名：</td>
        <td><input type="text" name="user"></td>
      </tr>
      <tr>
        <td>密码：</td>
        <td><input type="password" name="psd"></td>
      </tr>
      <tr>
        <td colspan=2><input type="submit" value="提交" name="submit"></td>
      </tr>
    </table>
  </form>
  </div>
  <body>
    
  </body>
</html>
