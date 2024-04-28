package com.bank;

public class banking {
	
	private int userId;
	private String username;
	private String password;
	private int balance;
	public banking() {
		super();
	}
	public banking(int userId, String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public banking(int userId, String username, String password, int balance) {
		super();
		this.username = username;
		this.password = password;
		this.balance = balance;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

}
