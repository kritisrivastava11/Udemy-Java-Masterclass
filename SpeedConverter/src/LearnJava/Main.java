package LearnJava;

public class Main {

	
		public static void main(String args[]) {
			long inMiles = SpeedConverter.toMilesPerHour(1.5);
			System.out.println("Rounded in miles = " + inMiles);
			inMiles = SpeedConverter.toMilesPerHour(10.25);
			System.out.println("Rounded in miles = " + inMiles);
			inMiles = SpeedConverter.toMilesPerHour(-5.6);
			System.out.println("Rounded in miles = " + inMiles);
			inMiles = SpeedConverter.toMilesPerHour(25.42);
			System.out.println("Rounded in miles = " + inMiles);
			inMiles = SpeedConverter.toMilesPerHour(75.114);
			System.out.println("Rounded in miles = " + inMiles);
			
			SpeedConverter.printConversion(1.5);
			SpeedConverter.printConversion(10.25);
			SpeedConverter.printConversion(-5.6);
			SpeedConverter.printConversion(25.42);
			SpeedConverter.printConversion(75.114);
		}

	}

