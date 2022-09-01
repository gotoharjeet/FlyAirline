package com.servlet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.servlet.dto.User;
import com.servlet.util.ConnectionManagerImpl;

public class UserDaoImpl implements UserDao {

	private Connection connection;
	
	public UserDaoImpl()
	{
		connection=new ConnectionManagerImpl().getConnection();
	}
	
	
	@Override
	public boolean validateUser(User user) {
		
		boolean isValidUser=false;
		
		String query="select * from userdetails where user_name=? and password=?";
		try {
				PreparedStatement preparedstatement=connection.prepareStatement(query);
				preparedstatement.setString(1, user.getUserName());
				preparedstatement.setString(2, user.getPassword());
				
				ResultSet resultset=preparedstatement.executeQuery();
				if(resultset.next() == true)
					isValidUser=true;
				
			} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return isValidUser;
	}

}
