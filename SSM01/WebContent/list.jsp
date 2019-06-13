<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
欢迎：${currentUserInfo.userName }

<table border="1px">
	<tr>
		<th>编号</th>
		<th>姓名</th>
		<th>密码</th>
	</tr>
	<c:forEach var="userInfo" items="${userInfoList}">
		<tr>
			<td>${userInfo.id }</td>
			<td>${userInfo.stu_name }</td>
			<td>${userInfo.stu_age }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>