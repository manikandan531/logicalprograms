package logicalprogram;

public class Anagram 
{
	public static void main(String[] args)
	{
		String s1="ARMY";
		String s2="MARY";
		
		if(s1.length()!=s2.length())
		{
			System.out.println(s1);
		}
		else
		System.out.println(checkAnagram(s1,s2));
	}
	
	public static String checkAnagram(String s1,String s2)
	{
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					count++;
				}
			}
		}
		
		if(count==s2.length())
		{
			return s1="Anagram";
		}
		else
			return s1;
	}
}