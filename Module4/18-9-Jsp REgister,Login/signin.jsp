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


	
	<div class="card bg-light">
		<article class="card-body mx-auto" style="max-width: 400px;">
		<h4 class="card-title mt-3 text-center"></h4>
		<p class="text-center"></p>
		
		
		<form action="login.jsp">
				<!-- form-group// -->
			<div class="form-group input-group">
				<div class="input-group-prepend">
					<span class="input-group-text"> <i class="fa fa-envelope"></i>
					</span>
				</div>
				<input name="email" class="form-control" placeholder="Email address"
					type="email">
			</div>
			
		
			<div class="form-group input-group">
				<div class="input-group-prepend">
					<span class="input-group-text"> <i class="fa fa-lock"></i>
					</span>
				</div>
				<input class="form-control" placeholder="Create password"
					type="password" name="password">
			</div>
			
			<!-- form-group// -->
			<div class="form-group">
				<button type="submit" class="btn btn-primary btn-block">
					Sign in</button>
			</div>
			<!-- form-group// -->
			<p class="text-center">
				Do you want to signup? <a href="signup.jsp">Sign up</a>
			</p>
		</form>
		</article>
	</div>
	<!-- card.// -->

	</div>
	<!--container end.//-->

<jsp:include page="footer.jsp"/>

</body>
</html>