package com.kriti;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your year of birth ");
		boolean hasNextInt = scanner.hasNextInt();

		if(hasNextInt) {
			int yearOfBirth = scanner.nextInt();
			scanner.nextLine(); //handles next line character (enter key)

			System.out.println("Enter your Name ");
			String name = scanner.nextLine();

			int age = 2021-yearOfBirth;

			if(age >= 0 && age <= 100) {
				System.out.println("Your name is " +name+ " and you are " +age+ " years old.");
			}else {
				System.out.println("Invalid age entered");
			}
		}
		else {
			System.out.println("Year of birth cannot be parsed to integer");
		}
		scanner.close();
	}

}
