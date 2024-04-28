package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bank.banking;
import com.dao.impl.bankDaoImpl;
@WebServlet("/signup-servlet")
public class signupServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		bankDaoImpl bdi =new bankDaoImpl();
		String uname=req.getParameter("username");
		String pass =req.getParameter("password");
		banking b =new banking(0, uname, pass);
		bdi.addUser(b);
		resp.sendRedirect("login.jsp");
	}

}
