<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sigin</title>
</head>
<body>
You signed in successfully.
Welcome ${name}!!!
<p>Your to-do list:</p>
<form action="/list" method="post">
	
	<p>1. <input type="text" name="work1"/></p>
	<p>2. <input type="text" name="work2"/></p>
	<p>3. <input type="text" name="work3"/></p>
	<p><input type="submit" name="save"/></p>
</form>
</body>
</html>