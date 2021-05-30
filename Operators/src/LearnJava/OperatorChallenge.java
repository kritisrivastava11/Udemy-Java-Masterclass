package LearnJava;

public class OperatorChallenge {

	public static void main(String[] args) {

		double myFirstValue=20.00d;
		double mySecondValue=80.00d;
		double myTotalValue=(myFirstValue+ mySecondValue) *100d;
		System.out.println("Total+ "+myTotalValue);
		double remainder= myTotalValue % 40.00d;
		System.out.println("Remainder= "+remainder);
		boolean finalValue= (remainder==0) ? true : false;
		System.out.println("Boolean value is: "+ finalValue);
		if(!finalValue) {
			System.out.println("Got some remainder");
		}


	}

}
