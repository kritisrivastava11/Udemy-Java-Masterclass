package com.kriti;

public class Parsingstring {

	public static void main(String[] args) {
		String numberAsString = "2018";
		System.out.println("numberAsString = "+numberAsString);
		int number = Integer.parseInt(numberAsString);
		System.out.println("number = "+number);
		
		numberAsString += 1;
		number += 1;
		System.out.println("numberAsString = "+numberAsString);
		System.out.println("number = "+number);
		
		double numberInDouble = Double.parseDouble(numberAsString);
		numberInDouble += 1;
		System.out.println("numberInDouble = "+numberInDouble);
	}

}
