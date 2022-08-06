/*Java Program to Swap Two Numbers*/

package javaClass.assignment;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        a = scan.nextInt();
        System.out.println("Enter any number");
        b = scan.nextInt();

        System.out.println("A : "+a);
        System.out.println("B : "+b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("A : "+a);
        System.out.println("B : "+b);

    }
}
