package FinalEnabling;

import java.util.Scanner;

public class DeOcampo_2ndDiagonal {

    public static void main(String[] args)
    {
        
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
        
    for (column = 0; column < array.length; column++)
    {
        for(row = 0; row < array[0].length; row++)
        {
            if (row + column == array.length - 1)
            {
                sum += array[row][column];
            }
        }
	}

    System.out.println("2nd diagonal = " + sum);

    }
    
}