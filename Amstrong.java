package logicalprograms;

import java.util.Scanner;

public class Amstrong
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		if(isamstrong(n))
		{
			System.out.println(n+" is a amstrong number");
		}
		else
			System.out.println(n+" is not a amstrong number");
	}
	
	public static boolean isamstrong(int n)
	{
		int temp=n,sum=0;
		int dc=digitcount(n);
		
		//Step2 power of numbers
		while(temp!=0)
		{
			int x=temp%10;
			sum=sum+power(x,dc);
			temp/=10;
		}
		
		if(sum==n)
		{
			return true;
		}
		else
			return false;
}
	
	//Method to do x power n of each number
	public static int power(int x,int dc)
	{
		int p=1;
		for(int i=1;i<=dc;i++)
		{
			p=p*x;
		}
		return p;
	}
	
	//Step1 to count the digits
	public static int digitcount(int n)
	{
		int count=0;
		while(n!=0)
		{
			count++;
			n/=10;
		}
		return count;
	}
}
