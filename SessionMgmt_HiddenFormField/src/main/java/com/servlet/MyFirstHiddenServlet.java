package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyFirstHiddenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public MyFirstHiddenServlet() {
        super();
   
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String hiddenVvalue=request.getParameter("hiddelVarValue");
		PrintWriter out=response.getWriter();
		out.write("HiddenFetchedValue :"+hiddenVvalue);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
