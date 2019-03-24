package Hello;

import static java.lang.System.out;

public class ForEach {

	
	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		
		for(int x : nums) {
			out.println("Value is: " + x);
			sum += x;
		}
		
		out.println("Summation: " + sum);
	}
}
