package logicalprograms;

import java.util.Scanner;

public class CountDigit 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int count=0;
		System.out.println(n+ "has:");
		while(n!=0)
		{
			count++;
			n/=10;
		}
		System.out.println(count+"digits");
	}
	
}
