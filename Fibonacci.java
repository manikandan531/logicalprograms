package logicalprograms;


import java.util.Scanner;

public class Fibonacci //next number is a sum of previous two numbers
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the range");
		int n=s.nextInt();
		int a=0,b=01,c=0,sum=0;
		while(c<=n)
		{
			System.out.println(c);
			a=b;
			b=c;
			sum=sum+c;
			c=a+b;
		}
		System.out.println();
		System.out.println(sum);
	}
}
