package Hello;

import static java.lang.System.out;

public class MethodOverloading {

	public static void main(String[] args) {
		int newScore = calculateScore("Tim", 500);
		out.println("New score is " + newScore);
		calculateScore(75);
		calculateScore();
	}
	
	public static int calculateScore(String playerName, int score) {
		out.println("Player " + playerName + " scored " + score + " points");
		return score * 1000;
	}
	
	public static int calculateScore(int score) {
		out.println("Unnamed player scored " + score + " points");
		return score * 1000;
	}
	
	public static int calculateScore() {
		out.println("No player name, no player score.");
		return 0;
	}
	
}
