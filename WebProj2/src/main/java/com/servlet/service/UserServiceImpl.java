package com.servlet.service;

import com.servlet.dao.UserDao;
import com.servlet.dao.UserDaoImpl;
import com.servlet.dto.User;

public class UserServiceImpl implements UserService {
	
	private UserDao dao;
	
	public UserServiceImpl()
	{
		dao=new UserDaoImpl();
	}
	@Override
	public boolean validateUser(User user) {
		
		return dao.validateUser(user);
	}
	@Override
	public int addUser(User user) {
		
		return dao.addUser(user);
	}

}
