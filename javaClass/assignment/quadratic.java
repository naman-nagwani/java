/*
Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
can be found using a formula (Note: Take a, b and c as input values)
delta = b*b - 4*a*c
Root 1 of x = (-b + sqrt(delta))/(2*a)
Root 2 of x = (-b - sqrt(delta))/(2*a)
*/
package javaClass.assignment;

import java.util.Scanner;

public class quadratic {

    public static void main(String[] args) {
        int a,b,c;
        double delta,root1,root2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of A");
        a= scan.nextInt();
        System.out.println("Enter value of B");
        b= scan.nextInt();
        System.out.println("Enter value of C");
        c= scan.nextInt();
        delta = ((b*b)-(4*a*c));
        if (delta>=0){
            root1=(-1*b +Math.sqrt(delta))/(2*a);
            root2=(-1*b -Math.sqrt(delta))/(2*a);
            System.out.println("Value or root 1 is : "+root1);
            System.out.println("Value or root 2 is : "+root2);
        } else
            System.out.println("the problem has complex roots cannot be solved");
    }

}
