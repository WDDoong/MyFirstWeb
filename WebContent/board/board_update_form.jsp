<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 수정</title>
</head>
<body>
<h1>수정창</h1>
	<form action="boardupdateok.do" method="post">
	<input type="hidden" name="bid" value="${board.bId }">
	<input type="hidden" name="bhit" value="${board.bHit }">
	<input type="hidden" name="bdate" value="${board.bDate }">
	<input type="hidden" name="bname" value="${board.bName }">
	
	<table border="1">
		<tr>
			<th>글 번호</th>
			<td>${board.bId}</td>
			<th>조회수</th>
		</tr>
		<tr>
			<th>쓴 날짜</th>
			<td>${board.bDate}</td>
			<td>${board.bHit}</td>
		</tr>
		<tr>
			<th>글 제목</th>
			<td><input type="text" name="btitle" value="${board.bTitle}"></td>
		</tr>
		<tr>
			<th>본문</th>
			<td><textarea rows="5" cols="50" name="bcontent">${board.bContent }</textarea></td>
		</tr>
		<tr>	
			<th>글쓴이</th>
			<td>${board.bName}</td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="글 수정">
				<input type="reset" value="초기화"/>
				<a href="/MyFirstWeb/boardselect.do">
					<input type="button" value="목록">
				</a>
			</td>
		</tr>
	</table>
	</form>
</body>
</html>