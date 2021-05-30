package LearnJava;

public class MethodChallenge {
	public static void main(String args[]) {

		int playerScorePosition= calculateHighScorePosition(1500);
		displayHighScorePosition( "Jack" , playerScorePosition);

		playerScorePosition= calculateHighScorePosition(900);
		displayHighScorePosition( "Harry" , playerScorePosition);

		playerScorePosition= calculateHighScorePosition(400);
		displayHighScorePosition( "Tim" , playerScorePosition);

		playerScorePosition= calculateHighScorePosition(50);
		displayHighScorePosition( "Stefan" , playerScorePosition);


	}
	public static void displayHighScorePosition( String playerName , int position) {
		System.out.println(playerName + " managed to get a postion " + position + 
				" on a high score table \n");
	}

	public static int calculateHighScorePosition(int score){
//		if(score >= 1000) {
//			return 1;
//		}
//		else if(score >= 500 ) {
//			return 2;
//		}
//		else if(score >= 100) {
//			return 3;
//		}
//
//		return 4;
//	}
		int position = 4;
		if(score >= 1000) {
			position = 1;
		}
		else if(score >= 500 ) {
			position = 2;
		}
		else if(score >= 100) {
			position = 3;
		}
		return position;

	}

}
