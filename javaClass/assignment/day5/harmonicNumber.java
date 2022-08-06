/*Harmonic Number
a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
(http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
b. I/P -> The Harmonic Value N. Ensure N != 0
c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
d. O/P -> Print the Nth Harmonic Value.
*/

package javaClass.assignment;

import java.util.Scanner;

public class harmonicNumber {

    public static void main(String[] args) {

        int n;
        double res=0.0;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Enter any number");
            n = scan.nextInt();
            if (n==0)
                System.out.println("Invalid Input");
        }while (n==0);
        for (int i=1;i<=n;i++) {
            res = res+(1.0/i);
        }
        System.out.println(res);
    }


}
