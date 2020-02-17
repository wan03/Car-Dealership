package com.revature.CarDealership.pojos;

import java.io.Serializable;

public class Car implements Serializable {
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 8692202001251557485L;

	private String make;
	
	private String model;
	
	private String year;
	
	private double price;
	
	private String identifier;
	
	private String belongsTo;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getIdentifier() {
		
		identifier = make + model + year;
		return identifier;
	}
	
	public String getBelongsTo() {
		return belongsTo;
	}
	
	public void setBelongsTo(String belongsTo) {
		this.belongsTo = belongsTo;
	}
	
	@Override
	public String toString() {
		String p = String.valueOf(price);
		return make + " " + model + " " + year + " " + p;
	}
	
	public Car (String make, String model, String year, double price) {
		super();
		this.make =make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.belongsTo = "Dealership";
	}
	
	public Car () {
		super();
	}



}
