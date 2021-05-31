package learnJava;

public class WhileAndDoWhileLoop {

	public static void main(String[] args) {
		int count = 6;
//		while(count != 6) {
//			System.out.println("Value of count = " +count);
//			count++;
//		}

		do {
			System.out.println("Value of count = " +count);
			count++;
			if(count > 100) {
				break;
			}
		}while(count != 6);

	}

}

