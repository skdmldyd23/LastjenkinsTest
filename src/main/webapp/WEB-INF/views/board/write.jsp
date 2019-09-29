<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>write.jsp</title>
</head>
<body  align="center">
	<h3>${signedId}</h3>
	
	<h1>WRITE</h1>
	
	<form id="writeForm" method="post" action="/tryWrite">
		<input type="hidden" id="board_Writer" name="board_Writer" value="${signedNumber}" />
		<P>
			title <input type="text" name="board_Title" id="board_Title">
		</P>
		<br />
		<textarea rows="30" cols="160" name="board_Contents"
			id="board_Contents"></textarea>
		<br /> 
		<input type="submit" value="작성" id="submit" />
		<input type="button" value="취소" id="submitt" />

	</form>
		<script src="./javascript/writejs.js"></script>
</body>
</html>
