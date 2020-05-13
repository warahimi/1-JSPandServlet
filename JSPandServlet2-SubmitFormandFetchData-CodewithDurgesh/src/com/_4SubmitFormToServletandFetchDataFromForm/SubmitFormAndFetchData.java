package com._4SubmitFormToServletandFetchDataFromForm;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SubmitFormAndFetchData extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//in doPost() parameter come 2 importan objects
		// HttpServletRequest object:throgh which we can fetch the data, server gets user`s data through it
		//HttpServletResponse object: through which we can generate dynamic responses , such print htmls ...etc any type of dynamic response we want to send to browser, server send its processed data to user through it
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h2>Welcome to Register Form</h2>");
		
		//Fetching the data from form/request object
		String name = req.getParameter("user_name");
		String passwor = req.getParameter("user_password");
		String email = req.getParameter("user_email");
		String gender = req.getParameter("user_gender");
		String course = req.getParameter("user_course");
		String condition = req.getParameter("condition");
		
		//fist check if the Terms and condition is checked or not ,, if check the value will come as checked
		if(condition !=null)
		{
			if(condition.equals("checked"))
			{
				out.println("<h2>Name: "+name+"</h2>");
				out.println("<h2>Passwor: "+passwor+"</h2>");
				out.println("<h2>Email: "+email+"</h2>");
				out.println("<h2>Gender: "+gender+"</h2>");
				out.println("<h2>Course: "+course+"</h2>");
				
				//or we could put the data coming from form to database using JDBC or ...
				
				//Say we saved the data to a database , and forward the request to other vervlet using RequestDispatcher
				RequestDispatcher rd = req.getRequestDispatcher("success"); //forwards the request to this url
				rd.forward(req, resp); // the success servlet will be run but not directly, it will be run by the help of RequestDispatcher forward method
			}
			else {
				out.println("<h2> You have not accepted the Terms and Conditions</h2>");
			}
		}
		else
		{
			out.println("<h2> You have not accepted the Terms and Conditions</h2>");
			
			//Uring RequesDispatcher
			//we want to include the the output of index.html if the uder didnt check the terms and conditions
			
			
			//Create RequestDispatcher object
			RequestDispatcher rd = req.getRequestDispatcher("index.html"); // if we wanted to include other servlet`s output we pass the other servlet`s url here
			
			
			//call the rd include method
			rd.include(req, resp);
		}



		
		//super.doPost(req, resp);
	}

}
