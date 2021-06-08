package com.kriti;

import java.util.Scanner;
public class ReadingUserInputChallenge {

	public static void main(String[] args) {
		System.out.println("Sum = "+sumOfNumbers());
	}
	public static int sumOfNumbers() {
		Scanner scanner = new Scanner(System.in);
		//		int i = 1;
		int sum = 0;
		int counter =0;
		//		while(i<=10){
		while(true) {
			int order = counter +1;
			System.out.println("Enter number #" +order+ ":");
			boolean hasNextInt = scanner.hasNextInt();
			if(hasNextInt) {
				int number = scanner.nextInt();
				counter++;
				sum += number;
				//				i++;

				if(counter == 10) {
					break;
				}
			}else {
				System.out.println("Invalid Number");
			}
			scanner.nextLine();
		}
		scanner.close(); //handle end of line (enter key)
		return sum;
	}

}
