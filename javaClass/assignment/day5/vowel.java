/*Java Program to Check Whether an Alphabet is Vowel or Consonant*/
package javaClass.assignment;

import java.util.Scanner;

public class vowel {

    public static void main(String[] args) {

        char ch;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Character ");
        ch = scan.next().charAt(0);
        ch = Character.toUpperCase(ch);
        if(Character.compare(ch,'A')==0 || Character.compare(ch,'E')==0 || Character.compare(ch,'I')==0 || Character.compare(ch,'O')==0 || Character.compare(ch,'U')==0)
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }

}
