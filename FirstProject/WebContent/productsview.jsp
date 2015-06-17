<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h1>Product Records</h1></center>
<table border=2>
<tr><th>productid</th><th>productname</th><th>productprice</th><th>productdesc</th>
<c:forEach items="${products}" var="prod">
<tr>
<td>${prod.productId}</td>
<td>${prod.productName}</td>
<td>${prod.productPrice}</td>
<td>${prod.productDesc}</td></tr></c:forEach></table>
</body>
</html>
