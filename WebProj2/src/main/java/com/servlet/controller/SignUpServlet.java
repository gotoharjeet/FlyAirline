package com.servlet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.dto.User;
import com.servlet.service.UserServiceImpl;


public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SignUpServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String address=request.getParameter("address");
		String uname=request.getParameter("uname");
		String password=request.getParameter("password");
		
		User user=new User(fname,lname,address,uname,password);
		RequestDispatcher dispatcher=null;
		
		int row=new UserServiceImpl().addUser(user);
		if(row == 1)
		{
			System.out.println("Database update successfully");
			response.sendRedirect("home.html");
		}
		else
		{
			System.out.println("no effect in database");
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
