<%@page import="com.model.SignupModel"%>
<%@page import="com.dao.UserDao"%>
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
		
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
	
		SignupModel m =new SignupModel();
		m.setEmail(email);
		m.setPassword(pass);
		
		m =UserDao.loginmethod(m);
		
		if(m!=null)
		{
			out.print("success");
		}
		else
		{
			out.print("fail");
		}
	
	
	%>


</body>
</html>