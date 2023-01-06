package logicalprogram;

public class FirstNonRepeatedCharacter 
{
	public static void main(String[] args)
	{
		String inputstr="teeter";
		
		for(char i:inputstr.toCharArray())
			if(inputstr.indexOf(i)==inputstr.lastIndexOf(i))
			{
				System.out.println("First non-repeating character is: "+i);
				break;
			}
	}
}
