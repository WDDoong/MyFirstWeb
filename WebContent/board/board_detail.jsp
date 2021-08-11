<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 조회</title>
</head>
<body>
	<h2>글 조회</h2>
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
				<td>${board.bTitle}</td>
			</tr>
			<tr>
				<th>본문</th>
				<td><textarea rows="5" cols="50" name="conctent" readonly>${board.bContent }</textarea></td>
			</tr>
			<tr>	
				<th>글쓴이</th>
				<td>${board.bName}</td>
			</tr>
			<tr>
				<td>
				<a href="/MyFirstWeb/boardselect.do"><input type="button" value="목록"></a>
				</td>
				<td>
				<form action="/MyFirstWeb/boardupdate.do" method="post">
					<input type="hidden" id="bid" name="bid" value="${board.bId }"/>
					<input type="submit" value="수정">
				</form>
				</td>
				<td>
				<form action="/MyFirstWeb/boarddelete.do" method="post">
					<input type="hidden" id="bid" name="bid" value="${board.bId }"/>
					<input type="submit" value="삭제">
				</form>
				</td>
			</tr>
		</table>
</body>
</html>