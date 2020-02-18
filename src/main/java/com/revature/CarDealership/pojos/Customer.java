package com.revature.CarDealership.pojos;

import java.util.HashMap;
import java.util.List;

//import com.revature.CarDealership.DAO.CarSerializationDAO;

public class Customer extends User {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 449667313234502584L;

	public Customer(String name, String userName, String password) {
		super();
		this.setName(name);
		this.setUserName(userName);
		this.setPassword(password);
		this.setUserType("customer");
		this.addPayments(0, 0);
	}

	private HashMap <Integer, Integer> payments = new HashMap<Integer, Integer>();
	
	public HashMap <Integer, Integer> getPayments() {
		return payments;
	}

	public void addPayments(Integer months, Integer payment) {
		this.payments.put(months, payment);
	}
	
	

	
}
 