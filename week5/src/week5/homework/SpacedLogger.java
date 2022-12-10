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
		
		int makeStars=("***"+temp.trim()+"***").length();
		String starLine="";
		for(int i=0;i<makeStars;i++)
		{
			starLine+="*";
		}
		System.out.println(starLine+"\n"+"***"+temp.trim()+"***"+"\n"+starLine+"\n");
		
		
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
		int makeStars=("***"+temp.trim()+"***").length();
		String starLine="";
		for(int i=0;i<makeStars;i++)
		{
			starLine+="*";
		}
		System.out.println(starLine+"\n"+"***"+temp.trim()+"***"+"\n"+starLine+"\n");
		
		
	}

}
