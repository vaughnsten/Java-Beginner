package Hello;

import static java.lang.System.out;

public class NoChange {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		for(int x: nums) {
			out.print(x + " ");
			x *= 10;
		}
		
		out.println();
		
		for(int x : nums)
			out.print(x + " ");
		
		out.println();
	}
}
