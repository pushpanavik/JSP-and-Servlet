<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Details</title>

<style>
formValidation{
margin-left: 70px;
    font-weight: bold ;
    float: left;
    clear: left;
    width: 100px;
    text-align: left;
    margin-right: 10px;
    font-family:sans-serif,bold, Arial, Helvetica;
    font-size:14px;
}
  
div { 
    box-sizing: border-box;
    width: 100%;
    border: 100px solid black;
    float: left;
    align-content: center;
    align-items: center;
}
  
form {                                        
    margin: 0 auto;
    width: 600px;
}
</style>
</head>
<body>
<form  name="UserForm" onsubmit="return formValidation()" action="cookie" method="post">
<table border style="margin: 0 auto; width:500px">

<tr><th>FirstName</th><td><input type="text" name="first" > </td></tr>
<tr><th>LastName</th><td><input type="text" name="last"> </td></tr>
<tr><th>Age </th><td><input type="text" name="age"> </td></tr>
<tr><th>Mobile Number </th> <td> <input type="text" name="phone" maxlength="10"></td></tr>
<tr><th> Address</th> <td><input type="text" name="Address"> </td></tr>
<tr><th>Email Id </th><td><input type="text" name="Email"  ></td></tr>
<tr><th> Password</th><td><input type="password" name="password" maxlength="8"></td> </tr>
<tr><td><input type="submit" ></td></tr>
</table></form>

<script>
function formValidation()                                   
{
    var first = document.forms["UserForm"]["first"]; 
    var last = document.forms["UserForm"]["last"];   
    var age = document.forms["UserForm"]["age"]; 
    var phone =  document.forms["UserForm"]["phone"]; 
    var Email =  document.forms["UserForm"]["Email"]; 
    var password = document.forms["UserForm"]["password"]; 
    var address = document.forms["UserForm"]["Address"]; 
    
    var phoneExpr=/^\d{10}$/;
    
  
    if (first.value == "")                                 
    {
        window.alert("Please enter your first name.");
        name.focus();
        return false;
    }
    if (last.value == "")                                 
    {
        window.alert("Please enter your  last name.");
        name.focus();
        return false;
    }
    if (age.value == "")                                 
    {
        window.alert("Please enter your age.");
        name.focus();
        return false;
    }
    if(age<1 && age >100)
	{
	return false;
	window.alert("please enter only numberic values for age");
	}
	else
	{
	
	return true;
	}
    if (phone.value == "")                                 
    {
        window.alert("Please enter your mobile number.");
        name.focus();
        return false;
    }
    if(phone.value.match(phoneExpr))
    	{
    	return true
    	}
    else
    	{
    	window.alert("please enter only numberic values for phone number");
    	return false;
    	}
    if (Email.value == "")                                 
    {
        window.alert("Please enter your email.");
        name.focus();
        return false;
    }
  
    if (address.value == "")                              
    {
        window.alert("Please enter your address.");
        name.focus();
        return false;
    }
      
    if (password.value == "")                                  
    {
        window.alert("Please enter a valid password.");
        email.focus();
        return false;
    }
  
    var emailID = document.getElementById('Email').value;
	atpos=emailID.indexOf("@");
	
	dotpos=emailID.lastIndexOf(".");
	if(atpos<1 || (dotpos-atpos<2))
		{
			alert("please enter correct email id")
			document.myForm.email.focus();
			return false;
		}
	
    return true;
}</script>
</body>
</html>