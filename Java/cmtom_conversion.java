/**
 * @(#)cmtom_conversion.java
 *
 * cmtom_conversion application
 *
 * @author 
 * @version 1.00 2018/9/18
 */
import java.util.Scanner;

public class cmtom_conversion {
    
    public static void main (String[] args)  
    { 
        Scanner input = new Scanner(System.in);

        System.out.print("Input a value for cm: ");
        double cm = input.nextDouble();
        double meters = cm / 100.00;
        System.out.println(cm + " cm is " + meters + " meters");
 
    } 
} 
