<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  -->

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/userInfo/login.do" method="post">

	userName:<input type="text" name="userName" value="${userInfo.userName}"/><br/>
	
	password:<input type="password" name="password" value="${userInfo.password }"><br/>
	
	<input type="submit" value="登录"/><font color="red">${errorMsg }</font>
</form>
</body>
</html>