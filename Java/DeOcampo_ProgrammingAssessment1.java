package InterJavaProg;

import java.util.Scanner;

public class DeOcampo_ProgrammingAssessment1 {
    public static void main (String [] args)
     {
        Scanner console = new Scanner(System.in);
        
        final int SECRET = 11;
        final double RATE = 12.50;
        
        System.out.print("Enter two integers:");
        int num1 = console.nextInt();
        int num2 = console.nextInt();
        
        System.out.println("The value of num1 = " + num1 +
                " and the value of num2 = " + num2);
        
        int newNum = (num1 * 2) + num2;
        System.out.println("The value of newNum = " + newNum);
        
        newNum = newNum + SECRET;
        System.out.println("The new value of newNum = " + newNum);
        
        System.out.println("Enter your last name: ");
        String name = console.next();
        
        System.out.println("Enter a decimal number between 0-70: ");
        double hoursWorked = console.nextDouble();
        
        double wages = RATE * hoursWorked;
        
        System.out.println("Name: " + name);
        System.out.println("Pay Rate: $" + RATE);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Salary: $" + wages);
     }
}