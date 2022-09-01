package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ValidateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ValidateUserServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userName=request.getParameter("uname");
		String upassword=request.getParameter("upassword");
		
		if(userName.equals("admin") && upassword.equals("admin"))
		{
			RequestDispatcher dispatcher=request.getRequestDispatcher("ValidUserServlet");
			dispatcher.forward(request, response);
		
		}
		else
		{
			response.sendRedirect("NotValidUserServlet");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
