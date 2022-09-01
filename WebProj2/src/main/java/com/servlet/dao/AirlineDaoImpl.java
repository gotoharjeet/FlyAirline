package com.servlet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.servlet.dto.Airline;
import com.servlet.util.ConnectionManagerImpl;

public class AirlineDaoImpl implements AirlineDao 
{
	private Connection connection;
	
	public AirlineDaoImpl()
	{
		connection=new ConnectionManagerImpl().getConnection();
	}
	
	@Override
	public int addAirline(Airline airline) {
		int row=0;
		String airlineCode=airline.getAirlineCode();
		String airlineName=airline.getAirlineName();
		System.out.println(airlineCode+" : "+airlineName);
		String SQL_INSERT = "INSERT INTO airline (airline_code, airline_name) VALUES (?,?)";
		PreparedStatement preparedStatement;
		
		try 
		{
			preparedStatement = connection.prepareStatement(SQL_INSERT);
			preparedStatement.setString(1, airlineCode);
            preparedStatement.setString(2, airlineName);
           
            row=preparedStatement.executeUpdate();
            
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}

		return row;
	}

}
