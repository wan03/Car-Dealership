package com.revature.CarDealership.DAO;

import com.revature.CarDealership.pojos.User;

public interface LoginDAO {
	
	public void logIn(User u);
	
	public void logOut(User u);	
	
	public void addUser (User u);
	
	public void removeUser (User u);
	

}
