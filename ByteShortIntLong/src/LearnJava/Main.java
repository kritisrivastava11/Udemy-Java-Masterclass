package LearnJava;

public class Main {

	public static void main(String[] args) {
		int myValue= 10000;
		
		int minIntValue= Integer.MIN_VALUE;
		int maxIntValue= Integer.MAX_VALUE;
		System.out.println("Integer Minimum value =" + minIntValue);
		System.out.println("Integer Maximum value =" + maxIntValue);
		System.out.println("Busted Max value =" + (maxIntValue+1));
		System.out.println("Busted Min value =" + (minIntValue-1));
		
		int myMaxIntTest=2_147_483_647;
		
		byte minByteValue= Byte.MIN_VALUE;
		byte maxByteValue= Byte.MAX_VALUE;
		System.out.println("Byte Minimum value =" + minByteValue);
		System.out.println("Byte Maximum value =" + maxByteValue);
		
		short minShortValue= Short.MIN_VALUE;
		short maxShortValue= Short.MAX_VALUE;
		System.out.println("Short Minimum value =" + minShortValue);
		System.out.println("Short Maximum value =" + maxShortValue);
		
		long myLongValue=100;
		long minLongValue= Long.MIN_VALUE;
		long maxLongValue= Long.MAX_VALUE;
		System.out.println("long Minimum value =" + minLongValue);
		System.out.println("long Maximum value =" + maxLongValue);
		long bigLongLiteralValue= 2_147_483_647_234L;
		System.out.println(bigLongLiteralValue);
		
		short bigShortLiteralValue= 32767;
		
		int myTotal= (minIntValue/2);
		
		byte myNewByteValue= (byte) (minByteValue/2);
		
		short myNewShortValue= (short) (minShortValue/2);
		

	}

}
