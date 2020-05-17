package com.HttpSession;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num1 = Integer.parseInt(req.getParameter("n1"));
		int num2 = Integer.parseInt(req.getParameter("n2"));
		
		int sum = num1+num2;
		
		//HttpSession will be give to us by tomcat we need to get a hold of it
		HttpSession session = req.getSession();
		session.setAttribute("sum", sum); // this session will be available for us during our visit even we go to any servlets or other websie which is in same application
		//untill we have not killed the session
		
		resp.sendRedirect("sq");
	}

}
