package com.kriti;

public class GreatestCommonDivisor {
	public static int getGreatestCommonDivisor(int first, int second) {
		if((first < 10) || (second < 10)) {
			return -1;
		}
//		//Using While loop
//		int i = first; // // can also use minimum to increase efficiency
//		while(first > 1) {
//			if((first % i == 0) && (second % i == 0)) {
//				return i;
//			}
//			i--;
//		}
//		return 1;
		
		//Using for loop
		int min = (first < second) ? first : second; //Finding minimum increases efficiency
		for(int i = min; i>1; i--) {
			if((first % i == 0) && (second % i == 0)) {
				return i;
			}
		}
		return 1;
	}
}
