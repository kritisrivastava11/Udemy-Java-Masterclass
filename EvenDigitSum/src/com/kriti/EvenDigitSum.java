package com.kriti;

public class EvenDigitSum {
	public static int getEvenDigitSum(int number) {
		if(number < 0) {
			return -1;
		}
		int sum = 0;
		while(number > 0) {
			int extractedNumber = number % 10;
			if((extractedNumber % 2) == 0) {
				sum += extractedNumber;
			}
			number /= 10;
		}
		return sum;
	}

}
