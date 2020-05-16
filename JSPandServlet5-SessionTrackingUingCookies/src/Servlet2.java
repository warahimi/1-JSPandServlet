import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		//fetching all the cookies first 
		Cookie[] cookies = req.getCookies();
		
		boolean f = false; // by default think it is a new user
		String name ="";
		
		if(cookies == null) //new user
		{
			out.println("<h1>You are a new user.. go to home page first and submite your name......</h1>");
			return;
		}
		else
		{
			for(Cookie c : cookies)
			{
				//for searching our variable name we loop over all the cookies.
				//becaue there might a lot of cookies coming with request in the form of array 
				String temp_name = c.getName();
				if (temp_name.equals("user_name")) //if true means it our cookie it is the old reques
				{
					f = true;
					name = c.getValue(); // getting the name from cookies and use it
				}
			}
		}
		
		
		
		if(f)
		{
		out.println("<h1>This is Servlet2</h1><br>");
		out.println("<h1>Welcom Back "+name +"</h1");
		}
		else 
		{
			out.println("<h1>You are a new user.. go to home page first and submite your name</h1>");
		}
	}

}
