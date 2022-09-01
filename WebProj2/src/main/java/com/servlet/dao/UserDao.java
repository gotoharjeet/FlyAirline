package com.servlet.dao;

import com.servlet.dto.User;

public interface UserDao {
	public int addUser(User user);
	public boolean validateUser(User user);
}
