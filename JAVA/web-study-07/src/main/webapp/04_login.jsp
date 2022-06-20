<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL과 JSTL</title>
</head>
<body>
	<form method="get" action="04_testLogin.jsp">
		<label for="userid">아이디 : </label>
		<input type="text" name="userid" id="userid">
		
		<label for="pwd">비밀번호 : </label>
		<input type="password" name="pwd" id="userid">
		
		<input type="submit" value="로그인">
	</form>
</body>
</html>