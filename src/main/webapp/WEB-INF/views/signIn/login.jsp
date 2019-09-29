<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>로그인</title>
</head>
<script src="./javascript/loglog.js"></script>

<body  align="center">
	<form name="logInForm" action="/tryLogin" method="post"
		onsubmit="return secLogIn()">
		<h3>
			ID<input type="text" placeholder="ID" name="user_ID" />
		</h3>
		<h3>
			PASSWORD<input type="text" placeholder="PASSWORD" name="user_PW" />
		</h3>
		<input type="submit" value="접속" /> <br />
	</form>

	<a href="join">회원가입</a>
	<a href="findacc">ID/PW 찾기 (미구현)</a>
</body>
</html>
