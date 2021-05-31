package learnJava;

public class FirstLastDigitSum {
	public static int sumFirstAndLastDigit(int number) {
		if(number < 0) {
			return -1;
		}
		int sum =0;
		int lastDigit = number % 10;
		while(number > 0) {
			int firstDigit = number;
			number /= 10;
			sum = firstDigit + lastDigit;
		}
		return sum;
	}
}
