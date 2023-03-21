/**
 * @(#)DEOCAMPO_A2.java
 *
 * DEOCAMPO_A2 application
 *
 * @author 
 * @version 1.00 2018/8/28
 */
 
public class DEOCAMPO_A2 {
    
	public static void main(String[] args)
	{	final int NUM_FACTS = 100;
		for(int i = 0; i < NUM_FACTS; i++)
			System.out.println( i + "! is " + factorial(i));
	}
	
	public static int factorial(int n)
	{	int result = 1;
		for(int i = 2; i <= n; i++)
			result *= i;
		return result;
	}
}