package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CookieServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CookieServlet2() {
        super();
   
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username=request.getParameter("uname");
		
		// Create the cookie
		
		Cookie[] cookies = request.getCookies();
		//Cookie cookie=null;
		PrintWriter writer = response.getWriter();
		
		if(cookies == null)
		{
			/*
			 * cookie = new Cookie("uname",username);
			 * writer.print("Hello "+username+" cookie is sent");
			 */
			writer.print("No cookies found");
		}
		else
		{
			for(Cookie cookee:cookies)
			{
				writer.println(cookee.getName()+" : "+cookee.getValue());
			}
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
