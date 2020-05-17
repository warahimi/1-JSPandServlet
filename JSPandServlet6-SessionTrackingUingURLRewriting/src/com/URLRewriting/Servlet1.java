package com.URLRewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		//Fetching the name
		String name = req.getParameter("user_name");
		out.println("<h1>Your name is: "+name+"</h1>");
		
		out.println("<a href='servlet2?name="+name+"'>Go to Servlet2</a>"); // we rewrote the url and send some data to 																			//client with response object
		//we rewrote the url to send data from servlet1 to servlet2
		
	}

}
