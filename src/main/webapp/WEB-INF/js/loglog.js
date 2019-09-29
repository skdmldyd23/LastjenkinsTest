function secLogIn(form) {
	var exptext = /^[A-Za-z0-9_\.\-]+@[A-Za-z0-9\-]+\.[A-Za-z0-9\-]+/;
	var msg, ss, cc;

	if (document.logInForm.user_ID.value == "") {
		alert("아이디를 입력하지 않았습니다.")
		logInForm.ID.focus();
		return false;
	}

	// 아이디에 공백 사용하지 않기
	if (document.logInForm.user_ID.value.indexOf(" ") >= 0) {
		alert("아이디에 공백을 사용할 수 없습니다.")
		document.logInForm.ID.focus();
		document.logInForm.ID.select()
		return false;
	}

	// 비밀번호 입력여부 체크
	if (document.logInForm.user_PW.value == "") {
		alert("비밀번호를 입력하지 않았습니다.")
		document.logInForm.PASSWORD.focus();
		return false;
	}

	return true;

}