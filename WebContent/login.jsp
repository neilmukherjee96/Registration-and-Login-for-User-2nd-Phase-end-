<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<div>
		<button>
			<a href="Registration.jsp">Register </a>
		</button>
	</div>
	<h1>Login Page</h1>
	<form action="login" method="post">
		*Name: <input type="text" name="name" type="required"> <br>
		*Password:<input type="password" name="password" type="required"><br>
		<input type="submit" value="Login">
	</form>
</body>
</html>