package coding.chalenge;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myIntArray = {3, 9, 23, 64, 2, 8, 28, 93, 74};
		int arraySize=myIntArray.length;
		int lastFirstValue =0;
		int ageAverage = 0;
		int totalNumberOfCharInString=0;
		int[] nameLengths = new int[10];
		int sumOfAllNamesChar=0;
		double[] myFirstDoubleArray = {3.0, 9.4, 23.5, 64.1, 2.2, 8.4, 28.5, 93.4};
		double[] mySecondDoubleArray = {14.0,32.0,23.7,56.3,4.9,1.0};
		
		
		
		String longName="";
		
		String[] myStringArray = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		lastFirstValue = myIntArray[arraySize-1]-myIntArray[0];
		System.out.println("When I subtract the value of the first element in the array from the value in the last element of the array I will get "+lastFirstValue);
		
		
		
		for (int i=0;i<myIntArray.length;i++)
		{
			ageAverage+=myIntArray[i];
		
		}
		System.out.println("Avg "+ageAverage);
		System.out.println("The new average age for #"+myIntArray.length + " of members is " +ageAverage/arraySize);
		
		for (int i=0;i<myStringArray.length;i++)
		{
			totalNumberOfCharInString+=myStringArray[i].length();
			
		}
		
		System.out.println("The average number of characters of "+myStringArray.length + " is " +totalNumberOfCharInString/myStringArray.length);
		
		
		for (int i=0;i<myStringArray.length;i++)
		{
			longName+=myStringArray[i]+" ";
			
		}
		
		System.out.println("Long name is of combined name in String with spaces is "+longName);
		
		
		//How do you access the last element of any array myIntArray[arraySize-1]
		
		//How do you access the first element of any array myIntArray[0];
		
		
		for (int i=0;i<myStringArray.length;i++)
		{
			nameLengths[i]=myStringArray[i].length();
			
		}
		
		for (int i=0;i<nameLengths.length;i++)
		{
			sumOfAllNamesChar+=nameLengths[i];
			
		}
		
		System.out.println("The sum of all the elements in the array "+sumOfAllNamesChar);
		System.out.println(print("Hello",3));
		System.out.println(printFullName("Jacob","Truba"));
		System.out.println("Is collection of numbers in array greater then 100 "+checkSumOfNumbers(myIntArray));
		System.out.println(checkDoubleAverage(myFirstDoubleArray));
		System.out.println(checkWhichDoubleAverageArrayIsBiggerInTheFirstArray(myFirstDoubleArray,mySecondDoubleArray));
		System.out.println(willBuyDrink(true,12.50));
		System.out.println(willBuyDrink(true,9.50));
		System.out.println(willBuyDrink(false,12.50));
		
	} 
	
	public static String print(String text, int loop)
	{  
		String holdName="";
		for(int i=0;i<loop;i++)
		{   
			holdName+=text;
			
		}
		
		return holdName;
		
	}
	
	public static String printFullName(String firstName,String lastName)
	{
		
		String fullName=" ";
		fullName = firstName +" "+lastName;
		
		return fullName;
	}
	
	public static boolean checkSumOfNumbers(int [] numbers)
	{
		
		boolean isSumGreaterThen100 = false;
		int totalCount=0;
		
		
		for (int number:numbers)
		{
			totalCount+=number;
			
		}
		
		if (totalCount>100)
		{
			isSumGreaterThen100 = true;
		}
		
		return isSumGreaterThen100;
		
	}
	
	public static double checkDoubleAverage(double set [])
	{
		double totalAverage=0;

		for (double number:set)
		{
			totalAverage+=number;
		}
		System.out.print("Average number for double array is ");
		return totalAverage/set.length;
	}

	public static boolean checkWhichDoubleAverageArrayIsBiggerInTheFirstArray(double set1[],double set2[])
	{
		boolean firstArrayGreater=false;
		double totalAverage1=0;
		double totalAverage2=0;
		
		for (double firstNumberSet:set1)
		{
			totalAverage1+=firstNumberSet;
		}
		
		for (double secondNumberSet:set2)
		{
			totalAverage2+=secondNumberSet;
		}
		
		if(totalAverage1/set1.length>totalAverage2/set2.length)
		{
			firstArrayGreater=true;
		}
		System.out.print("Is the average of 1st array of doubles greater then a 2nd average of array ");
		return firstArrayGreater;
	}
	
	public static boolean willBuyDrink(boolean isHotOutside,double moneyInPocket)
	{
		boolean status = false;
		//if statement using an && condition will check if it's true 
		if(isHotOutside && moneyInPocket>10.50)
		{
			status=true;
		}
		
		System.out.println("Is it hot outside "+status +" and if moneyInPocket is greater than 10.50 the final outcome will be");
		
		return status;
	}
}
