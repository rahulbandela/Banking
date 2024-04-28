package com.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.jni.User;

import com.bank.banking;
import com.bank.dao.bankDao;

public class bankDaoImpl implements bankDao{
	Connection con;
	String url="jdbc:mysql://localhost:3306/banking";
	String uname="root";
	String pass="root";
	String ADD_USER = "INSERT INTO `bank`(userName, password)VALUES(?,?)";
	String GET_USER = "SELECT * FROM `bank` WHERE userId=?";
	String GET_ALL = "SELECT * FROM `bank`";
	String UPDATE_USER = "UPDATE `bank` SET userName=?, password=? ,balance=? WHERE userId=?";
	String DELETE_USER = "DELETE FROM `bank` WHERE userId=?";
	String GET_UNAME = "SELECT `password` FROM `bank` WHERE userName=?";
	String UPDATE_BALANCE = "UPDATE `bank` SET balance=? WHERE userName=?";
	String GET_USER_BY_ID = "SELECT * FROM `bank` WHERE userName=?";


	

	
	 public bankDaoImpl()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection(url,uname,pass);
			
		}
	
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	
	

	@Override
	public void addUser(banking bank) {
try {
			
			PreparedStatement ps=con.prepareStatement(ADD_USER);
			ps.setString(1, bank.getUsername());
			ps.setString(2, bank.getPassword());
			
			
			int i = ps.executeUpdate();
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public banking getUser(int userId) {
		banking bank=null;
		try {
			
			PreparedStatement ps= con.prepareStatement(GET_USER);
			ps.setInt(1, userId);
			ResultSet res =ps.executeQuery();
			if(res.next())
			{
				int id = res.getInt("userId");
				String userName = res.getString("userName");
				 String password= res.getString("password");
				int balance = res.getInt("balance");
				
				
				
			 bank =new banking(userId, userName, password, balance);
			}
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return bank;
		

	
	}

	@Override
	public List<banking> getAll() {
	ArrayList<banking> li1= new ArrayList<banking>();
		
		try
		{
			Statement stmt=con.createStatement();
			ResultSet res=stmt.executeQuery(GET_ALL);
			
			while(res.next());
			{
				int id = res.getInt("userId");
				String userName = res.getString("userName");
				 String password= res.getString("password");
				int balance = res.getInt("balance");
				
				
				
			 banking bank =new banking(id, userName, password, balance);
			 li1.add(bank);
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return li1;
	}

	@Override
	public void deleteUser(int id) {

		try
		{
			PreparedStatement ps =con.prepareStatement(DELETE_USER);
			ps.setInt(1, id);
			int i = ps.executeUpdate();
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
			
	

	@Override
	public void updateUser(banking bank) {
		try
		{
			PreparedStatement ps =con.prepareStatement(UPDATE_USER);
			ps.setString(1, bank.getUsername());
			ps.setString(2, bank.getPassword());
			ps.setLong(3, bank.getBalance());
			
			int i =ps.executeUpdate();
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	
	

}
	public String getPassword(String s)
	{
		String t="";
		try
		{
			PreparedStatement ps=con.prepareStatement(GET_UNAME);
			ps.setString(1, s);
			ResultSet res=ps.executeQuery();
			if(res.next())
			{
				 t=res.getString("password");
			}
			
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return t;
	}
	
	public void updateBalance(int balance,String uname) {
		
		
		try
		{
			PreparedStatement ps =con.prepareStatement(UPDATE_BALANCE);
			ps.setInt(1, balance);
			ps.setString(2, uname);
			
			
			int i =ps.executeUpdate();
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		
		
	
	

}
	public banking getUserByName(String userName) {
		banking bank=null;
		try {
			
			PreparedStatement ps= con.prepareStatement(GET_USER_BY_ID);
			ps.setString(1, userName);
			ResultSet res =ps.executeQuery();
			if(res.next())
			{
				int id = res.getInt("userId");
				String userName1 = res.getString("userName");
				 String password= res.getString("password");
				int balance = res.getInt("balance");
				
				
				
			 bank =new banking(id, userName1, password, balance);
			}
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return bank;
		

	
	}

}
