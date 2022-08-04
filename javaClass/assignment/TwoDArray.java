/*
2D Array
a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
standard input and printing them out to standard output.
b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with
OutputStreamWriter to print the output to the screen.
*/

package javaClass.assignment;

import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {
        int m,n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows :");
        m = scan.nextInt();
        System.out.println("Enter number of columns :");
        n = scan.nextInt();
        int a [][] = new int [m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.println("Enter any number");
                a[i][j]= scan.nextInt();
            }
        }
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }

}
