/*Java Program to Check Whether a Number is Even or Odd*/

package javaClass.assignment;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        a = scan.nextInt();
        if(a%2==0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }
}
