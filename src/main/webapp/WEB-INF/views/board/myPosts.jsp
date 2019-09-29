<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내 글</title>
</head>
<body align="center">
	<h1>내 글</h1>

	<c:forEach var="t" items="${loadMyPosts}">
		<p>${t.board_Number}<a href="details"> ${t.board_Title} </a>
			${t.board_Contents} ${t.board_Date} ${t.user_Name} 
			<input type="button" value="수정(미구현)" id="modify" /> 
		<input type="button" value="삭제(미구현)" id="delete" />
		</p>
	</c:forEach>
</body>
</html>