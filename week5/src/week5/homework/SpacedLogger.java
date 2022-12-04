package week5.homework;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String x) {
		// TODO Auto-generated method stub
		
		String[] array = x.split("");
		String temp=" ";
		for(int i=0;i<array.length;i++)
		{
			temp+=array[i]+" ";
		}
		System.out.println("***"+temp.trim()+"***");
		
	}

	@Override
	public void Error(String x) {
		// TODO Auto-generated method stub
		String temp=" ";
		String[] array = x.split("");
		for(int i=0;i<array.length;i++)
		{
			temp+=array[i]+" ";
		}
		System.out.println("***Error: "+temp.trim()+"***");
		
	}

}
