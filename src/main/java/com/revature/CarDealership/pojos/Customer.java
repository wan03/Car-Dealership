package com.revature.CarDealership.pojos;

import java.util.List;

public class Customer extends User {
	
	private List<String> carsOwned;

	public List<String> getCarsOwned() {
		return carsOwned;
	}

	public void addCarsOwned(String carsOwned) {
		this.carsOwned.add(carsOwned);
	}
	
	public void removeCarsOwned(String carsOwned) {
		this.carsOwned.remove(carsOwned);
	}
	
}
