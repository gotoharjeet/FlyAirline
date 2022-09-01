package com.servlet.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.dto.Airline;
import com.servlet.service.AirlineServiceImpl;



public class AddAirlineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection;
	
    public AddAirlineServlet() {
        super();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher=null;
		String airlineCode=request.getParameter("airlineCode");
		String airlineName=request.getParameter("airlineName");
		System.out.println(airlineCode);
		System.out.println(airlineName);
		Airline airline=new Airline(airlineCode,airlineName);
		
		int row=new AirlineServiceImpl().addAirline(airline);
		
		if(row == 1)
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
