package Enabling;

//Write  a program that will store elements of an n x n array.
//The size of an nxn array should be at least 3. Size and elements are input from the user.
//Display the sum of the highlighted elements as shown below.


import java.util.Scanner;

public class DeOcampo_Array {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        int[][] array = new int[size][size];
        int sum = 0;
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                System.out.println("Enter the element at row " + i + " and column " + j + ": ");
                array[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                if (i == j)
                {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("The sum of the highlighted elements is: " + sum);
    }
}