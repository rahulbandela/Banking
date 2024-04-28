<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
<style>
.main
{
	
	width: 200px;
	margin-left:15cm; 
	margin-top:5cm; 
	text-align: center;
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
<%String username =request.getParameter("uname"); %>

<h2> Welcome   <%=username %></h2>

<div class="main">
<p class="heading">Account Details</p>
<p class="links"><a href="deposit.jsp">Amount deposit</a></p>
<p class="links"><a href="withdraw.jsp">Amount Withdrawl</a></p>
<p class="links"><a href="check-bal">Check balance</a></p>
<p class="links"><a href="exit.jsp">exit</a></p>




		
		</div>

</body>
</html>