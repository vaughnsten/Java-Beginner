package Hello;

import static java.lang.System.out;

public class IfKeywordAndCodeBlocks {

	public static void main(String[] args) {
	boolean gameOver = true;
	int score = 500;
	int levelCompleted = 5;
	int bonus = 100;
	
	/*
	if(score == 5000) {
		out.println("Your score was 5000.");
	}
	else if(score < 1000){
		out.println("Your score was less than 1000");
	}
	else {
		out.println("Got here");
	}
	*/
	
	if(gameOver) {
		int finalScore = score + (levelCompleted * bonus);
		out.println("Your final score was " + finalScore);
	}
	
	int score2 = 10000;
	int levelCompleted2 = 8;
	int bonus2 = 200;
	
	/*
	if(score == 5000) {
		out.println("Your score was 5000.");
	}
	else if(score < 1000){
		out.println("Your score was less than 1000");
	}
	else {
		out.println("Got here");
	}
	*/
	
	if(gameOver) {
		int finalScore2 = score2 + (levelCompleted2 * bonus2);
		out.println("Your final score was " + finalScore2);
	}
	
	}
}
