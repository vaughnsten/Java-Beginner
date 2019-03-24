package Hello;

import static java.lang.System.out;

public class Ternary {

	public static void main(String[] args) {
		
		int i, k;
		
		i = 10;
		k = i < 0 ? -i : i;
		out.print("Absolute value of ");
		out.println(i + " is " + k);
		
		i = -10;
		k = i < 0 ? -i : i;
		out.print("Absolute value of ");
		out.println(i + " is " + k);
		
	}
	
}
