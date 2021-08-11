<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 목록</title>
</head>
<body>

	<h1>게시물 목록</h1>
	
	<table border="1">
		<thead>
			<tr>
				<th>글번호</th>
				<th>글제목</th>
				<th>글쓴이</th>
				<th>쓴날짜</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>
		<tr>
		</tr>
			<c:forEach var="board" items="${boardList}" >
			<tr>
				<td>${board.bId}</td>
				<td><a href="/MyFirstWeb/boarddetail.do?bid=${board.bId}">${board.bTitle}</a></td>
				<td>${board.bName}</td>
				<td>${board.bDate}</td>
				<td>${board.bHit}</td>
			</tr>
			</c:forEach>
			
		</tbody>
	</table>
		<a href="/MyFirstWeb/board/board_write_form.jsp"><input type="submit" value="글쓰기"></a>
		
</body>
</html>