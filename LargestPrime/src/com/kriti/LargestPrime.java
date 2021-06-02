package com.kriti;

public class LargestPrime {
	public static int getLargestPrime(int number) {
		//		if(number <= 0) {
		//			return -1;
		//		}
		//		boolean prime = false;
		//		for(int i=number; i>=0; i--) {
		//			if(number % i == 0) {
		//				prime = isPrime(i);
		//			}
		//			if(prime) {
		//				return i;
		//			}
		//		}
		//		return -1;
		//	}
		//		public static boolean isPrime(int n) {
		//			if (n == 1) {
		//				return false;
		//			}
		//			for (int i = 2; i <= (long) Math.sqrt(n); i++) {
		//				//				System.out.println("Looping :"+i);
		//				if ((n % i) == 0) {
		//					return false;
		//				}
		//			}
		//
		//			return true;
		//		}
		if(number <2) {
			return -1;
		}
		
		for(int i=2; i<= number/2; i++) {
			if(number % i == 0) {
				number /= i;
				i--;
			}
		}
		return number;

	}
}


