package week5.homework;

public abstract class App{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   AsteriskLogger test1 = new AsteriskLogger();
	   SpacedLogger test2 = new SpacedLogger();
	   test1.Log("Hockey");
	   test1.Error("Summit");
	   test2.Log("Stanley");
	   test2.Error("Cup");
		

	}

}
