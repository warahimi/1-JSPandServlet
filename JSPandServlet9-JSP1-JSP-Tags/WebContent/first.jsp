<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.Random, java.util.ArrayList, java.io.*" %> <%--Usage of @page direcitve --%>
<%@ page isErrorPage="True" %> <%--to make our page error page , like this we can use a lot of its features --%>

<%-- using the JSTL taglib --%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> <%-- core tags --%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %> <%-- formatting tags --%>
<%@ taglib prefix = "sql" uri = "http://java.sun.com/jsp/jstl/sql" %> <%-- SQL tags --%>


    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Page</title>
</head>
<body style="background: #cdc7d4">
	<h1>First JSP Page</h1>
	
	
	<%-- Declarative tag, we can use all these declaration bellow through our jsp page --%>
	<%--This tag resolve our code as Java code otherwise it will be printed in our page --%>
	<%--these declarations will outside the serverice(), they are instance varaibles --%>
	<%!                      
		int a = 60;
		int b= 90;
		String name = "Wahidullah Rahimi";
		public int sum()
		{
			return a + b;
		}
		
		public String reverseName()
		{
			StringBuffer br = new StringBuffer(name);
			return br.reverse().toString();
		}
	%>
	
	<%-- Scriplet tage, codes go inside service() --%>
	<%
		out.println("the value of a is: " + a +"<br>");
		out.println("the value of b is: " + b);
		
		//calling the methods
		out.println("<br>the sum is : "+ sum());
		out.println("<br>");
		out.println("The String reverse is: "+ reverseName());
		
		Random r = new Random();
		int rnum = r.nextInt(10);
	%>
	
	<%--Exprisive tage and easy way and alternative way for printing, we can call Java methods and varaible inside it --%>
	<%--this tage resolve java codes inside static html /jsp codes --%>
	<br>
	<%@ include file="header.jsp" %>
	<br>
	<h1 style="color: red;">The values of a is: <%= a %></h1>
	<h1>The values of b is: <%= b %></h1>
	<h1>The sum is: <%= sum() %></h1>
	<h1>The reverse of string is: <%= reverseName() %></h1>
	
	
	<h1>Random number: <%= rnum %> </h1>
	
	
	<c:set var="name" value="Abdullah Jan Rahimi"></c:set>
	<c:out value="${name}"></c:out>
	 
	<c:if test="${3 > 2 }">
		<h1>the condition is true 3>2</h1>
	</c:if>

</body>
</html>