package LearnJava;

public class Main {

	public static void main(String[] args) {
		checkNumber(34);
		checkNumber(-9);
		checkNumber(0);

	}
	public static void checkNumber(int number) {
		if(number > 0) {
			System.out.println("Number " + number + " is Positive");
		}else if(number < 0){
			System.out.println("Number " + number + " is Negative");
		}else {
			System.out.println("Number " + number + " is Zero");
		}
	}

}
