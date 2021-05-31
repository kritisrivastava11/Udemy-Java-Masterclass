package com.kriti;

public class SharedDigit {
	public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
				if(((firstNumber < 10) || (firstNumber >= 100)) || ((secondNumber < 10) || (secondNumber > 99))) {
					return false;
				}
		//		//Since we are checking for only two digits therefore
		//		return (((firstNumber/10) == (secondNumber / 10)) || ((firstNumber / 10) == (secondNumber % 10)) 
		//				|| ((firstNumber % 10) == (secondNumber / 10)) || ((firstNumber % 10) == (secondNumber % 10)));



		//		//		Using for loop
		//		for(int i = firstNumber; i > 0; i /= 10) {
		//			for(int j = secondNumber; j > 0; j /= 10) {
		//				if(i%10 == j%10) {
		//					return true;
		//				}
		//			}
		//		}
		//		return false;

		//Using while loop
		int originalSecondNumber = secondNumber;
		while(firstNumber > 0) {
			while(secondNumber > 0) {
				if((firstNumber % 10) == (secondNumber % 10)) {
					return true;
				}
				secondNumber /= 10;
			}
			firstNumber /= 10;
			secondNumber = originalSecondNumber;
		}
		return false;
	}
}

