<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Form</title>
</head>

<body>
<form  onsubmit="return formValidation()" method="post" action="gologin" name="myForm">
<div>
<label>Enter Email</label>
<input type="text" id="email" name="email" required> <br>
<p id="p1"></p></div>
<div>
<label>Enter Password</label>
<input type="password" id="pwd" name="pwd"  maxlength="8" required> <br>
<p id="p2" > </p>
</div>
<div> <input type="submit" value="login"></form></div>


 <script>
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
 </script>

</body>
</html>