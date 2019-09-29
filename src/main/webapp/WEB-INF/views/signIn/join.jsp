<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>회원가입</title>
</head>
<script
	src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>

<body  align="center">

	<form name="f" id="f" method="post" action="/insertAccount">
		<h1>회원가입</h1>
		<h3>ID (4~12자)</h3>
		<input type="text" placeholder="ID" name="user_ID" />
		<h3>PASSWORD (4~8자)</h3>
		<input type="password" placeholder="PASSWORD" name="user_PW" />
		<h3>PASSWORD 확인</h3>
		<input type="password" placeholder="똑같이 입력" name="user_PW1" />
		<h3>NAME</h3>
		<input type="text" placeholder="이름" name="user_Name" />
		<h3>E-MAIL</h3>
		<input type="text" placeholder="wjdwldnjs@namver.com" name="user_Email" /> <br />
		
		<h3>ADDRESS</h3>
		<input type="text" id="postcode" name="user_postcode" placeholder="우편번호" readonly> 
		<input type="button" id="postCodeBtn" value="우편번호 찾기"> <br> 
		<input type="text" id="roadAddress" name="user_roadAddress" placeholder="도로명주소" readonly>
		<input type="text" id="jibunAddress" name="user_jibunAddress"placeholder="지번주소" readonly> 
		<span id="guide" style="color: #999; display: none"> </span>
		<input type="text" id="detailAddress" name="user_detailAddress" placeholder="상세주소">
		<input type="text" id="extraAddress" name="user_extraAddress" placeholder="참고항목"> <br /> 
		<input type="button" value="가입" id="submittt"  />
		<input type="button" value="취소" id="submitt" />
	</form>
	<script src="./javascript/post.js"></script>
	<script src="./javascript/v.js"></script>
	
</body>
</html>
