<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="rs" method="post" >
			<table style="with: 50%">
				<tr>
					<td>First Name</td>
					<td><input type="text" name="first_name" required/></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="last_name" required/></td>
				</tr>
				<tr>
					<td>UserName</td>
					<td><input type="text" name="username"  minlength="4" maxlength="10" required/></td>
				</tr>
					<tr>
					<td>Password</td>
					<td><input type="password" name="password" minlength="4" maxlength="8" required/></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address"  minlength="10" maxlength="30"required/></td>
				</tr>
				<tr>
					<td>Contact No</td>
					<td><input type="text" name="contact"  minlength="10" required/></td>
				</tr></table>
			<input type="submit" value="Submit" required/></form>
			
</body>
</html>