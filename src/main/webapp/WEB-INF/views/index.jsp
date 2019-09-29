
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>index.jsp</title>
</head>
<body  align="center">
	<h1>INDEX</h1>

	<P>안녕!</P>

	<%-- <c:forEach var="t" items="${test}">
 <p>${t.user_Number} ${t.user_ID} 
 ${t.user_PW} ${t.user_Name} 
 ${t.user_Email} ${t.user_postcode}
 ${t.user_roadAddress} ${t.user_jibunAddress}</p>
</c:forEach> --%>

	<c:forEach var="t" items="${boardtest}">
		<p>${t.board_Number}<a href="details" style="text-decoration: none "> ${t.board_Title} </a>
			${t.board_Contents} ${t.board_Date} ${t.user_Name}
		</p>
	</c:forEach>
</body>
</html>
