package logicalprogram;

import java.util.Scanner;

public class Split 
{
	static Scanner s=new Scanner(System.in);
	static String sp="";
	public static void main(String[] args) 
	{
		System.out.println("Enter some sentence");
		String sentence=s.nextLine();
		System.out.println(reverseword(sentence));
	}
	
	public static String reverseword(String str)
	{
		String[] sa=str.split(" ");
		for(int i=sa.length-1;i>=0;i--)
		{
			sp=sp+" "+sa[i];
		}
		return sp;
	}
}
