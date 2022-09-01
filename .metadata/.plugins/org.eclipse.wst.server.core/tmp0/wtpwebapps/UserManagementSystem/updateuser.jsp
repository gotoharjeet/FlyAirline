<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Enter following details to update the User</h2>
	<form action="UpdateUserServlet" method="post">
		User Id : <input type="text" name="userid"/><br/>
		Password : <input type="password" name="pword"/><br/>
		<button type="submit">Update User</button>
	</form>
</body>
</html>