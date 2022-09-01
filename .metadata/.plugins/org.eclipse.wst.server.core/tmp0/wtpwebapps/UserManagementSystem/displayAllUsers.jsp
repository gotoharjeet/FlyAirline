<%@page import="com.simplilearn.hibernate.mvc.dto.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		List<User> allUsers = (List<User>)request.getAttribute("allUsers");
		for(User user : allUsers){
			out.println(user);
		}
	%>
</body>
</html>