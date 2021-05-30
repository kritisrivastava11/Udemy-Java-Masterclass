package learnJava;

public class SumOdd {
	public static boolean isOdd(int number) {
		if(number < 0) {
			return false;
		}else {
			if(number % 2 == 0) {
				return false;
			}
			return true;
		}
	}
	public static int sumOdd(int start , int end) {
		if((end >= start) && ((start >=0) && (end >=0))) {
			int sum=0;
			for(int i=start; i<= end; i++) {
				if(isOdd(i)) {
					sum += i;
				}
			}
			return sum;
		}else {
			return -1;
		}

	}
}