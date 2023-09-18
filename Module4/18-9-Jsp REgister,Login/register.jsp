<%@page import="com.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<jsp:useBean id="m" class="com.model.SignupModel"/>
<jsp:setProperty property="*" name="m"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
			
		String pass = request.getParameter("password");
		String repass = request.getParameter("repassword");
		
		if(pass.equals(repass))
		{
			int data = UserDao.signupmethod(m);
			
			if(data>0)
			{
				response.sendRedirect("signin.jsp");
			}
			else
			{
				out.print("fail");
			}
		}
		else
		{
			out.print("Password and confirm password are not same");
		}
	
		
	
	
	%>


</body>
</html>