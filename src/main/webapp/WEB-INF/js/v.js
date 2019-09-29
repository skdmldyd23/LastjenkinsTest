console.log('loaded');
const log = console.log;

document.getElementById('submitt').addEventListener('click',()=>{
	history.back(-1)
} );
window.onload = function(){ 	
	document.getElementById('submittt').addEventListener('click',()=>{
		if(sendIt()){
			document.getElementById('f').submit();
		}
	}) 
}


function sendIt() {


	const form = document.getElementById('f')

	
	var email = form.user_Email.value;
	var exptext = /^[A-Za-z0-9_\.\-]+@[A-Za-z0-9\-]+\.[A-Za-z0-9\-]+/;
	var msg, ss, cc;
	
	if (form.user_ID.value == "") {
		alert("Please enter id")
		f.user_ID.focus();
		return false;
	}

	for (var i = 0; i < form.user_ID.value.length; i++) {
		ch = form.user_ID.value.charAt(i)
		if (!(ch >= '0' && ch <= '9') && !(ch >= 'a' && ch <= 'z')
				&& !(ch >= 'A' && ch <= 'Z')) {
			alert("ID can only be entered in upper and lower case letters and numbers.")
			form.user_ID.focus();
			form.user_ID.select();
			return false;
		}
	}

	if (form.user_ID.value.indexOf(" ") >= 0) {
		alert("ID cannot contain spaces.")
		form.user_ID.focus();
		form.user_ID.select()
		return false;
	}
	if (form.user_ID.value.length < 4 || form.user_ID.value.length > 12) {
		alert("You can enter up to 4 ~ 12 letters.")
		form.user_ID.focus();
		form.user_ID.select();
		return false;
	}
	if (form.user_PW.value == "") {
		alert("Please enter PW")
		form.user_PW.focus();
		return false;
	}

	if (f.user_PW.value == f.user_ID.value) {
		alert("Identical username and password")
		form.user_PW.focus();
		return false;
	}

	if (form.user_PW.value.length < 4
			|| form.user_PW.value.length > 12) {
		alert("You can enter up to 4 ~ 12 letters.")
		form.user_PW.focus();
		form.user_PW.select();
		return false;
	}
	if (form.user_PW.value != form.user_PW1.value) {
		alert("Passwords do not match.")
		form.user_PW1.value = ""
		form.user_PW1.focus();
		return false;
	}

	if (form.user_Email.value == "") {
		alert("Please enter E-Mail")
		document.user_Email.focus();
		return false;
	}
	if (exptext.test(email) == false) {
		alert("The email is not formatted correctly.");
		document.addjoin.email.focus();
		return false;
	}


	if (form.user_Name.value == "") {
		alert("Please enter Name")
		form.user_Name.focus();
		return false;
	}

	if (form.user_Name.value.length < 2) {
		alert("Please write at least two characters in the name.")
		form.user_Name.focus();
		return false;
	}

	if (form.user_postcode.value == "") {
		alert("Please enter an address.")
		return false;
	}

	if (form.user_detailAddress.value < 2) {
		alert("Please enter a street address.")
		form.user_detailAddress.focus();
		return false;
	}

	return true;
}
