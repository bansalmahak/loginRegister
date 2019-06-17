
<!DOCTYPE form PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<head><h1>Login page</h1>
</head>
<body background="key.jpg" >
	${message}

	<form action="login" font size="15">
		<br> <br> <br> UserName : <input type="email" name="name"> <br> <br>
		 Password : <input type="password" name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more chters">
		<br> <br> <input type="Submit" name="Submit" value="Login">
		<a href="Register.jsp">Register</a>
	</form>
</body>
</HTML>