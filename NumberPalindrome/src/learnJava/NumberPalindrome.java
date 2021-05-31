package learnJava;

public class NumberPalindrome {
	public static boolean isPalindrome(int number) {
	
		if(number <0) {
			number *= -1;
		}
		int reverse = 0;
		int n= number;
		while(n>0) {
			int lastDigit = n % 10;
			reverse = (reverse * 10) + lastDigit;
			System.out.println(reverse);
			n = n / 10;
			
		}
		if(reverse == number) {
			return true;
		}
		return false;
		
	}
}
