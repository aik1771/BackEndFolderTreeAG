package week6.homework;

import java.util.ArrayList;


public class Player {
	
	
	static ArrayList<String> hand = new ArrayList<>();
	static int trackscore1 =0;
	static int trackscore2 =0;
	static int drawCount=0;
	static int cardTurn=0;
	String name;
	static String endGame = "Game is about to end!";

	
	Player(String name1,int score)
	{
		this.name=name1;
	}
	

	public static void trackFinalScore()
	{
		if (trackscore1>trackscore2)
		{
			System.out.println("Player #1 won with the score "+trackscore1+" over Player #2 score "+trackscore2);
		}
		else if (trackscore1==trackscore2)
		{
			System.out.println("It's a draw no one got a point");
		}
		
		else if (trackscore1<trackscore2)
		{
			System.out.println("Player #2 won with the score "+trackscore2+" over Player #1 score "+trackscore1);
		}
	
		if (drawCount>0)
		{
			System.out.println("Number of pairs that ended in draw "+drawCount);
		}
		
		
	}
	
	public static void keepScore(String name,int score)
	{
		score+=1;
		System.out.println("Name: "+name+" score "+score);
		
	}
	
	public static String flip()
	{
		
		if(Deck.cardDeck.size()!=1)
		{
		System.out.println("Now I have "+Deck.cardDeck.size()+" cards in the deck we can still play");
		System.out.println("Inside flip method!");
		
		System.out.println("I'm about to remove the top card  "+Deck.cardDeck.get(0));
		System.out.println("The top card that will appear "+Deck.cardDeck.get(1));
		
		
		System.out.println("Top card is removed "+Deck.cardDeck.remove(0));
		
		
		System.out.println("Now I have "+Deck.cardDeck.size()+" cards in the deck");
		
		
		System.out.println("Let me check the score");
	
		
		
		incrementScore();
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		
		}
		
		
		if(Deck.cardDeck.size()==0)
		{
			System.out.println("Round passed with end cards "+Deck.cardDeck.size());
			return endGame;
		}
		else
		{
			System.out.println("Round passed with cards in play "+Deck.cardDeck.size());
		return Deck.cardDeck.get(0);
		
		}
	}
	public static void incrementScore()
	{
		System.out.println("Number of cards in the deck ");
		if(Deck.cardDeck.size()>1 )
		{
		String[] card1 = Deck.cardDeck.get(0).split("_");
		String[] card2 = Deck.cardDeck.get(1).split("_");
		int score1=Integer.parseInt(card1[0]);
		int score2=Integer.parseInt(card2[0]);
		
		System.out.println("Let me check Player1 score "+score1);
		System.out.println("Let me check Player2 score "+score2);
		
		if(score1>score2)
		{
		trackscore1+=1;
		keepScore("Player1",trackscore1);
		}
		
		else if(score1<score2)
		{
			trackscore2+=1;
		keepScore("Player2",trackscore2);
		}
		else if(score2==score2)
		{
		 drawCount+=1;
		 System.out.println("Draw count is "+drawCount);
		}
		}
		
		
	}
	public static void describe()
	{
		Deck set = new Deck();
	
		int size=set.cardDeck.size();
		System.out.println("Size of deck is "+size);
		Deck.cardDeck.add("0_Empty_Card");
		Deck.cardDeck.add("0_Empty_Card");
		System.out.println("Game Summary "+size+"\n");
		for (int i=0;i<size;i++)
		{
			System.out.println("Top card "+Deck.cardDeck.get(0));
			//System.out.println("Next card "+Deck.cardDeck.get(1));
			flip();
		
			Deck.cardDeck.get(0);
		
			flip();
			
			System.out.println("A set of cards goes to 1st player");
			System.out.println("A card goes to 2nd player");
			
		
		}
	    		
	}
	

}
