package JavaProgrammingMarathon;

import java.util.Scanner;

public class GameMarathon {

	public static void main(String[] args) {
		
		start();
	}
	
	public static void start() {
		String firstString = "Hello, I am Amanda. Growing up, I want to be an adventurer. Here I am, on my very first adventure to Mt. Kaio.";
		String secondString = "\nAmazing how big it is. I wonder what adventure awaits us here. Will you help me on my adventure?";
		
		System.out.println(firstString + secondString);
		startGame();
	}
	
	public static void startGame() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1 - Yes or 2 - No? ");
		int YesNo = scan.nextInt();
		
		if(YesNo == 1) {
			System.out.println("Yay, let us begin!");
			firstAdv((int)(Math.random() * 21), (int)(Math.random() * 21));
		}
		else if(YesNo == 2) {
			System.out.println("Okay :( Bye.");
			scan.close();
		}
		else {
			System.out.println("I didn't quite understand that.");
			start();
		}
		

	}
	
	public static int firstAdv(int firstQ, int secondQ) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Uh-oh. I think we're trapped!" + 
						   "\nAha! Here's the first question for us to solve so we can get out!");
		
		int answer = firstQ + secondQ;
		
		System.out.print(firstQ + " plus " + secondQ + " is equals to? ");
		int typeAns = scan.nextInt();
		
		if(answer == typeAns) {
			System.out.println("That is correct! Yay, we got out of the trap!");
		}
		else {
			System.out.println("Oh no! The answer is wrong and we're still trapped! :(");
		}
		
		scan.close();
		return 1;
	}
}
