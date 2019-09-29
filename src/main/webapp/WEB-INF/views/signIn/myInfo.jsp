<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>내 정보</title>
</head>
<body  align="center">

	<form id ="f" name="f" method="post">
		<h1>내정보</h1>
		<h3>
			ID<br/>
			<input type="text" placeholder="ID" name="user_ID" value="${user_ID}" readonly>
		</h3>
		
		<h3>
			이름 <br/>
			<input type="text" placeholder="Name" name="user_Name" value="${user_Name}" readonly>
		</h3>

		<h3>
			이멩<br/>
			<input type="text" placeholder="Email" name="user_Email" value="${user_Name}" readonly>
		</h3>
		<h3>ADDRESS</h3>
		<input type="text" id="postcode" name="user_postcode" placeholder="우편번호" readonly> 
		<input type="text" id="roadAddress" name="user_roadAddress" placeholder="도로명주소" readonly>
		<input type="text" id="jibunAddress" name="user_jibunAddress"placeholder="지번주소" readonly> 
		<span id="guide" style="color: #999; display: none"> </span>
		<input type="text" id="detailAddress" name="user_detailAddress" placeholder="상세주소" readonly>
		<input type="text" id="extraAddress" name="user_extraAddress" placeholder="참고항목" readonly> <br /> 
		<input type="button" value="돌아가기" id="submitt" />
	</form>
	<script src="./javascript/v.js"></script>
</body>
</html>