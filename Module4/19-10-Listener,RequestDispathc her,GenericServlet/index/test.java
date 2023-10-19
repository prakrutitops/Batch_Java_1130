package com.index;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out  = response.getWriter();
		
		ServletConfig config = getServletConfig();
		ServletContext context = config.getServletContext();
		
		int counter =1;
		
		if (context.getAttribute("counts")!=null)
		{
			counter  = (int)context.getAttribute("counts");
			counter ++;
			
		}
		context.setAttribute("counts", counter);
		out.println("Number of Visitors :"+counter);
	
		
	}


}
