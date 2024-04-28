package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.impl.bankDaoImpl;

@WebServlet("/login-servlet")

public class loginServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String password =req.getParameter("pass");
		String uname = req.getParameter("uname");
		bankDaoImpl bdi=new bankDaoImpl();
		String pass=bdi.getPassword(uname);
		HttpSession ses =req.getSession();
		ses.setAttribute("uname", uname);
		
		
		
		if(pass.equals(password))
		{
			RequestDispatcher rd =req.getRequestDispatcher("welcome.jsp");
			rd.forward(req, resp);
			
		}
	}

}
