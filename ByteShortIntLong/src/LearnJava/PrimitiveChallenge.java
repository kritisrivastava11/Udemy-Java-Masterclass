package LearnJava;

public class PrimitiveChallenge {
	public static void main(String args[]){
		
		byte MyByteNum= 65;
		short MyShortNum= 23567;
		int MyIntNum= 5654369;
		long MyLongNum= 50000L+ 10L*(MyByteNum+ MyShortNum+ MyIntNum);
		System.out.println(MyLongNum);
		
		short MyShortTotal= (short)(1000+ 10*(MyByteNum+ MyShortNum+ MyIntNum));
		
	}

}
