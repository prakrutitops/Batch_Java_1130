<%@page import="com.model.ProductModel"%>
<%@page import="java.util.List"%>
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

<jsp:include page="header.jsp"/>

	
	
<%
	
	List<ProductModel>list = UserDao.viewdata();
	for(ProductModel pm : list)
	{
		
	
%>

<form action="">
<br>
<br>

<center>
<img alt="image" src="<%=pm.getPimage()%>" width="500" height="500">	
<br>
Product Name: <h2><%=pm.getPname() %></h2>
Product Price: <h3><%=pm.getPprice() %></h3>
Product Description: <h4><%=pm.getPdes()%></h4>
<br>

<a class="swd-button" href="addwishlist.jsp" >Add to Wishlist</a>
<a class="swd-button" href="addcart.jsp" >Add to Cart</a>

</form>

<%

	}
%>

</center>
<jsp:include page="footer.jsp"/>


</body>
</html>