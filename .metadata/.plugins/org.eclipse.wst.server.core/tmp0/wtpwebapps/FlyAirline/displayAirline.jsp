<%@page import="com.servlet.dto.Airline"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Airline Details</title>
</head>
<body>
	<%
		Airline airline = (Airline)request.getAttribute("airline");
		out.println(airline);
	%>
	<a href='home.html'>BacktoHome</a>
</body>
</html>