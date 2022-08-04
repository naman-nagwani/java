/*Leap Year
        a. I/P -> Year, ensure it is a 4-digit number.
        b. Logic -> Determine if it is a Leap Year.
        c. O/P -> Print the year is a Leap Year or not.*/

package javaClass.assignment;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        int year;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Enter a Year");
            year = scan.nextInt();

            if (year<=999 || year>=10000)
                System.out.println("Invalid Input");

        }while (year<=999 || year>=10000);

        if (year%4==0)
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }

}
