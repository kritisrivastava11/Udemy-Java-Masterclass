package laernJava;

public class Sum3and5Challenge {

	public static void main(String[] args) {
		int sum = 0, count = 0;
		for(int i=1; i<=1000; i++) {
			if((i % 3 == 0) && (i % 5 ==0)) {
				sum += i;
				System.out.println("Numbers that are divisible by 3 and 5 are = " + i);
				count++;
				if(count == 5) {
					break;
				}
			}
		}
		System.out.println("Sum = " +sum);

	}

}
