/**
 * @(#)highandlow.java
 *
 * highandlow application
 *
 * @author 
 * @version 1.00 2018/10/2
 */
import java.util.Scanner;
public class highandlow {
    
    public static void main(String[] args) {
    	Scanner num = new Scanner(System.in);
    	int num1,num2,num3;
    	// TODO, add your application code
    	System.out.print("Input number: ");
    	num1 = num.nextInt();
    	num2 = num.nextInt();
    	num3 = num.nextInt();
    	
    	
    	
    	if (num1 > num2 && num1 > num3)
    	{
    		System.out.println("Largest number is: " + num1);
    	}
    	if (num2 > num1 && num2  >num3)
    	{
    		System.out.println("Largest number is: " + num2);
    	}
    	if (num3 > num1 && num3 > num2)
    	{
    		System.out.println("Largest number is: " + num3);
    	}
    	
    	
    	
    	
    	if (num1 < num2 && num1 < num3)
    	{
    		System.out.println("Lowest number is: " + num1);
    	}
    	if (num2 < num1 && num2  < num3)
    	{
    		System.out.println("Lowest number is: " + num2);
    	}
    	if (num3 < num1 && num3 < num2)
    	{
    		System.out.println("Lowest number is: " + num3);
    	}
    }
}
