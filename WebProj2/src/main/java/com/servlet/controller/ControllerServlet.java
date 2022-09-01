package com.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ControllerServlet() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String requestFor=request.getParameter("task");
		RequestDispatcher dispatcher=null;
		PrintWriter writer=response.getWriter();
		writer.print("requestFor :"+requestFor);
		
		
		
		  /*switch(requestFor) 
		  { 
		  case "home": 
		  			{ 
		  				response.sendRedirect("home.html");
		  				break; 
		  			}
		  case "admin": 
		  			{ 
		  				response.sendRedirect("admin.html"); 
		  				break; 
		  			} 
		  case	"place": 
		  			{ 
		  				response.sendRedirect("place.html"); 
		  				break; 
		  			} 
		  case "airline": 
		  			{
		  				response.sendRedirect("airline.html"); 
		  				break; 
		  			} 
		  case "flight": 
		  			{
		  				response.sendRedirect("flight.html"); 
		  				break; 
		  			} 
		  case "login": 
		  			{
		  					dispatcher=request.getRequestDispatcher("LoginServlet");
		  					dispatcher.forward(request, response);
		  				
		  				break; 
		  			} 
		  default :
			  			writer.print("requestFor :"+requestFor+" is not a right option"); 
		  }*/
		  
		 if(requestFor.equals("login"))
		 {
			 dispatcher=request.getRequestDispatcher("LoginServlet");
			 dispatcher.forward(request, response);
		 }
		 else if(requestFor.equals("place"))
		{
			 dispatcher=request.getRequestDispatcher("AddPlaceServlet");
			 dispatcher.forward(request, response);
		}
		 else if(requestFor.equals("airline"))
		 {
			 dispatcher=request.getRequestDispatcher("AddAirlineServlet");
			 dispatcher.forward(request, response);
		 }
		 else if (requestFor.equals("searchPlace"))
		 {
			 dispatcher=request.getRequestDispatcher("searchPlaceServlet");
			 dispatcher.forward(request, response);
		 }
		else
		{
			 response.sendRedirect("signup.html");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
