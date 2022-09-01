package com.servlet.controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.dto.User;
import com.servlet.service.UserServiceImpl;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginServlet() {
        super();
   
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String upassword=request.getParameter("upassword");
		User user=new User(uname,upassword);
		RequestDispatcher dispatcher=null;
		//System.out.println(uname);
		
		boolean isValidUser=new UserServiceImpl().validateUser(user);
		//System.out.println(isValidUser);
		if(isValidUser == true)
		{
			dispatcher=request.getRequestDispatcher("VU");
			dispatcher.forward(request, response);
		}
		else
		{
			response.sendRedirect("NVU");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
