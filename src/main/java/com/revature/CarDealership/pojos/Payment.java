package com.revature.CarDealership.pojos;

public class Payment {
	
	private int months;
	
	private int payment;

	public Payment(int months, int payment) {
		super();
		this.months = months;
		this.payment = payment;
	}

	public int getMonths() {
		return months;
	}

	public void setMonths(int months) {
		this.months = months;
	}

	public int getPaymentAmount() {
		return payment;
	}

	public void setPaymentAmount(int payment) {
		this.payment = payment;
	}
	
	
	

}
