package logicalprogram;

import java.util.Scanner;
 
public class CompoundInterest
{
 
    
    public static void main(String[] args) {
 
        
        double principal, rate, time, ci;
 
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Principal amount: ");
        principal = sc.nextDouble();
 
        
        System.out.print("Enter the rate of interest: ");
        rate = sc.nextDouble();
 
        
        System.out.print("Enter time in years: ");
        time = sc.nextDouble();
 
        
        ci = principal * Math.pow((1 + rate / 100), time) - principal;
 
       
        System.out.println("The Compound Interest is:: " + ci);
        System.out.println("The total amount paid (with interest) is:: " + (principal + ci));
 
    }
 
}