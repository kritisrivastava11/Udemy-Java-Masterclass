package learnJava;

public class EvenNumberChallenge {
	public static void main(String[] args) {
		int count = 0;
		System.out.println(isEvenNumber(9));
		int number = 4;
		while(number <= 80) {
			number++;
			if(!isEvenNumber(number)) {
				continue;
			}
			System.out.println("Even Number is = "+number);
			count++;
			if(count == 5) {
				break;
			}
		}
		System.out.println("Total umber Even Number is = "+ count);

	}
	public static boolean isEvenNumber(int number) {
		if((number % 2) == 0) {
			return true;
		}
		return false;
	}

}
