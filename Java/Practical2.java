/**
 * @(#)Practical2.java
 *
 * Practical2 application
 *
 * @author 
 * @version 1.00 2018/10/9
 */
import java.util.Scanner;
public class Practical2 {
    
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	double number,Q1,Q2,Q3,Q4,avrg,favrg,mtr,kmtr,rds;
    	
    	System.out.println("Input number");
    	System.out.println("1 - Average of 4 Quizzes");
    	System.out.println("2 - Meter to Kilometer Conversion");
    	System.out.println("3 - Area of a Circle");
    	System.out.println("4 - Exit");
    	
    	number = input.nextDouble();
    	
    	if(number = 1)
    	{	
    		System.out.println("Enter 4 quizzes");
    	
    		Q1 = input.nextDouble();
    		Q2 = input.nextDouble();
    		Q3 = input.nextDouble();
    		Q4 = input.nextDouble();
    		avrg = Q1+Q2+Q3+Q4;
    		favrg = avrg / 4;
    	
    		System.out.println("The average is: " + favrg);
    	}
		else if(number = 2)
		{
    		System.out.println("Convert meter to kilometer");
    		System.out.println(" ");
    		System.out.println("Input meter");
    	
    		mtr = input.nextDouble();
    		kmtr = mtr / 1000;
    	
    		System.out.println("That meter in kilometer is: " + kmtr);
		}
    }
}
