package LearnJava;

public class Main {
	public static void main(String[] args) {

		int highScore = calculatescore(true , 800 , 5 , 100);
		System.out.println("Final score is " + highScore);
		highScore = calculatescore(true , 10000 , 8 , 200);
		System.out.println("Final score is " + highScore);

	}

	public static int calculatescore(boolean gameOver, int score ,
			int levelCompleted , int bonus) {

		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			return finalScore;
		}
		return -1;
	}
}