package com.servlet.service;

import com.servlet.dao.UserDao;
import com.servlet.dao.UserDaoImpl;
import com.servlet.dto.User;

public class UserServiceImp implements UserService {
	
	private UserDao dao;
	
	public UserServiceImp()
	{
		dao=new UserDaoImpl();
	}
	
	@Override
	public boolean validateUser(User user) {
		
		return dao.validateUser(user);
	}

}
