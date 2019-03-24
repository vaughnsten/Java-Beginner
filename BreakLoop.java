package Hello;

import static java.lang.System.out;

public class BreakLoop {

	
	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {
			out.print("Pass " + i + ": ");
			for(int j = 0; j < 100; j++) {
				if(j == 10) break;
				out.println(j + " ");
			}
			out.println();
		}
		out.println("Loops complete.");
	}
}
