<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="AddUserServlet" method="post">
		First Name : <input type="text" name="firstName"/><br/>
		Last Name  : <input type="text" name="lastName"/><br/>
		User Name  : <input type="text" name="uname"/><br/>
		Password   : <input type="password" name="pword"/><br/>
		<button type="submit">Add User</button>
	</form>
</body>
</html>