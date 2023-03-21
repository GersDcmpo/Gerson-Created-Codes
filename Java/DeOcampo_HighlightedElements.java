package FinalEnabling;

import java.util.Scanner;

public class DeOcampo_HighlightedElements {

    public static void main(String[] args) {
        
    int row, column, sum = 0;
        
	Scanner input = new Scanner(System.in);

    System.out.print("Size of your array: "); 

    int n = input.nextInt();
    int array[][] = new int[n][n];
        
    for (column = 0; column < n; column++)
    {
        for(row = 0; row < n; row++)
        {
            System.out.print("Value for element [" + row + "] [" + column + "] : ");
            array[row][column] = input.nextInt();
        }
    }
        
        
    for (column = 0; column < n; column++)
    {
        for(row = 0; row < n; row++)
        {
            System.out.print(array[row][column] + " ");
        }
        System.out.println();
    }
    
    System.out.println();
        
    for (row = 0; row < n; row++)
    {
        for (column = 0; column < n; column++) 
        {
            if (row == column || (row + column + 1) == n)
            {
                sum += array[row][column];
            }
        }
	}

    System.out.println("Non diagonal = " + sum);      

    }
}