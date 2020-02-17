package com.revature.CarDealership.pojos;

import java.util.List;

//import com.revature.CarDealership.DAO.CarSerializationDAO;

public class Customer extends User {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 449667313234502584L;

	public Customer(String name, String userName, String password) {
		super(name, userName, password, "customer");
		// TODO Auto-generated constructor stub
	}

	private List<String> carsOwned;

	public List<String> getCarsOwned() {
		return carsOwned;
	}

	public void addCarsOwned(String identifier) {
		
//		String owner = this.getUserName();
//		Car cartochange = CarSerializationDAO.readCar(identifier);
//		cartochange.setBelongsTo(owner);
		
	}
	
	public void removeCarsOwned(String carsOwned) {
		this.carsOwned.remove(carsOwned);
	}
	
}
