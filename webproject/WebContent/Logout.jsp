<%@ page import="income.Login" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LogOut</title>
</head>
<body>
<h4>You have logged out successfully</h4>
<%
session.invalidate();
%>

<%
	try{
		((Login)session.getAttribute("user")).getUsername();
	}catch(IllegalStateException e) {
		out.println("<h5>User is loggedout</h5>");
	}
%>
</body>
</html>