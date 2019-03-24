package Hello;

public class ForLoop {

	public static void main(String[] args) {
		//calculateInterest(10000.00);
		
		int count = 0;
		for(int i=1; i<500; i++) {
			if(isPrime(i)) {
				count++;
				System.out.println("Number " + i + " is a prime number");
				if(count == 50) {
					System.out.println("Exiting for loop");
					break;
				}
			}
		}
		
	}

	public static double calculateInterest(double amount) {
		for(double i=2; i<8; i++)
			for(double j = 1; j<3; j++) {
			double mulAmount = j * amount;
			double RateAmount = (mulAmount * (i/100));
			
			System.out.println(mulAmount + " at " + (int) i + "% interest = " + RateAmount);
			}
		return amount;
	}
	
	
	public static boolean isPrime(int n) {
		if(n == 1) {
			return false;
		}
		
		for(int i=2; i<= (long) Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
