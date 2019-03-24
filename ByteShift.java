package Hello;

import static java.lang.System.out;

public class ByteShift {

	public static void main(String[] args) {
		byte a = 16, b;
		int i;
		
		i = a << 3;
		b = (byte) (a << 3);
		
		out.println("Original value of a: " + a);
		out.println("i and b: " + i + " " + b);
		
	}
	
}
