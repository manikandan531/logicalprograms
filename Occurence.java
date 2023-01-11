package logicalprogram;

public class Occurence
{
	static String check="";
	public static void main(String[] args) 
	{
		String given="Hello";
		System.out.println(Occurence(given));
	}
	
	public static String Occurence(String s)
	{
		String empty="";
		String[] str=s.split("");
		for(int i=0;i<str.length;i++)
		{
			int count=1;
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					count++;
					str[j]="";
				}
			}
			if(str[i]!=" ")
				empty = empty+str[i]+":"+count+" ";
		}
		return empty + check;
	}
}
