package Hello;

import static java.lang.System.out;

public class VarDemo {

	public static void main(String[] args) {
		
		var avg = 10.0;
		out.println("Value of avg: " + avg);
		
		int var = 1;
		out.println("Value of var: " + var);
		
		var k = -var;
		out.println("Value of k: " + k);
	}
}
