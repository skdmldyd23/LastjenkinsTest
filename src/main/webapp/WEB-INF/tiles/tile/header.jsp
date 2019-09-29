<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body link ="black" vlink ="black" alink = "black" >
	<div align="right">
		<c:if test="${signedId == null}">
			<div>
				<a href="login" style="text-decoration: none ">SignIn</a> 
				<a href="write" style="text-decoration: none ">Write</a>
				 <a href="join" style="text-decoration: none ">Sign Up</a>
			</div>
		</c:if>
		<c:if test="${signedId != null}">
			<div>
				${signedId} ${signedName} 
				<a href="myInfo?user_Number=${signedNumber}" style="text-decoration: none ">My Info</a> 
				<a href="myPosts?board_Writer=${signedNumber}" style="text-decoration: none ">My Posts</a> 
				<a href="write" style="text-decoration: none ">Write</a>
				<a href="logout" style="text-decoration: none ">LogOut</a>
			</div>
		</c:if>
	</div>
	<h1 align="center"  >
		<a href="/" style="text-decoration: none ">header page</a>
	</h1>
</body>
</html>