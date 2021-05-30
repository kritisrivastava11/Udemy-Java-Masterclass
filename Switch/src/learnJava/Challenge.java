package learnJava;

public class Challenge {

	public static void main(String[] args) {
		char switchValue = 'E';
		switch(switchValue) {
		case 'A':
			System.out.println("Character is A");
			break;
		case 'B':
			System.out.println("Character is B");
			break;
		case 'C': case 'D': case 'E':
			System.out.println("Character is " + switchValue);
			break;
		default:
			System.out.println("Not Found");
			break;

		}

		String month = "jAnuary";
		switch(month.toLowerCase()) {
		case "january":
			System.out.println("Jan");
			break;
		case "june":
			System.out.println("Jun");
			break;
		default:
			System.out.println("Not Found");
			break;
		}
	}

}
