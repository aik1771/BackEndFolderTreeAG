package week5.homework;

public class AsteriskLogger implements Logger{

	
	@Override
	public void Log(String x) {
		// TODO Auto-generated method stub
		int makeStars=("***"+x+"***").length();
		String starLine="";
		for(int i=0;i<makeStars;i++)
		{
			starLine+="*";
		}
		System.out.println(starLine+"\n"+"***"+x+"***"+"\n"+starLine+"\n");
	}

	@Override
	public void Error(String x) {
		// TODO Auto-generated method stub
		
		int makeStars=("***ERROR:"+x+"***").length();
		String starLine="";
		for(int i=0;i<makeStars;i++)
		{
			starLine+="*";
		}
		System.out.println(starLine+"\n"+"***ERROR:"+x+"***"+"\n"+starLine+"\n");
		
		
		
		
	}

}
