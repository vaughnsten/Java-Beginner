package JavaProgrammingMarathon;

import static java.lang.System.out;
import java.util.Scanner;

public class FirstMarathon {

	public static void main(String[] args) {
		EnterNum(0, 0, 0, 0);
		EnterNum(0, 0, 0);
		EnterNum();
	}
	
	private static long EnterNum(long firstNum, long secondNum, long thirdNum, long answer) {
		String total = "Total";
		String difference = "Difference";
		String product = "Product";
		String quotient = "Quotient";
		String given = " of the given numbers are ";
		Scanner scan = new Scanner(System.in);
		
		out.print("Type any number: ");
		firstNum = scan.nextInt();
				
		out.print("Type another number: ");
		secondNum = scan.nextInt();
				
		out.print("Type another number: ");
		thirdNum = scan.nextInt();
				
		out.print("To choose, type: 1 - to Add, 2 - to Subtract, 3 - to Multiply, or 4 - to Divide ");
		int choose = scan.nextInt();
		
		if(choose == 1) {
			answer = firstNum + secondNum + thirdNum;
			out.println(total + given + answer);
		}
		else if(choose == 2) {
			answer = firstNum - secondNum - thirdNum;
			out.println(difference + given + answer);
		}
		else if(choose == 3) {
			answer = firstNum * secondNum * thirdNum;
			out.println(product + given + answer);
		}
		else if(choose == 4) {
			answer = firstNum / secondNum / thirdNum;
			out.println(quotient + given + answer);
		}
		else {
			out.println("\rCan't understand you. Sorry.");
			EnterNum(firstNum, secondNum, thirdNum, answer);
		}
		
		return 1;
	}
	
	private static long EnterNum(long firstNum, long secondNum, long thirdNum) {
		Scanner scan = new Scanner(System.in);
		
		out.print("Did you enjoy that? Want another one? 1 - Yes 2 - No ");
		int YesNo = scan.nextInt();
		
		if (YesNo == 1) {
			out.print("Okay, type your first number: ");
			firstNum = scan.nextInt();
			
			out.print("Then, type your second number: ");
			secondNum = scan.nextInt();
			
			out.print("Finally, type your third number: ");
			thirdNum = scan.nextInt();
			
			long[] firstArray = { firstNum, secondNum, thirdNum };
			
			for(int i = 0; i < firstArray.length; i++) {
				firstArray[i] *= firstArray[i];
				out.println("For every " + i + " is an " + firstArray[i]);
				
			}
		}
		else if(YesNo == 2) {
			out.println("Until next time!");
			scan.close();
		}
		else {
			out.println("Can't understand you. Sorry");
		}
		scan.close();
		return 1;
	}
	
	private static void EnterNum() {
		out.println("That\'s all I can show you right now.");
	}
}
