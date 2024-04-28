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
@WebServlet("/deposit-servlet")

public class depositServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int amount=Integer.parseInt(req.getParameter("amount"));
		
		bankDaoImpl bdi =new bankDaoImpl();
		HttpSession ses =req.getSession();
		String uname =(String) ses.getAttribute("uname");
		banking bank =bdi.getUserByName(uname);
		int bal =bank.getBalance();
		bal=bal+amount;
		bdi.updateBalance(bal,uname);
		req.setAttribute("updatedBal", bal);
		
		RequestDispatcher rd =req.getRequestDispatcher("welcome.jsp");
		rd.forward(req, resp);
	}

}
