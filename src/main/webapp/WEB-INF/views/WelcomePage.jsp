<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>To Do List</title>
</head>
<body>
	<%java.util.Date date = new java.util.Date(); %>
	Welcome to My First WebApp ${n}
	Current date is <%=date %>
	<form action="/welcome" method="post">
	${error}
	Enter your name <input type="text" name="name"/> and Password <input type="password" name="password"/><input type="submit"value="login"/> 
	</form>
</body>
</html>