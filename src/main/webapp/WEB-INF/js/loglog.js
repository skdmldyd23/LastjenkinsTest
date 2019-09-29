function secLogIn(form) {
	var exptext = /^[A-Za-z0-9_\.\-]+@[A-Za-z0-9\-]+\.[A-Za-z0-9\-]+/;
	var msg, ss, cc;

	if (document.logInForm.user_ID.value == "") {
		alert("Please enter id")
		logInForm.ID.focus();
		return false;
	}

	if (document.logInForm.user_ID.value.indexOf(" ") >= 0) {
		alert("Please enter PW")
		document.logInForm.ID.focus();
		document.logInForm.ID.select()
		return false;
	}

	// 비밀번호 입력여부 체크
	if (document.logInForm.user_PW.value == "") {
		alert("You have not entered a password.")
		document.logInForm.PASSWORD.focus();
		return false;
	}

	return true;

}