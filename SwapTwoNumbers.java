package logicalprogram;

public class SwapTwoNumbers {
	 
    public static void main(String[] args) 
    {
         
        int x = 20, y=30;
      
        System.out.println("x = "+x+", y= "+y);
               
        x = x + y;      
        y = x - y;      
        x = x - y;
         
        System.out.println("x = "+x+", y= "+y);
 
    }
 
}
