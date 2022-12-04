package week5.homework;

public class AsteriskLogger implements Logger{

	@Override
	public void Log(String x) {
		// TODO Auto-generated method stub
		System.out.println("***"+x+"***");
	}

	@Override
	public void Error(String x) {
		// TODO Auto-generated method stub
		System.out.println("***ERROR:"+x+"***");
		
	}

}
