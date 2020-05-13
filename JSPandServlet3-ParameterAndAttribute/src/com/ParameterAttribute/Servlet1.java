package com.ParameterAttribute;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		int n1 = Integer.parseInt(req.getParameter("n1")); 
		int n2 = Integer.parseInt(req.getParameter("n2")); 
//		out.println(n1);
//		out.println(n2);
		
		int s = n1+n2;
		
		//Set Attribute to the request object to be sent to other servlet
		req.setAttribute("sum", s); // it will be added to request object in the form of key value pairs
		//so that we can fetch from other servlet
		
		//forward the request object to other servlet using RequestDispatcher
		RequestDispatcher rd = req.getRequestDispatcher("servlet2");
		rd.forward(req, resp);
		
	}
}
