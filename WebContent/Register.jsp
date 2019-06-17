<!DOCTYPE form PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<head>Register here</head>
<body>
<form action="Register" method="get">
	<br> <br> <br> Firstname :<input type="text"
		name="firstname" pattern="[a-zA-Z]+"> <br> <br>
	Lastname :<input type="text" name="lastname" pattern="[a-zA-Z]+">
	<br>
	<br> UserName :<input type="email" name="username"> <br>
	<br> Contactnumber :<input type="text" name="contact"
		pattern="[789][0-9]{9}"> <br>
	<br> Email :<input type="email" name="email"> <br>
	<br> Password : <input type="password" name="password"
		pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
		title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more ch
				ters">
	<br> <br> Re-Password : <input type="password"
		name="re-password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
		title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more ch
				ters">
	<br> <br> <input type="submit" value="Submit">
</form>
</body>
</HTML>