package com.kriti;

import java.util.Scanner;
public class InputCalculator {
	public static void inputThenPrintSumAndAverage() {
		Scanner scanner = new Scanner(System.in);
		int sum = 0, average = 0, counter = 0;
		while(true) {
			boolean isInt = scanner.hasNextInt();
			if(isInt) {
				int number = scanner.nextInt();
				counter++;
				sum += number;
				average = (int) Math.round((double)sum/counter);
			}else {
				break;
			}
			scanner.nextLine();
		}
		System.out.println("SUM = " +sum+ " AVG = " +average);
		scanner.close();
	}

}
//import java.util.Scanner;
//
//public class InputCalculator {
//    public static void inputThenPrintSumAndAverage(){
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        int count = 0;
//        
//        while(scanner.hasNextInt()){
//            sum += scanner.nextInt();
//            count++;
//            // scanner.nextLine(); // not really needed because we don't need to print an alert for invalid number
//        }
//        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/count));
//        scanner.close();
//    }
//}
