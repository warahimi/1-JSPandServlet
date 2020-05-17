package com.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// to fetch the valued from HttpSession,,, remember the data is not send in request object 
		HttpSession session = req.getSession();
		int sum = (int)session.getAttribute("sum");
		
		PrintWriter out = resp.getWriter();
		out.println("<h1>This is Square Servlet</h1><br>");
		
		out.println("<h1>The sum is: "+sum+" which comes from AddServlet</h1><br>");
		int sq = sum * sum;
		out.println("<h1>The square is : "+sq+" .</h1><br><br>");
		
		
	}

}
