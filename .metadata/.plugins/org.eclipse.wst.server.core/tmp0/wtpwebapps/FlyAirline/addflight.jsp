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

   <form action="AddFlightServlet" method="post">
   
  Enter Flight Number<input type="text" name="flightNumber"><br/>
  Enter Date of Flight<input type="datetime" name="dto_flight" id="datepicker"><br/>
  
  
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
    <br/>
    
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
   	<br/>
   	<label>Airline </label>
   	<select name="airlineId">	
   	 	<option value="-1">Select Airport</option>
   	 	<%
   	 		try
   	 		{
   	 			  String query2="select * from airline";
   	 			  Connection connection2=null;
   				  Class.forName("com.mysql.cj.jdbc.Driver");
   				  connection2=DriverManager.getConnection("jdbc:mysql://localhost:3306/mytrgdb",
   							"root",
   							"root");
   				  Statement statement2 = connection2.createStatement();
   				  ResultSet rs2=statement2.executeQuery(query2);
   				
   				  while(rs2.next())
   				  {
   					  %>
   					     <option value="<%=rs2.getString("airline_code")%>"><%=rs2.getString("airline_name")%></option>
   					  <%
   				  }
   	 		}
   	 		catch(ClassNotFoundException |SQLException ex)
   	 		{
   	 			ex.printStackTrace();
   	 		}
   	 	%>
   	</select>
   	<br/>
   	<br/>
   
   Ticket Price<input type="text" name="ticketPrice"><br/>
    Number of seats<input type="text" name="noofSeats"><br/>
   	<input type="submit" value="Add">
  
   </form>
	
</body>
</html>