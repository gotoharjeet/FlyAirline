package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MYFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MYFirstServlet() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html"); 
		String hiddenVar=request.getParameter("hiddenVar");
		PrintWriter out=response.getWriter();
		out.write("<form action='MyFirstHiddenServlet' method='post'>"); 
		out.write("<h1>Wahe Guru Ji....</h1>");
		out.write("<input type='hidden' name='hiddelVarValue' value="+hiddenVar+">");	
		out.write("<br/>");
		out.write("<input type='submit' value='RotateFurtherNext'>");
		out.write("</form>");	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
