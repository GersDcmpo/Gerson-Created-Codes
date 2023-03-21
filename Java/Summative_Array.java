/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cerveza
 */
package FinalSummative;
import java.util.Scanner;
public class Summative_Array {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        size = input.nextInt();
        
        int[][] twodim = new int[size][size];
        for(int x = 0; x < size; x++){
            for(int y = 0; y < size; y++){
                twodim[x][y] = (int)(Math.random() * 2);
                
            }
        }
                
        System.out.print("Elements of the array: \n");
        for(int x = 0; x < size; x++){
            for(int y = 0; y < size; y++){
                System.out.print(twodim[x][y]+"\t");
            }
            System.out.print("\n");
        }
        
     
        int r = 0, c = 0, d1 = 0, d2 = 0;
    
        for(int x = 0; x < size; x++){
            int tester = 0;
            for(int y = 0; y < size; y++){
                if(twodim[x][y] == 0){
                    tester++;
                }
                if(tester == size){
                    System.out.println("All 0s on row " + x); 
                    r++;
                }
            }
        }
     
        for(int x = 0; x < size; x++){
            int tester = 0;
            for(int y = 0; y < size; y++){
                if(twodim[x][y] == 1){
                    tester++;
                }
                if(tester == size){
                    System.out.println("All 1s on row " + x);
                    r++;
                }
            }
        }
     
        if(r == 0){
            System.out.println("Rows do not have equal numbers");
        }
     
        for(int y = 0; y < size; y++){
            int tester = 0;
            for(int x = 0; x < size; x++){
                if(twodim[x][y] == 0){
                    tester++;
                }
                if(tester == size){
                    System.out.println("All 0s on col " + y);
                    c++;
                }
            }
        }
     
        for(int y = 0; y < size; y++){
            int tester = 0;
            for(int x = 0; x < size; x++){
                if(twodim[x][y] == 1){
                    tester++;
                }
                if(tester == size){
                    System.out.println("All 1s on col " + y);
                    c++;
                }
            }
        }
    
        if(c == 0){
            System.out.println("Columns do not have equal numbers");
        }
       
        int tester = 0;
        for(int x = 0; x < size; x++){
            for(int y = 0; y < size; y++){
                if(x == y){
                    if(twodim[x][y] == 0){
                        tester++;
                    }
                    if(tester == size){
                        System.out.println("1st diagonal elements are all zero."); 
                        d1++;
                    }
                }
            }
        }
        
        tester = 0;
        for(int x = 0; x < size; x++){
            for(int y = 0; y < size; y++){
                if(x == y){
                    if(twodim[x][y] == 1){
                        tester++;
                    }
                    if(tester == size){
                        System.out.println("1st diagonal elements are all one."); 
                        d1++;
                    }
                }
            }
        }
       
        if(d1 == 0){
            System.out.println("1st diagonal does not have equal numbers");
        }
      
        tester = 0;
        for(int x = 1; x <= size; x++){
            if(twodim[x-1][size-x] == 0){
                tester++;
            }
            if(tester == size){
                System.out.println("The 2nd diagonal elements are all 0s");
                d2++;
            }   
        }
       
        tester = 0;
        for(int x = 1; x <= size; x++){
            if(twodim[x-1][size-x] == 1){
                tester++;
            }
            if(tester == size){
                System.out.println("2nd diagonal elements are all one."); 
                d2++;
            }   
        }
      
        if(d2 == 0){
            System.out.println("2nd diagonal does not have equal numbers");
        }
        
    }
    
    
    
}
