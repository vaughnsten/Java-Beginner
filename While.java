package Hello;

import static java.lang.System.out;

public class While {

	public static void main(String[] args) {
		
		int n = 10;
		
		while(n > 0) {
			out.println("tick " + n);
			n--;
		}
		
		int i, j;
		
		i = 100;
		j = 200;
		
		while(++i < --j);
		
		out.println("Midpoint is " + i);
		
	}
	
}
