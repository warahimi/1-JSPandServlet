package com.ParameterAttribute;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet2 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		int n1_s2 = Integer.parseInt(req.getParameter("n1")); 
		int n2_s2 = Integer.parseInt(req.getParameter("n2")); 
		int p = n1_s2 * n2_s2;
		
		//Getting Attribute from request object
		int sum = Integer.parseInt(req.getAttribute("sum").toString());
		
		out.println("<h1>");
		out.println("Sum is :"+sum);
		out.println("Product is: "+p);
		out.println("</h1>");
		
		
	}
}
