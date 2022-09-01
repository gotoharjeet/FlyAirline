package com.servlet.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.dao.SearchPlaceDaoImpl;
import com.servlet.dto.Place_Airport;
import com.servlet.service.SearchPlaceServiceImpl;

public class SearchPlaceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SearchPlaceServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String airportCode = request.getParameter("airportCode");
		Place_Airport place_airport=new SearchPlaceDaoImpl().searchPlace(airportCode);
		
		if(place_airport != null)	{
			request.setAttribute("place_airport", place_airport);
			RequestDispatcher dispatcher=request.getRequestDispatcher("display.jsp");
			dispatcher.forward(request, response);
		}
		else 
		{
			String msg="Place of Airport not found";
			request.setAttribute("msg", msg);
			RequestDispatcher dispatcher=request.getRequestDispatcher("home.html");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
