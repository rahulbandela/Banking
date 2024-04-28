<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
<style>
.main p
{
	font-size: 40px;
	margin-left: 1cm;
	
	
}
.main
{
	width: 500px;
	margin-left:15cm; 
	margin-top:5cm; 

}

</style>
</head>

<body>

<div class="main">
<p>Deposit</p>
<form action="withdraw-servlet">
<label for="amount">Enter the amount</label>
<input type="number" id="amount" name="amount" min="1" />
<input type="submit" />
</form>


</div>








</body>
</html>