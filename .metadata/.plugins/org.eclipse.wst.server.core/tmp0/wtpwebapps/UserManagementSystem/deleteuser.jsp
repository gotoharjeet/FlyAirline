<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Enter user id to be deleted</h2>
	<form action="DeleteUserServlet" method="post">
		User Id : <input type="text" name="userid"/><br/>
		<button type="submit">Delete User</button>
	</form>
</body>
</html>