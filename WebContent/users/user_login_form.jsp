<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 로그인 창</title>
</head>
<body>
<h2>로그인 창</h2>
	<form action="/MyFirstWeb/login.do" method="post">
		<input type="text" name="uid" placeholder="아이디"/><br/>
		<input type="password" name="upw" placeholder="비밀번호" ><br/>
		<input type="submit" value="로그인">
	</form>
	<form action="user_join_form.jsp" method="post">
		<input type="submit" value="회원가입">
	</form>
</body>
</html>