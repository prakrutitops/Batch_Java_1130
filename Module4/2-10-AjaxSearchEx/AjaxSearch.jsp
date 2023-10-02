<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
	
			String name=request.getParameter("val");  
			
			if(name==null||name.trim().equals(""))
		    {  
		    	out.print("<p>Please enter Email!</p>");  
		    }
			else
			{
				try
		    	{  
		    		Class.forName("com.mysql.jdbc.Driver");
		    		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopsite","root","");  
		    		PreparedStatement ps=con.prepareStatement("select * from signup where email=?");  
		    		ps.setString(1, name);
		    		ResultSet rs=ps.executeQuery();  
		      		if(rs.next()) 
		      		{      
		     			out.println("<p>Email Id Already Used</p>");   
		    		}
		      		else
		      		{  
		    			out.println("<p>This Email Id Is Available</p>"); 
		    		}  
		    		con.close();  
		    	}
		    	catch(Exception e)
		    	{
		    		out.print(e);
		    	}  
			}
	
	%>


</body>
</html>