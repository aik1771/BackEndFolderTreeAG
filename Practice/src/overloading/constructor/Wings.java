package overloading.constructor;



public class Wings {
	
	String bread;
	String sauce;
	String spices;
	String toping;
	
	Wings(String bread,String sauce,String toping)
	{
		this.bread=bread;
		this.sauce=sauce;
		this.toping=toping;
	}
	
	
	Wings(String bread,String sauce,String toping,String spices)
	{
		this.bread=bread;
		this.sauce=sauce;
		this.toping=toping;
		this.spices=spices;
	}
	

}
