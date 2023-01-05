package logicalprograms;


import java.util.Scanner;

public class Palindrome //A palindrome number is a number that is same as after reverse
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		int temp=num;
		System.out.println("the number entered is "+num);
		int rev=0;
		while(num!=0)
		{
			int d=num%10;
			rev=(rev*10)+d;
			num/=10;
		}
		if(temp==rev)
		{
			System.out.println("number is palindrome");
		}
		else
			System.out.println("number is not a palindrome");
	}
}

