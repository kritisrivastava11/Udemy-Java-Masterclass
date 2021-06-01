package com.kriti;

public class NumberToWords {

	public static void numberToWords(int number){
		if(number < 0) {
			System.out.println("Invalid Value");
		}
		int reverseNumber = reverse(number);
		for(int i=1; i<=getDigitCount(number); i++) {
			int lastDigit = reverseNumber % 10;
			switch(lastDigit) {
			case 0:
				System.out.println("Zero");
				break;
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;
			default:
				System.out.println("Invalid Value");
				break;

			}
			reverseNumber /= 10;

		}
	}
	public static int reverse(int number) {
		int reverseNumber =0;

		while(number != 0) {
			int lastDigit = number % 10;
			reverseNumber = (reverseNumber * 10)+ lastDigit;
			number /= 10;
		}

		return reverseNumber;
	}

	public static int getDigitCount(int number) {
		if(number < 0) {
			return -1;
		}
		int count = 1;
		while(number > 9) {
			number /= 10;
			count++;
		}
		return count;
	}
}
