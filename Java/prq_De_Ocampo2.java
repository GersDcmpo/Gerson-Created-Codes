/**
 * @(#)prq_De_Ocampo2.java
 *
 * prq_De_Ocampo2 application
 *
 * @author 
 * @version 1.00 2018/9/25
 */
import java.util.Scanner;
public class prq_De_Ocampo2 {
    
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	

    	
    		System.out.print("Product Name: ");
    		String prodname = input.nextLine();
    		
    		System.out.print("Product Price: ");
    		double prodprice = input.nextDouble();
    		
    		System.out.print("Input quantity: ");
    		double quantity = input.nextDouble();
    		
    		double amountdue = prodprice * quantity;
    		System.out.println("Amount Due: " + amountdue);
    		
    		System.out.print("Amount Given: ");
    		double cash = input.nextDouble();
    		
	   		double change = cash - amountdue;
    		System.out.print("Total Change: " + change);

    }
}
