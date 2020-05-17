package com.HiddenFormField;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
	
		out.println("<h1 style='color:blue'>Welcome to Servlet2</h1><br><br>");
		
		//fetching name from url
		String name = req.getParameter("user_name");
		
		out.println("<h1 style='color:red'>Welcome Back: "+name+"</h1>");
	}
}
