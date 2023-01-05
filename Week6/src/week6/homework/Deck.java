package week6.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	static String  diamonds = "diamonds";
	static String  clubs="clubs";
	static String  hearts="hearts";
	static String  spades="spades"; 
	static String J ="11_Joker";
	static String A= "14_Ace";
	static String Q = "12_Queen";
	static String K = "13_King";
	
	static ArrayList<String> cardDeck = new ArrayList<>();
	
	
	public static void shuffleDeck()
	{
		Collections.shuffle(cardDeck);
		System.out.println(cardDeck);
		
	}
	public static void newSetOfCards()
	{
		for(int type =2;type<11;type++)
		{
			try {
				cardDeck.add(String.valueOf(type)+"_of "+diamonds);
				cardDeck.add(String.valueOf(type)+"_of "+clubs);
				cardDeck.add(String.valueOf(type)+"_of "+hearts);
				cardDeck.add(String.valueOf(type)+"_of "+spades);
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		cardDeck.add(J+" of "+diamonds);
		cardDeck.add(J+" of "+clubs);
		cardDeck.add(J+" of "+hearts);
		cardDeck.add(J+" of "+spades);
		
		cardDeck.add(A+" of "+diamonds);
		cardDeck.add(A+" of "+clubs);
		cardDeck.add(A+" of "+hearts);
		cardDeck.add(A+" of "+spades);
		
		cardDeck.add(Q+" of "+diamonds);
		cardDeck.add(Q+" of "+clubs);
		cardDeck.add(Q+" of "+hearts);
		cardDeck.add(Q+" of "+spades);
		
		cardDeck.add(K+" of "+diamonds);
		cardDeck.add(K+" of "+clubs);
		cardDeck.add(K+" of "+hearts);
		cardDeck.add(K+" of "+spades);
		for (int i = 0; i < cardDeck.size();i++) 
		{ System.out.println(cardDeck.get(i)); 
		
		}
		
		System.out.println("Number of cards is #"+cardDeck.size());
	}
	
	

}
