package com.HiddenFormField;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		//Fetching the name
		String name = req.getParameter("user_name");
		out.println("<h1>Your name is: "+name+"</h1>");
		
		//out.println("<a href='servlet2?name="+name+"'>Go to Servlet2</a>");  																			//client with response object
		
		//Sending the data to servlet2 using hidden Form Field
		out.println(" "
				+ "<form action='servlet2'>"
				+ "<input type='hidden' name ='user_name' value='"+name+"'/><br>"
				+ "<button type='submit'>Go to Servelet2</button>"
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ "</form>");
	}

}
