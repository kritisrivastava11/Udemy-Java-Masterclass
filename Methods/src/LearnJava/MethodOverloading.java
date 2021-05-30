package LearnJava;

public class MethodOverloading {

	public static void main(String[] args) {
		int newScore = calculateScore(500 , "Kriti");
		System.out.println("New Score is : " + newScore );
		calculateScore(75);
		calculateScore();

	}
	public static int calculateScore(int score , String playerName) {
		System.out.println(playerName + " player scored " + score + " points." );
		return score * 1000;
	}
	public static int calculateScore(int score) {
		System.out.println("Unnamed player scored " + score + " points." );
		return score * 1000;
	}
	public static int calculateScore() {
		System.out.println("No player name , No score" );
		return 0;
	}

}
