<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 유저 회원가입</title>
</head>
<body>
<h2>회원가입</h2>
	<form action="/MyFirstWeb/join.do" method="post">
		<input type="text" name="uid" placeholder="아이디"><br/>
		<input type="password" name="upw" placeholder="비밀번호"><br/>
		<input type="text" name="uname" placeholder="이름"><br/>
		<input type="email" name="email" placeholder="email"><br/>
		<input type="submit" value="가입하기">
	</form>
</body>
</html>