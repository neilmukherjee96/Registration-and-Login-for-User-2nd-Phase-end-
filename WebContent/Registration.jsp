<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<div>
		<button>
			<a href="login.jsp"> Login</a>
		</button>
	</div>
	<h1>Welcome to Our Page</h1>
	<form action="registration" method="post">
		*Name: <input type="text" name="name" type="required"> <br>
		*Password:<input type="password" name="password" type="required"><br>
		<input type="submit" value="Register">
	</form>
</body>
</html>