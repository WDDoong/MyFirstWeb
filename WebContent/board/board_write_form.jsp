<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기 창</title>
</head>
<body>

	<h1>글쓰기 창</h1>

	<form action="/MyFirstWeb/boardwrite.do" method="post">
	<table border="1">
		<tr>
			<th>글 제목</th>
			<td><input type="text" name="title" size="15"/></td>
		</tr>
		<tr>
			<th>본문</th>
			<td><textarea cols="50" rows="5" name="content"></textarea></td>
		</tr>
		<tr>	
			<th>글쓴이</th>
			<td><input type="text" name="writer" size="15"></td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="글쓰기">
				<input type="submit" value="초기화">
			</td>
		</tr>
	</table>
	</form>

</body>
</html>