package com.kriti;

public class VipCustomer {
	private String name;
	private double creditLimit;
	private String email;
	public String getName() {
		return name;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public String getEmail() {
		return email;
	}
	
	public VipCustomer() {
		this("Default name", 50000.00, "default@mail.com");
	}
	public VipCustomer(String name, double creditLimit) {

		this(name, creditLimit, "unknown@mail.com");
	}
	public VipCustomer(String name, double creditLimit, String email) {

		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;

	}

}
