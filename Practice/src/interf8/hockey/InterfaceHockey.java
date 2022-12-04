package interf8.hockey;

interface WaterBottleInterface
{
	String color = "Blue";
	void fillUp();
	void pourOut();
}
public class InterfaceHockey implements WaterBottleInterface{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(color);
		InterfaceHockey example = new InterfaceHockey();
		example.fillUp();
		example.pourOut();
		

	}

	@Override
	public void fillUp() {
		// TODO Auto-generated method stub
		System.out.println("It is full");
	}

	@Override
	public void pourOut() {
		// TODO Auto-generated method stub
		System.out.println("It is empty");
		
	}

}
