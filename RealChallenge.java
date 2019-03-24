package Challenge;

import java.util.Scanner;

public class RealChallenge {

	public static void challenge() {
		Scanner scanner = new Scanner(System.in);
		

		System.out.println("Pick any number from 1 to 25: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Then pick any number from 1 to 4: ");
		int num2 = scanner.nextInt();
		
		
		switch(num2) {
			case 1:
				num1 += num1 * num1 + num1 % num1 / num1 - num1 * num1 + num1;
				System.out.println(num1);
				break;
			case 2:
				switch(num1) {
				case 1:
					System.out.println("A");
					break;
				case 2:
					System.out.println("B");
					break;
				case 3:
					System.out.println("C");
					break;
				case 4:
					System.out.println("D");
					break;
				case 5:
					System.out.println("E");
					break;
				case 6:
					System.out.println("F");
					break;
				case 7:
					System.out.println("G");
					break;
				case 8:
					System.out.println("H");
					break;
				case 9:
					System.out.println("I");
					break;
				case 10:
					System.out.println("J");
					break;
				case 11:
					System.out.println("K");
					break;
				case 12:
					System.out.println("L");
					break;
				case 13:
					System.out.println("M");
					break;
				case 14:
					System.out.println("N");
					break;
				case 15:
					System.out.println("O");
					break;
				case 16:
					System.out.println("P");
					break;
				case 17:
					System.out.println("Q");
					break;
				case 18:
					System.out.println("R");
					break;
				case 19:
					System.out.println("S");
					break;
				case 20:
					System.out.println("T");
					break;
				case 21:
					System.out.println("U");
					break;
				case 22:
					System.out.println("V");
					break;
				case 23:
					System.out.println("W");
					break;
				case 24:
					System.out.println("X");
					break;
				case 25:
					System.out.println("Y");
					break;
					default:
						System.out.println("Pick another number");
				}
			case 3:
				
				break;
		}
		
		scanner.close();
	}
}
