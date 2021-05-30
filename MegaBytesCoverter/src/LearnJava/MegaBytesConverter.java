package LearnJava;

public class MegaBytesConverter {
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if( kiloBytes < 0) {
			System.out.println("Invalid Value");
		}else {
			int kb = kiloBytes % 1024;
			int kiloByteToMegaByte = (kiloBytes / 1024);
			System.out.println(kiloBytes + " KB = " + kiloByteToMegaByte + " MB and " + kb + " KB");
		}
	}
	

}
