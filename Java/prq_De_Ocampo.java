/**
 * @(#)prq_De_Ocampo.java
 *
 * prq_De_Ocampo application
 *
 * @author 
 * @version 1.00 2018/9/25
 */
import java.util.Scanner;
public class prq_De_Ocampo {
    
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Input first fractional number: ");
    	double num1 = input.nextDouble();
    	System.out.print("Input second fractional number: ");
    	double num2 = input.nextDouble();
    	
    	System.out.println(" ");
    	System.out.println(" ");
    	System.out.println(" ");
    	
    	double sum = num1 + num2;
     	System.out.println("The sum of the two fractional number is: " + sum);
     	
	 	double dif = num1 - num2;
     	System.out.println("The difference of the two fractional number is: " + dif);
          	
    	double pro = num1 * num2;
     	System.out.println("The product of the two fractional number is: " + pro);
     	
      	double quo = num1 / num2;
     	System.out.println("The quotient of the two fractional number is: " + quo);
     	
    	double mod = num1 % num2;
     	System.out.println("The remainder of the two fractional number is: " + mod);
    }
}
