
function formValidation(){
		
		var emailID = document.getElementById('email').value;
		atpos=emailID.indexOf("@");
		
		dotpos=emailID.lastIndexOf(".");
		if(atpos<1 || (dotpos-atpos<2))
			{
				alert("please enter correct email id")
				document.myForm.email.focus();
				return false;
			}
		
		var password=document.getElementById('pwd').value;
		var passwordExpr=[a-zA-Z0-9];
		if(password.value.match(passwordExpr)){
			return true;
		}else{
			
			document.myForm.pwd.focus();
			return false;
		}
		
	}
