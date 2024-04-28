<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>SignUp</title>
<style>

body{

width: 100%;
height: 100vh;
display: flex;
flex-direction: column;
justify-content: center;
background: silver;
}


.d1{
margin-left: 13cm;

}

.d1 .sign1, .d1 sign2{
font-size: 30px;
margin-bottom: 10px;
}

.sign1,.sign2  {

margin-left:3cm;

margin-bottom: 10px;
}
.sign2 a{
color: red;
text-decoration: none;


}

 label{
width: 100px;
text-align:center;
display:inline-block;
font-size: 20px;

}

.s1 input{
padding: 14px 80px;
border:1px solid black;
border-radius: 5px;




}

.s1 input::placeholder{
text-align: center;
}

.d1 .b1{
padding: 15px 192.5px;
margin-top: 0.5cm;
background: orange;
cursor: pointer;
border: 0;
outline: 0;


}








</style>
</head>
<body>




<div class="d1">

<div class="sign1">Sign up</div>
<span>
<div class="sign2">or <a href="login.jsp">login to your Account</a></div>
</span>



</div >

<div class="d1">

<form action="signup-servlet">
<div class="s1">
<label for="username">Username</label>
<input type="text" placeholder="username" name="username">
</div>

<div class="s1">
<label for="password">password</label>
<input type="password" placeholder="password" name="password">
</div>
<div class="s1">


<input class="b1" type="submit" value="Signup">
</div></form>



</div>


</body>
</html>