package logicalprogram;

public class MissingNumber 
{
	public static void main(String[] args) 
	{
		
		int[]  arr1= {7,5,6,1,4,2};
	
		System.out.println("Missing Number from array arr1:"+missingnumber(arr1));
		
		int[] arr2= {5,3,1,2};
		
		System.out.println("Missing Number from array arr2:"+missingnumber(arr2));
	}
 	
	public static int missingnumber(int [] arr)
	{
		int n=arr.length+1;
		
		int sum =n*(n+1)/2;
		
		int restsum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			restsum+=arr[i];
		}
		
		int missingnumber=sum-restsum;
		
		return missingnumber;
	}
}
