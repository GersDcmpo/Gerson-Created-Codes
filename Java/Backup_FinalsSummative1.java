package FinalSummative;

import java.util.Scanner;

public class Backup_FinalsSummative1 {
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
        /* ================================================================ */
        /* ================================================================ */
        /* ================================================================ */



        /* ================================================================ */
        /* ================================================================ */
        /* ================================================================ */
        /* Instantiating the summary for all data to True */
        boolean rowEqual = true;
        boolean colEqual = true;
        boolean diag1Equal = true;
        boolean diag2Equal = true;

        /* Checking of each data if they have equal values,
            summary of data will be set to False if the data have no equal values*/
        for (int i = 0; i < n; i++)
        {
            if (row[i] != 0 && row[i] != n)
            {
                rowEqual = false;
            }
            if (col[i] != 0 && col[i] != n)
            {
                colEqual = false;
            }
        }
        if (diag1 != 0 && diag1 != n)
        {
            diag1Equal = false;
        }
        if (diag2 != 0 && diag2 != n)
        {
            diag2Equal = false;
        }

        // Checking each row, column, 1st diagonal, and 2nd diagonal if they are all 0s or 1s
        for (int i = 0; i < n; i++)
        {
            // Checking each row is all 0s or 1s
            if (row[i] == 0)
            {
                System.out.println("All 0s on row " + (i + 1));
            }
            else if (row[i] == n)
            {
                System.out.println("All 1s on row " + (i + 1));
            }

            // Checking each column is all 0s or 1s
            if (col[i] == 0)
            {
                System.out.println("All 0s on column " + (i + 1));
            }
            else if (col[i] == n)
            {
                System.out.println("All 1s on column " + (i + 1));
            }

            // Checking 1st diagonal is all 0s or 1s
            if (i == n)
            {
                if (diag1 == 0)
                {
                    System.out.println("All 0s on 1st diagonal");
                }
                else if (diag1 == n)
                {
                    System.out.println("All 1s on 1st diagonal");
                }
            }

            // Checking 2nd diagonal is all 0s or 1s
            if (i == n - 1)
            {
                if (diag2 == 0)
                {
                    System.out.println("All 0s on 2nd diagonal");
                }
                else if (diag2 == n)
                {
                    System.out.println("All 1s on 2nd diagonal");
                }
            }
        }

        /* Printing summary of row data if it has all 0s/1s or not */
        if (rowEqual)
        {
            System.out.println("Rows are all 0s or rows are all 1s.");
        }
        else
        {
            System.out.println("Rows does not have equal numbers.");
        }

        /* Printing summary of column data if it has all 0s/1s or not */
        if (colEqual)
        {
            System.out.println("Columns are all 0s or columns are all 1s.");
        }
        else
        {
            System.out.println("Columns does not have equal numbers.");
        }

        /* Printing summary of 1st diagonal data if it has all 0s/1s or not */
        if (diag1Equal)
        {
            System.out.println("1st diagonal is all 0s or 1st diagonal is all 1s.");
        }
        else
        {
            System.out.println("1st Diagonal does not have equal numbers.");
        }

        /* Printing summary of 2nd diagonal data if it has all 0s/1s or not */
        if (diag2Equal)
        {
            System.out.println("2nd diagonal is all 0s or 2nd diagonal is all 1s.");
        }
        else
        {
            System.out.println("2nd Diagonal does not have equal numbers.");
        }
    }
}
