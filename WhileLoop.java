package Hello;

public class WhileLoop {

	public static void main(String[] args) {
		/*
		int count = 1;
		while(count != 6) {
			System.out.println("Count value is " + count);
			count++;
		}
		
		count = 1;
		do {
			System.out.println("Count value was " + count);
			count++;
		} while(count != 6);
		*/
		/*
		int numEven = 4;
		int finishNumber = 20;
		
		while(numEven <= finishNumber) {
			numEven++;
			if(!isEvenNumber(numEven)) {
				continue;
			}
			System.out.println("Even number " + numEven);
			*/
		
		int numEven = 4;
		int finishNumber = 20;
		int evenNumbersFound = 0;
		
		while(numEven <= finishNumber) {
			numEven++;
			if(!isEvenNumber(numEven)) {
				continue;
			}
			
			evenNumbersFound++;
			if(evenNumbersFound >= 5) {
				break;
			}
			System.out.println("Even number " + numEven);
		
		}
		System.out.println("Total even numbers found = " + evenNumbersFound);
	}
	
	public static boolean isEvenNumber(int numEven) {
		
		/*
		while(numEven % 2 == 0) {
			System.out.println("Even number is " + numEven);
			numEven++;
		}
		return 1;
	*/
		
		if((numEven % 2) == 0) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
