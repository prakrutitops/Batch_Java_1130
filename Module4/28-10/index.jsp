<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">

	function validateForm()
	{

		var firstname = document.forms["registrationForm"]["firstName"].value;
		var phone = document.forms["registrationForm"]["phone"].value;
		var email = document.forms["registrationForm"]["email"].value;
		var pass = document.forms["registrationForm"]["password"].value;
		var cpass = document.forms["registrationForm"]["confirmPassword"].value;				

		if(firstname =="" || phone =="" || email=="" || pass=="" || cpass=="")
		{
			alert('All Fields are required');
			return false;
		}
		if(pass!=cpass)
		{
			alert('Password and Confirm Password Does not match');
			return false;
		}
		else
		{
			return true;
		}		
	}

	var request=new XMLHttpRequest();  
	function searchInfo()
	{
		var name=document.registrationForm.email.value;  
		var url="AjaxSearch.jsp?val="+name;  	

		try
		{
			request.onreadystatechange=function()
			{

				if(request.readyState==4)
				{  
					var val=request.responseText;  
					document.getElementById('tops').innerHTML=val;  
				}  
			}
			request.open("GET",url,true);  
			request.send();  
		
			
		}
		catch(e)
		{
			alert("Unable to connect to server");
		}
		
		
		
	}
	

</script>

</head>
<body>

	
	 <form name="registrationForm" method="post" onsubmit="return validateForm()">
       
        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstName"><br><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" onblur="searchInfo()"><br><br>
        
         <label for="phone">Phone:</label>
        <input type="number" id="phone" name="phone"><br><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password"><br><br>

        <label for="confirmPassword">Confirm Password:</label>
        <input type="password" id="confirmPassword" name="confirmPassword"><br><br>

        <input type="submit" value="Register">
        
    </form>
<span id="tops"></span>  

</body>
</html>