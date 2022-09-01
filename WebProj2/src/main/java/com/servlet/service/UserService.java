package com.servlet.service;

import com.servlet.dto.User;

public interface UserService {
	public int addUser(User user);
	public boolean validateUser(User user);
}
