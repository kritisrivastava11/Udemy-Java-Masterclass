package laernJava;

public class Main {

	public static void main(String[] args) {
		for (int i = 2; i < 9; i++) {
			System.out.println(
					"\n 10000 at " + i + "% interest rate = " + (String.format("%.2f", calculateInterest(10000, i))));
		}

		System.out.println("\n**************************************");

		for (int i = 8; i > 1; i--) {
			System.out.println(
					"\n 10000 at " + i + "% interest rate = " + (String.format("%.2f", calculateInterest(10000, i))));
		}

	}

	public static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate / 100));
	}

}

