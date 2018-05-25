<%@ page language="java" contentType="text/html; charset=UTF-8"
    %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%
 HttpSession httpSession = request.getSession();
String s=(String)httpSession.getAttribute("UserName"); 
out.print(s);
%>

</body>
<%=s %>
</html>