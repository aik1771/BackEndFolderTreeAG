package hockeyTeam;

public class Classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   Player player1 = new Player();
	   player1.setFirstName("Andrei");
	   player1.setLastName("Nazarov");
	   player1.setPosition("Left Wing");
	   player1.setRating(83);
	   
	   player1.intro();
	   
	   Player player2 = new Player("Kirill","Koltsov");
	   player2.intro();

	}

}
