package learnJava;

public class TeenNumberChecker {
	public static boolean hasTeen(int firstNum , int secondNum , int thirdNum){
		return (((firstNum >= 13) && (firstNum <= 19))
				|| ((secondNum >= 13) && (secondNum <= 19)) || ((thirdNum >= 13) && (thirdNum <= 19)));
	}
				
	public static boolean isTeen(int num){
		return ((num >= 13) && (num <= 19));
	}

}
