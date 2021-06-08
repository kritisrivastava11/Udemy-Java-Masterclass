package com.kriti;

public class Main {

	public static void main(String[] args) {
		Car i10 = new Car();
		Car venue = new Car();
		
		System.out.println("Model is : " +i10.getModel());
		i10.setModel("sports");
		System.out.println("Model is : " +i10.getModel());

	}

}
