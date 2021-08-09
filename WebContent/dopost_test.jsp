<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>doPost 테스트 폼</title>
</head>
<body>
	<!--  1. / 만 입력했을 때 localhost:8181 이므로
		실제 타겟 페이지와 차이점을 추가로 찾아 / 뒤에 나머지 주소를 기입해줌.
		
		 2. 타겟 페이지 주소를 모두 복사해 action에 목적지로 붙여넣기  -->
		 
	<%-- <form action="${pageContext.request.contextPath}/apple" method="post"> --%>
	<%-- <form action="<%=request.getContextPath() %>/apple" method="post"> --%>
	
	<form action="/MyFristWeb/apple" method="post">
		<input type="text" name="name"/>
		<input type="submit"/>
	</form>

</body>
</html>