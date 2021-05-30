package LearnJava;

public class FeetAndInchesToCentimeters {
	public static void main(String args[]) {
		calcFeetAndInchesToCentimeters(6 , -10);

		calcFeetAndInchesToCentimeters(157);

	}
	public static double calcFeetAndInchesToCentimeters(double feet , double inches) {
		if(feet >= 0.0d && ((inches >= 0.0d) && (inches <= 12.0d))) {
			double centimeters = ((inches * 2.54d) + ((feet * 12d)*2.54d));
			System.out.println(feet + " Feet and " + inches + " Inches equals to "
					+ centimeters +"cm");
			return centimeters;
		}else {
			System.out.println("Invalid feet or iches");
			return -1;
		}
	}
	public static double calcFeetAndInchesToCentimeters(double inches) {
		if(inches >= 0.0d) {
			double feet = (int) inches / 12;
			double remainingInches = (int) inches % 12;
			System.out.println(inches + " Inches is equal to " + feet + " Feet "
					+ remainingInches + " Inches ");
			return calcFeetAndInchesToCentimeters(feet , remainingInches);
		}else {
			return -1;
		}
	}

}
