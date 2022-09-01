<%@page import="com.servlet.dto.Place_Airport"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Place_Airport place_airport = (Place_Airport)request.getAttribute("place_airport");
		out.println(place_airport);
	%>
	<a href='home.html'>BacktoHome</a>
</body>
</html>