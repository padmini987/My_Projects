<%@ page import="income.Login" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HomePage</title>
</head>
<body>
<center><h2>Home Page</h2></center>
<h5>welcome, <%= ((Login)session.getAttribute("user")).getUsername() %></h5>

<h6><a href="Logout.jsp">Logout</a></h6>
</body>
</html>

