<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<div style="margin-top:10% ; margin-left:40%">
<table>
	<form action="loginServlet" method="post">
		<tr><td><input type="text" name="userid" placeholder="Enter your Emp ID" ></td></tr>
		<tr><td><input type="password" name="userpwd" placeholder="Enter your Password" ></td></tr>
		<tr><td align="center"><input type="submit" name="login" value="login"></td></tr>
	</form>
</table>
</div>
</body>
</html>