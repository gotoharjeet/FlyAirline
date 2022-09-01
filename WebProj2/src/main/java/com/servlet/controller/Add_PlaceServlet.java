package com.servlet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.dto.Place_Airport;
import com.servlet.service.PlaceServiceImpl;

public class Add_PlaceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Add_PlaceServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher=null;
		String airportCode=request.getParameter("airportCode");
		String airportName=request.getParameter("airportName");
		String airportAddress=request.getParameter("airportAdd");
		System.out.println(airportCode);
		System.out.println(airportName);
		System.out.println(airportAddress);
		Place_Airport place_airport=new Place_Airport(airportCode,airportName,airportAddress);
		
		int row=new PlaceServiceImpl().addPlace(place_airport);
		
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
