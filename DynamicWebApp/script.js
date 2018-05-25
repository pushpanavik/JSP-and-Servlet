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
    	window.alert("please enter only numberic values");
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
  
    if (email.value.indexOf("@", 0) < 0)                
    {
        window.alert("Please enter a valid e-mail address.");
        email.focus();
        return false;
    }
  
    if (email.value.indexOf(".", 0) < 0)                
    {
        window.alert("Please enter a valid e-mail address.");
        email.focus();
        return false;
    }
    return true;
}</script>