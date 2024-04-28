package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bank.banking;
import com.dao.impl.bankDaoImpl;
@WebServlet("/check-bal")

public class checkingbal extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		bankDaoImpl bdi =new bankDaoImpl();
		HttpSession ses =req.getSession();
		String uname =(String) ses.getAttribute("uname");
		banking obj =bdi.getUserByName(uname);
		int bal =obj.getBalance();
		
		req.setAttribute("bal", bal);
		
		
		
		
		
			RequestDispatcher rd=req.getRequestDispatcher("checkbalance.jsp");
		rd.forward(req, resp);
	}

}
