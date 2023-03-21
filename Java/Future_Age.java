/**
 * @(#)cmtom_conversion.java
 *
 * cmtom_conversion application
 *
 * @author 
 * @version 1.00 2018/9/18
 */
import java.util.Scanner;

public class Future_Age {
    
    public static void main (String[] args)  
    { 
        Scanner input = new Scanner(System.in);
		double age,f_age;
		
		
        System.out.print("Input your current age: ");
        
        age = input.nextDouble();
        f_age = age + 5;
        
        System.out.println("Your age after 5 years is... " + f_age + " years old" );
 
    } 
} 
