package com._2ServletUsingGenericServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//This is an abstruct class, implents Serice interface and provides implementation for 4 methos of Service except service()
//service mthod is abstract inside GenericServlet
//now we have to override only one method that is service(), the other 4 is already overriddent
//Shorter way
//the main method we might need is service()// when browser send a reques it send either in the form of get or post
public class ServletUsingGenericServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("this is Servlet using GenericServlet");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>this is Servlet using GenericServlet</h1>");
		
	}

}
