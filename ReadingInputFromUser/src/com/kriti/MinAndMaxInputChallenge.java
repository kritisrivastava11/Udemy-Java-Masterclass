package com.kriti;

import java.util.Scanner;
public class MinAndMaxInputChallenge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
//		boolean first = true;
		while(true) {
			System.out.println("Enter number");
			boolean isInt = scanner.hasNextInt();
			if(isInt) {
				int number = scanner.nextInt();
				
//				if(first) {
//					first = false;
//					min = number;
//					max = number;
//				}
				if(number > max) {
					max = number;
				}
				if(number < min) {
					min = number;
				}
			}else {
				break;
			}
			scanner.nextLine();
		}
		System.out.println("Maximum number = " +max+ ", Minimum number = " +min);
		scanner.close();
	}

}
