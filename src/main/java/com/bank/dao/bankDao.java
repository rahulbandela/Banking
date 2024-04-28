package com.bank.dao;

import java.util.List;

import com.bank.banking;

public interface bankDao {
	
	public void addUser(banking bank);
	public banking getUser(int userId);
	public List<banking> getAll();
	public void deleteUser(int id);
	public void updateUser(banking bank);

}
