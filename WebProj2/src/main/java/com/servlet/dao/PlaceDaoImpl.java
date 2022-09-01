package com.servlet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.servlet.dto.Place_Airport;
import com.servlet.util.ConnectionManagerImpl;

public class PlaceDaoImpl implements PlaceDao 
{
	private Connection connection;
	
	public PlaceDaoImpl()
	{
		connection=new ConnectionManagerImpl().getConnection();
	}
	
	
	@Override
	public int addPlace(Place_Airport place_airport) {
		int row=0;
		String airportCode=place_airport.getAirportCode();
		String airportName=place_airport.getAirportName();
		String airportAdd=place_airport.getAirportAdd();
		System.out.println(airportCode+" : "+airportName+" : "+airportAdd);
		String SQL_INSERT = "INSERT INTO place_airport (airport_code, airport_name, airport_address) VALUES (?,?,?)";
		PreparedStatement preparedStatement;
		
		try 
		{
			preparedStatement = connection.prepareStatement(SQL_INSERT);
			preparedStatement.setString(1, airportCode);
            preparedStatement.setString(2, airportName);
            preparedStatement.setString(3, airportAdd);
           
            row=preparedStatement.executeUpdate();
            
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}

		return row;
	}

}
