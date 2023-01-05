package week6.homework;

public class Card {
	private String value;
	private String name;
	public String getValue() {
		System.out.println("This contains a value from 2-14 representing cards 2-Ace");
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getName() {
		System.out.println("Example can be Ace of Diamonds, or Two of Hearts");
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
