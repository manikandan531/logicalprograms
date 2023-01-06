package logicalprogram;

public class ArrayInReverseNumber 
{
	public static void main(String[] args) 
	{
		int [] arr= {1,2,3,4,5};
		System.out.print("original number");
		
		for(int i=0;i<arr.length;i++)
		System.out.println();
		System.out.print("Array in revese order");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}
}
