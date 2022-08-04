/*
Sum of three Integer adds to ZERO
a. Desc -> A program with cubic running time. Read in N integers and counts the
number of triples that sum to exactly 0.
b. I/P -> N number of integer, and N integer input array
c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
d. O/P -> One Output is number of distinct triplets as well as the second output is to
print the distinct triplets.
*/
package javaClass.assignment;

import java.util.Scanner;

public class triplets {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,x=0,y=1,count=0;
        System.out.println("Enter any Number");
        n = scan.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter any number");
            a[i] = scan.nextInt();
        }
        while (x!=n&&y!=n) {
            for (int i = 0; i < n; i++) {
                if (i == x || i == y ) {
                    continue;
                } else if ((a[x] + a[y] + a[i]) == 0) {
                    count++;
                    System.out.println(a[x] + "+" + a[y] + "+" + a[i] + " = 0");
                }
            }
            x++;
            y++;
        }
        System.out.println(count);

    }

}
