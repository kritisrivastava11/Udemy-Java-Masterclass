package learnJava;

public class DayOfTheWeekChallenge {

	public static void main(String[] args) {
		printDayOfTheWeek(-1);
		printDayOfTheWeeks(5);

	}
	public static void printDayOfTheWeek(int day) {
		switch(day) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid Day");
			break;
		}
	}
	public static void printDayOfTheWeeks(int anotherDay) {
		if(anotherDay == 0) {
			System.out.println("Sunday");
		}else if(anotherDay == 1) {
			System.out.println("Monday");
		}else if(anotherDay == 2) {
			System.out.println("Tuesday");
		}else if(anotherDay == 3) {
			System.out.println("Wednesday");
		}else if(anotherDay == 4) {
			System.out.println("Thursday");
		}else if(anotherDay == 5) {
			System.out.println("Friday");
		}else if(anotherDay == 6) {
			System.out.println("Saturday");
		}else {
			System.out.println("Invalid Day");
		}
		
	}

}
