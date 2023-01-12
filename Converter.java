package logicalprogram;

import java.util.Scanner;

public class Converter
{
	public static double CF(double celciusTemp) 
	{
		double celsius=(celciusTemp*9/5)+32;
		return celsius;
	}
	public static double FC(double fahrenheitTemp)
	{
		double fahrenheit=(fahrenheitTemp-32)*5/9;
		return fahrenheit;
	}
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("please provide celsius temp: ");
		double celsius=s.nextInt();
		double result1=Converter.CF(celsius);
		System.out.println("the value of "+celsius+" is"+result1+" fahrenheit");
		
		
		System.out.println("please provide fahrenheit temp: ");
		double fahrenheit=s.nextInt();
		double result2=Converter.FC(fahrenheit);
		System.out.println("the value of "+fahrenheit+" is"+result2+" celsius");
	}
}

