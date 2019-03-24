package Hello;

import static java.lang.System.out;

public class FindPrime {
	
	public static void main(String[] args) {
		
		int num;
		boolean isPrime;
		
		num = 1;
		
		if(num < 2) isPrime = false;
		else isPrime = true;
		
		for(int i=2; i <= num/i; i++) {
			if((num %1) == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) out.println("Prime");
		else out.println("Not Prime");
	}

}
