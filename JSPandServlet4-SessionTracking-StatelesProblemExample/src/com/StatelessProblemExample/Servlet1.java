package com.StatelessProblemExample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		String name = req.getParameter("name");
		
		out.println("<h1>This is Servlet1</h1><br>");
		out.println("<h1>Welcom "+name +"</h1");
		out.println("<h1><a href='servlet2'>Go to Servelet2</a></h1>");
		
	}

}
