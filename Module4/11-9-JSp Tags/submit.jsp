<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<%

		String em = request.getParameter("email");
		String ps = request.getParameter("pass");
		
		
		if(ps.equals("1234"))
		{
			out.print("welcome "+em);
		}
		else
		{
			out.print("Fail");
			
		}
		
	%>
	
	<br>
	<br>
	
	<%= Calendar.getInstance().getTime()%>
	
	
	<%!
		int cube(int n)
		{
			return n*n*n;
		}
	
	%>
	
	
	<br>
	<br>
	
	<%=cube(3) %>
	

</body>
</html>