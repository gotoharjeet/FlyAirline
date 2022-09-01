package com.servlet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String requestFor=request.getParameter("task");
		System.out.println(requestFor);
		RequestDispatcher dispatcher=null;
		
		
		if(requestFor.equals("login"))
		{
			dispatcher=request.getRequestDispatcher("LoginServlet");
			dispatcher.forward(request, response);
		}
		else if(requestFor.equals("signup"))
		{
			response.sendRedirect("SignUp.html");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
