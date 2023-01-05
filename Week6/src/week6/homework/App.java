package week6.homework;

public class App extends Deck{

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Deck test = new Deck();
	
	test.newSetOfCards();
	test.shuffleDeck();
	Player.describe();
	Player.trackFinalScore();
	
	}
}
