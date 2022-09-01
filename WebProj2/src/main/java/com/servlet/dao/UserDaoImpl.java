package com.servlet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.servlet.dto.User;
import com.servlet.util.ConnectionManagerImpl;

public class UserDaoImpl implements UserDao 
{

private Connection connection;
	
	public UserDaoImpl()
	{
		connection=new ConnectionManagerImpl().getConnection();
	}
	
	
	@Override
	public boolean validateUser(User user) 
	{
		
		boolean isValidUser=false;
		
		String query="select * from userdetails where user_name=? and password=?";
		try 
		{
				PreparedStatement preparedstatement=connection.prepareStatement(query);
				preparedstatement.setString(1, user.getUserName());
				preparedstatement.setString(2, user.getPassword());
				
				ResultSet resultset=preparedstatement.executeQuery();
				if(resultset.next() == true)
					isValidUser=true;
				
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return isValidUser;
	}


	
	@Override
	public int addUser(User user) 
	{
		
		String fname=user.getFirstName();
		String lname=user.getLastName();
		String address=user.getAddress();
		String uname=user.getUserName();
		String password=user.getPassword();
		
		
		
		String SQL_INSERT = "INSERT INTO userdetails (first_name, last_name, address,user_name,password) VALUES (?,?,?,?,?)";
		int row=0;
		PreparedStatement preparedStatement;
		try 
		{
			preparedStatement = connection.prepareStatement(SQL_INSERT);
			preparedStatement.setString(1, fname);
            preparedStatement.setString(2, lname);
            preparedStatement.setString(3, address);
            preparedStatement.setString(4, uname);
            preparedStatement.setString(5, password);
		
            row=preparedStatement.executeUpdate();
            
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}

            
		return row;
	}

}
