<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h2 align="center">Test Page</h2>
	<%= new Date()  %>
	<br>
	<a href="login">Login Servlet</a>
	<br>
	<a href="second">Second Generic Servlet</a>
</body>
</html>