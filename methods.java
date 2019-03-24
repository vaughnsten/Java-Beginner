package Hello;

import static java.lang.System.out;

public class methods {

	public static void main(String[] args) {
	
	
	int highScore = calculateScore(true, 737, 5, 100);
	out.println("Your final score was " + highScore);
	
	
	highScore = calculateScore(true, 10000, 8, 200);
	out.println("Your final score was " + highScore);

	}
	
	
	
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
				
		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			//out.println("Your final score was " + finalScore);
			return finalScore;
		}
		
			return -1;
		}
}
