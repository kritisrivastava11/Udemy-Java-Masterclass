package LearnJava;

public class Main {
	public static void main(String args[]) {
		String myString="This is a String";
		System.out.println(myString);
		myString= myString + ", and this is more.";
		System.out.println(myString);
		myString= myString+"\u00A9 2019";
		System.out.println(myString);
		String numberString="225.44";
		numberString= numberString+ "54.89";
		System.out.println(numberString);
		String lastString="10";
		int myInt= 50;
		lastString=lastString+myInt;
		System.out.println("Last String is equal to ="+ lastString);
		double myDouble=435.89d;
		lastString=lastString+myDouble;
		System.out.println("Last String is equal to ="+ lastString);
		
	}

}
