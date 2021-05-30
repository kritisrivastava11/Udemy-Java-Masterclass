package LearnJava;

public class Main {
	public static void main(String args[]) {
		
		float minFloatValue= Float.MIN_VALUE;
		float maxFloatValue= Float.MAX_VALUE;
		System.out.println("Float Minimum value =" + minFloatValue);
		System.out.println("Float Maximum value =" + maxFloatValue);
		
		double minDoubleValue= Double.MIN_VALUE;
		double maxDoubleValue= Double.MAX_VALUE;
		System.out.println("Double Minimum value =" + minDoubleValue);
		System.out.println("Double Maximum value =" + maxDoubleValue);
		
		int myIntValue= 5/3;
		float myFloatValue= 5f/3f;
		double myDoubleValue= 5d/3d;
		System.out.println("My int value =" + myIntValue);
		System.out.println("My float value =" + myFloatValue);
		System.out.println("My double value =" + myDoubleValue);
		
		double pi= 3.1415927d;
		double anotherNum= 300_567.89_3d;
		System.out.println(pi);
		System.out.println(anotherNum);
	}

}
