package LearnJava;

public class Main {
	public static void main(String args[]) {
		int result=1+2;
		System.out.println("1+2= "+result);
		int previousResult=result;
		System.out.println("Previous result= "+ previousResult);
		result=result-1;
		System.out.println("3-1= "+result);
		System.out.println("Previous result= "+ previousResult);

		result=result*10;
		System.out.println("2*10= "+result);

		result=result/5;
		System.out.println("20/5= "+result);

		result=result%3;
		System.out.println("4%3= "+result);

		//result=result+1;
		result++;
		System.out.println("1+1= "+result);
		result--;
		System.out.println("2-1= "+result);

		//result=result+2
		result +=2;
		System.out.println("1+2= "+result);
		result *=10;
		System.out.println("3*10= "+result);

		//result=result/10;
		result /= 10;
		System.out.println("30/3= "+result);
		result -= 2;
		System.out.println("3-2= "+result);

		boolean isAlien=false;
		if(isAlien==false) {
			System.out.println("It is not an Alien!");
			System.out.println("And I am scared of aliens.");
		}
		
		int topScore=80;
		if(topScore<100) {
			System.out.println("You got the high score");
		}
		int secondTopScore=95;
		if((topScore>secondTopScore) && (topScore<100)) {
			System.out.println("Greater than second top score and less than 100");
		}
		if((topScore>90)||(secondTopScore<=90)) {
			System.out.println("Either or both of the statements are true");
		}
		int num=50;
//		if(num=50) {
//			System.out.println("This is an error");
//		}
		if(num==50) {
			System.out.println("This is true");
		}
		boolean isCar=false;
		if(isCar) {
			System.out.println("This is not supposed to happen");
		}
		if(!isCar) {
			System.out.println("This is not supposed to happen");
		}
	
		boolean wasCar=isCar ? true : false;
		if(wasCar) {
			System.out.println("wasCar is true");
		}
		isCar=true;
		wasCar=isCar ? true : false;
		if(wasCar) {
			System.out.println("wasCar is true");
		}
		

	}
}
