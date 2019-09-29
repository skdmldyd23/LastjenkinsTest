console.log('write loaded')
document.getElementById('submitt').addEventListener('click',()=>{
	history.back(-1)
} );

document.getElementById('submit').addEventListener('click',()=>{
	console.log("ssss");
	write();
})

function write(){
	const form = document.getElementById('writeForm')
	console.log("제목시벌:",form.board_Title.value)
	if (form.board_Title.value == "") {
		alert("제목을 입력하세요.")
		form.board_Title.focus();
		return false;
	}

	if (form.board_Contents.value == "") {
		alert("내용을 입력하세요.")
		form.board_Contents.focus();
		return false;
	}
	
	if (form.board_Contents.value.length > 200) {
		alert("느므 길다. 200자 이하로 써라")
		form.board_Contents.focus();
		return false;
	}
}