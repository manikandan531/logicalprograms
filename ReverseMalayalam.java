package logicalprograms;

public class ReverseMalayalam 
{
	public static void main(String[] args) 
	{
		String s="malayalam";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
			rev+=s.charAt(i);
		if(s.equals(rev))
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
		
	}
}

