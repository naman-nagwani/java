/*Flip Coin and print percentage of Heads and Tails
a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
heads
c. O/P -> Percentage of Head vs Tails*/
package javaClass.assignment;

import java.util.Scanner;

public class FlipCoin {

    public static void main(String[] args) {

        int tail=0,no;
        float result;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter number of times to flip the coin");
            no = scan.nextInt();

            if (no<=0)
                System.out.println("Invalid Input");

        }while (no<=0);

        for (int i= 0;i<no;i++){
            if (Math.random()<0.5){
                tail++;
            }
        }
        result = ((float)tail/no*100.0f);
        System.out.println("************RESULT********************");
        System.out.println("Tails = " +result);
        System.out.println("Heads = " +(100-result));

    }

}