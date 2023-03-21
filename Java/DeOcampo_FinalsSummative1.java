package FinalSummative;

import java.util.Scanner;

public class DeOcampo_FinalsSummative1 {
    public static void main(String[] args)
    {
        /* Variable input as Scanner for User's Input */
        Scanner input = new Scanner(System.in);

        
        /* Int n for the Array Size given by the User's Input */
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();


        /* Instantiating 2D Array with randomized values between 0 and 1 */
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                array[i][j] = (int) (Math.random() * 2);
            }
        }


        /* Displaying the 2D Array with randomized values */
        System.out.println("The array is: ");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


        /* Instantiating row, column, 1st diagonal, and 2nd diagonal */
        int[] row = new int[n];
        int[] col = new int[n];
        int diag1 = 0;
        int diag2 = 0;


        /* Adding each values for each row, column, 1st diagonal, and 2nd diagonal */
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                row[i] += array[i][j];
                col[j] += array[i][j];
                if (i == j)
                {
                    diag1 += array[i][j];
                }
                if (i + j == n - 1)
                {
                    diag2 += array[i][j];
                }
            }
        }


        /* Instantiating boolean for row and column */
        boolean rowCheck = false;
        boolean colCheck = false;


        /* Checking and Printing row that has all 0s or 1s each and printing it */
        for (int i = 0; i < n; i++)
        {
            if (row[i] == 0)
            {
                System.out.println("All 0s on row " + (i));
                rowCheck = true;
            }
            else if (row[i] == n)
            {
                System.out.println("All 1s on row " + (i));
                rowCheck = true;
            }
        }
        if (rowCheck == false)
        {
            System.out.println("Rows does not have equal numbers.");
        }


        /* Checking and Printing column that has all 0s or 1s each and printing it */
        for (int i = 0; i < n; i++)
        {
            if (col[i] == 0)
            {
                System.out.println("All 0s on column " + (i));
                colCheck = true;
            }
            else if (col[i] == n)
            {
                System.out.println("All 1s on column " + (i));
                colCheck = true;
            }
        }
        if (colCheck == false)
        {
            System.out.println("Columns does not have equal numbers.");
        }


        /* Checking and Printing 1st diagonal that has 0s or 1s and printing it */
        if (diag1 == 0)
        {
            System.out.println("All 0s on 1st diagonal");
        }
        else if (diag1 == n)
        {
            System.out.println("All 1s on 1st diagonal");
        }
        else
        {
            System.out.println("1st Diagonal does not have equal numbers.");
        }


        /* Checking and Printing 2nd diagonal that has 0s or 1s and printing it */
        if (diag2 == 0)
        {
            System.out.println("All 0s on 2nd diagonal");
        }
        else if (diag2 == n)
        {
            System.out.println("All 1s on 2nd diagonal");
        }
        else
        {
            System.out.println("2nd Diagonal does not have equal numbers.");
        }
    }
}
