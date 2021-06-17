package com.kriti;

public class Main {

	public static void main(String[] args) {
		VipCustomer person1 = new VipCustomer("Kriti", 400.00, "kritigmail.com");
		System.out.println(person1.getName());
		VipCustomer person2 = new VipCustomer("Mini", 400.00);
		System.out.println(person2.getEmail());
		System.out.println(person2.getName());
	}

}
