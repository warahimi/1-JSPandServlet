package com._1ServletUingServletInterface;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletUsingServletInterface implements Servlet {

	@Override
	public void destroy() { // Life Cyle Method
		
		System.out.println("Servlet object destroyed...........");
	}

	@Override
	public ServletConfig getServletConfig() { // non Life Cyle Method
		
		return this.config;
	}

	@Override
	public String getServletInfo() { // non Life Cyle Method
		
		return "This servlet is created by Wahidullah Rahimi";
	}
	
	ServletConfig config;
	@Override
	public void init(ServletConfig config) throws ServletException { // Life Cyle Method
		// We can write our initializaiotn codes here
		System.out.println("Creating Object....Initailizion");
		this.config=config;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException { // Life Cyle Method
		//Here we write all the logice for processing the reques
		System.out.println("Servicing..........");
		
		//set the content type
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>This is output is from Servlet</h1>");
		out.println("<h1>Todays date is:"+new Date().toString()+"/<h1>");

		
	}

}
