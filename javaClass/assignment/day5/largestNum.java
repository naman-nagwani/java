/*Java Program to Find the Largest Among Three Numbers*/

package javaClass.assignment;

import java.util.Scanner;

public class largestNum {
    public static void main(String[] args) {
        int a,b,c,res;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        a = scan.nextInt();
        System.out.println("Enter any number");
        b = scan.nextInt();
        System.out.println("Enter any number");
        c = scan.nextInt();
        res = a>b?a:b;
        res = c>res?c:res;

        System.out.println(res+" is Largest number");
    }
}
