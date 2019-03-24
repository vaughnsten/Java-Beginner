package Hello;

import static java.lang.System.out;

public class IncDec {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c;
		int d;
		c = ++b;
		d = a++;
		c++;
		out.println("a = " + a);
		out.println("b = " + b);
		out.println("c = " + c);
		out.println("d = " + d);
	}
}
