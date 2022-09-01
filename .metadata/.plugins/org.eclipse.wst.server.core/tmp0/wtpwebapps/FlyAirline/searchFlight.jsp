<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Populate Source Airport List</title>
</head>
<body>

   <form action="SearchFlightServlet" method="post">
   
  	<label>Source Airport</label>
   	<select name="dep_airportCode">
   		<option value="-1">Select Airport
   		  <%
   		 	  String query="select * from dep_airport";
			  Connection connection=null;
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mytrgdb",
						"root",
						"root");
			  Statement statement = connection.createStatement();
			  ResultSet rs=statement.executeQuery(query);
			  
			  while(rs.next())
			  {
				  
				%>
				<option value="<%=rs.getString("airport_name")%>"><%=rs.getString("airport_name")%></option>
				<%
			  } 
   		  %>
   		</option>
	   	</select>
	   	
	    <label>Destination Airport</label>
	    <select name="arr_airportCode">
	        <option value="-1">Select Airport
	        <%
	        	String query1="select * from place_airport";
	        	Connection connection1=null;
	        	Class.forName("com.mysql.cj.jdbc.Driver");
	        	connection1=DriverManager.getConnection("jdbc:mysql://localhost:3306/mytrgdb",
						"root",
						"root");
	        	Statement statement1 = connection1.createStatement();
	        	ResultSet rs1=statement1.executeQuery(query1);
	        	
	        	while(rs1.next())
	        	{
	        		%>
	        		<option value="<%=rs1.getString("airport_name")%>"><%=rs1.getString("airport_name")%></option>
	        		<%
	        	}	
	        %>
	        </option>
	    </select>
	    Date Of Travel<input type="text" name="dot">
	    Total Seats<input type="text" name="total_seats">
	    <input type="submit" value="Search">
   </form>
	
</body>
</html>