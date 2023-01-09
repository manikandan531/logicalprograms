package logicalprogram;

public class CheckPerfectNumber 
{
     
    public static void main (String[] args)
    {   
         
        System.out.println("All Perfect numbers between 1 - 1000:");   
         
        for (int i = 1; i < 1000; i++ )
        {   
            if (isPerfectNumber(i)) {
                System.out.println( i +" is a perfect number");
         }   
       }  
    } 
     
     
   
    static boolean isPerfectNumber(int number) {   
         
        int sum = 1;   
        
        for (int i = 2; i * i <= number; i++) {   
            if (number % i == 0) {   
                if(i * i != number) {   
                    sum = sum + i + number / i;   
                } else { 
                    sum = sum + i;  
                }
            }   
        }    
         
      
        if (sum == number && number != 1) {  
            return true;   
        }
         
        return false;   
    }
}