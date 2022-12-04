package hockeyTeam;

public class Player {
	
	private String firstName;
	private String lastName;
	private String position;
	private int rating;

	
	public Player() {}

	public Player(String firstName,String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Player(String firstName,String lastName,String positon,int rating)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.position=position;
		this.rating=rating;
		
	}
	
	
	public void intro()
	{
		System.out.println("Player name "+firstName+" "+lastName);
		System.out.println("I play as a "+position);
		System.out.println("My rating is"+rating);
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}

	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setRating(int rating)
	{
		this.rating=rating;
	}
	
	public int getRating()
	{
		return rating;
	}
	
	public void setPosition(String position)
	{
		this.position=position;
	}
	
	public String getPosition()
	{
		return position;
	}
}
