package Hello;

import static java.lang.System.out;

public class Conversion {

	public static void main(String[] args) {
		byte b;
		int i = 257;
		double d = 323.142;
		
		out.println("\nConversion of int to byte.");
		b = (byte) 1;
		out.println("i and b " + i + " " + b);
		out.println("\nConversion of double to int.");
		i = (int) d;
		out.println("d and i " + d + " " + i);
		out.println("\nConversion of double to byte.");
		b = (byte) d;
		out.println("d and b " + d + " " + b);
	}
	
}
