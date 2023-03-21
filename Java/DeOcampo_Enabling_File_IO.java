package InterJavaProg;

import java.io.*;
import java.util.*;

public class DeOcampo_Enabling_File_IO {
    public static void main (String[] args) throws FileNotFoundException
    {
        Scanner decode = new Scanner(new FileReader("grade.dat"));
        PrintWriter encode = new PrintWriter("average.txt");
        
        String fName, lName;
        double Score1, Score2, Score3, Score4, Score5, Average;
        
        while (decode.hasNext())
        {
        fName = decode.next();
        lName = decode.next();
        Score1 = decode.nextDouble();
        Score2 = decode.nextDouble();
        Score3 = decode.nextDouble();
        Score4 = decode.nextDouble();
        Score5 = decode.nextDouble();
        Average = (Score1 + Score2 + Score3 + Score4 + Score5) / 5;
        
        encode.println("First Name: " + fName);
        encode.println("Last Name: " + lName);
        encode.println("1st Test Score: " + Score1);
        encode.println("2nd Test Score: " + Score2);
        encode.println("3rd Test Score: " + Score3);
        encode.println("4th Test Score: " + Score4);
        encode.println("5th Test Score: " + Score5);
        encode.println("Average: " + Average);
        encode.println("");
        }
        
        decode.close();
        encode.close();
    }
}