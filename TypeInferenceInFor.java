package Hello;

import static java.lang.System.out;

public class TypeInferenceInFor {

	public static void main(String[] args) {
		
		out.println("Values of x: ");
		for(var x = 2.5; x < 100.0; x = x * 2)
			out.print(x + " ");
		
		out.println();
		
		int[] nums = { 1, 2, 3, 4, 5, 6};
		
		out.print("Values in nums array: ");
		for(var v : nums)
			out.print(v + " ");
		
		out.println();
	}
	
}
