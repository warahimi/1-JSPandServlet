package com._3ServletUsingHttpServletClass;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//used to create http protocol specific servlets, it extends GenericServlet
//the main method we might need is service()// when browser send a reques it send either in the form of get or post
//GenericServlet doesnot suppor the methods for get and post
//HttpServlet has extended Genericservlet and call the http specific protocols inside the service() such as
//doGet,doPost, doPut,doTrace()...HttpServlet has all the http specific functionalities
//if we want to make a servlet that could support all the http functionalities we use this class
//we dont need to over ride the service() here. if the request is in the for of post we override the doPost() and if it is in the form of get we override the doGet()
public class ServletUsingHttpServlet extends HttpServlet { //it is concreat class which has body for all its methods
	//we provid body for what ever method we want our request to be sent
	
	//to send reques in the form of get
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		System.out.println("this is doGet() method......");
		
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter(); // using this PrintWriter object we can print html outputs
		out.println("<h1>this is the doGet() method......</h1>");
		out.println(new Date().toString());
	}

	
	
	//to send the data in the form of post from forms .. we override the doPost() and give the implements
	
	//Press Alt + Shift + S + V to quickly implement/override methods in Eclipse.
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		super.doPost(req, resp);
//	}
	
}
