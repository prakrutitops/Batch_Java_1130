<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/shadow.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@page import="com.itemType.*,java.util.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
	List<ItemTypeModel> list = ItemTypeDao.getAll();
	request.setAttribute("d", list);
	
	if(session.getAttribute("userid") != null)
	{
		%>
		<jsp:include page="adminheader.jsp"></jsp:include>

	<form action="imageSave" method="post" enctype="multipart/form-data">
		
		<h2 align="center">Upload Images</h2>
		<hr width="22%">
		
		<br/>
		<table align="center" cellspacing="20">
			
			
			<tr>
			<td>
				Select Image Name:
			</td>
			<td>
				<select required name="ittype">
				<option value="">--Select--</option>
					<c:forEach items="${d }" var="m">
						<option>${m.getName() }</option>
					</c:forEach>
				</select>
			</td>
			</tr>
			<tr>
				<td>Select Image:</td>
				<td><input type="file" name="image"  required="required"/></td>
			</tr>
			
			<tr>
				<td colspan="2" align="center"><input type="submit" value="ADD" action="insertImg.java"/></td>
			</tr>
		</table>
	</form>
	
	<jsp:include page="ImageTbl.jsp"></jsp:include>
		<%
	}
	else
	{
		response.sendRedirect("adminlogin.jsp");
	}
%>


</body>
</html>