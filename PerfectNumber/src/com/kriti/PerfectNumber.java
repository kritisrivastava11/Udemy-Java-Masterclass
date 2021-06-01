package com.kriti;

public class PerfectNumber {
	public static boolean isPerfectNumber(int number) {
		if(number < 1) {
			return false;
		}
		int sum = 0;
		int factor = 1;
		while(factor < number) {
			if((number % factor) == 0) {
				sum += factor;
			}
			factor++;
		}
		if(sum == number) {
			return true;
		}
		return false;
	}
}
