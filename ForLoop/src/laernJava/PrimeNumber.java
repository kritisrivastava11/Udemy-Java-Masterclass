package laernJava;

public class PrimeNumber {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 10; i <= 78; i++) {
			boolean prime = isPrime(i);
			if (prime) {
				System.out.println(i + " is a prime number");
				count++;
				if (count == 10) {
					break;
				}
			}
		}
	}

	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		for (int i = 2; i <= (long) Math.sqrt(n); i++) {
//			System.out.println("Looping :"+i);
			if ((n % i) == 0) {
				return false;
			}
		}

		return true;
	}
}