/*Power of 2
        a. Desc -> This program takes a command-line argument N and prints a table of the
        powers of 2 that are less than or equal to 2^N.
        b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
        c. Logic -> repeat until i equals N.
        d. O/P -> Print the year is a Leap Year or not.*/

package javaClass.assignment;

import java.util.Scanner;

public class pow2 {
    public static void main(String[] args) {
        int N,result=1;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Enter any number");
            N = scan.nextInt();
            if (N<0||N>=31)
                System.out.println("Invalid Input");

        }while (N<0||N>=31);

        for (int i=1;i<=N;i++){
            result=result*2;
        }
        System.out.println(result);

    }
}
