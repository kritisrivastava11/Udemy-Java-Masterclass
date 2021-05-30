package learnJava;

public class NumberOfDaysInMonth {
	public static boolean isLeapYear(int year) {
		if((year > 0) && (year < 10000)) {
			if(((year %4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	public static int getDaysInMonth(int month , int year) {
		if(((month < 1) || (month > 12)) || ((year < 1) || (year > 9999))) {
			return -1;
		}else {
			switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				return 31;
				
			case 4: case 6: case 9: case 11:
				return 30;
				
			}
			boolean Feburary = isLeapYear(year);
			if((month == 2) && Feburary) {
				return 29;
			}else {
				return 28;
			}
		}
	}

}
