<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>bank page</title>
<style>
.main
{
	
	width: 200px;
	margin-left:15cm; 
	margin-top:5cm; 
}

.heading
{
	font-size: 40px;
	text-align: center;
}
.links a
{
	text-decoration: none;
	font-size: 20px;
	color: black;
	border: 2px solid black;
	
	
}
.links a:hover
{
	background: black;
	color: white;
}
</style>
</head>
<body>
<div class="main">
<p class="heading">customer</p>
<p class="links"><a href="login.jsp">Customer Login</a></p>
<p class="links"><a href="signup.jsp">New Customer Sign in</a></p>
<p class="links"><a href="exit.jsp">Exit</a></p>

</div>

</body>
</html>