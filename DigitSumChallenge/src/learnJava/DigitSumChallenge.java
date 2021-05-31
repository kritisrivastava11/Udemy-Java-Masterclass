package learnJava;

public class DigitSumChallenge {

	public static void main(String[] args) {
		System.out.println("Sum of digits = " + sumDigits(125));
	}
	public static int sumDigits(int number) {
		if(number < 10) {
			return -1;
		}
		int sum = 0;
//		for(int i=number ; i>0; i /= 10) {
//			int digit = i % 10;
//			sum += digit;
//		}
		while(number > 0) {
			int digit = number % 10;
			sum += digit;
			number= number / 10;
		}
		return sum;
	}

}
