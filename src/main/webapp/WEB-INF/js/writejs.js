console.log('write loaded')
document.getElementById('submitt').addEventListener('click',()=>{
	history.back(-1)
} );

document.getElementById('submit').addEventListener('click',()=>{
	write();
})

function write(){
	const form = document.getElementById('writeForm')
	if (form.board_Title.value == "") {
		alert("Please enter a Title")
		form.board_Title.focus();
		return false;
	}

	if (form.board_Contents.value == "") {
		alert("Please enter a Contents")
		form.board_Contents.focus();
		return false;
	}
	
	if (form.board_Contents.value.length > 200) {
		alert("You can only enter 200 characters or less.")
		form.board_Contents.focus();
		return false;
	}
}