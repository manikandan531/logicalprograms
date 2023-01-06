package logicalprogram;

public class WithouttMultiplicationDivision
{
	static int Multiply(int x,int y)
	{	
	if(y==0)
	return 0;
	
	if(y>0)
	return (x + Multiply(x,y-1));
	
	if(y<0)
	return -Multiply(x,-y);
	return -1;
	
	}

	public static void main(String[] args)
	{
		System.out.println("\n" +Multiply(5,-11));

	}
}