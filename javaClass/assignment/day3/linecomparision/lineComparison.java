package javaClass.assignment.day3.linecomparision;

import java.util.Scanner;

public class lineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        System.out.println("Enter Coordinates of First line");
        line line1 = new line();
        System.out.println("Enter Coordinates of Second line");
        line line2 = new line();
        equals(line1,line2);
        compareTo(line1,line2);

    }

    static void equals(line line1,line line2){
        if(line1.LENGTH == line2.LENGTH)
            System.out.println("line 1 and line2 two are equal");
        else
            System.out.println("line 1 and line2 two are not equal");
    }
    static void compareTo(line line1,line line2){
        if(line1.LENGTH == line2.LENGTH)
            System.out.println("line 1 and line2 two are equal");
        else if (line1.LENGTH>line2.LENGTH)
            System.out.println("line 1 is greater than line2");
        else
            System.out.println("line 2 is greater than line 1");
    }


}

class line{
    public int X1;
    public int Y1;
    public int X2;
    public int Y2;
    public double LENGTH;

    line(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x coordinates of first point ");
        this.X1 = scan.nextInt();
        System.out.println("Enter y coordinates of first point ");
        this.Y1 = scan.nextInt();
        System.out.println("Enter x coordinates of Second point ");
        this.X2 = scan.nextInt();
        System.out.println("Enter y coordinates of Second point ");
        this.Y2 = scan.nextInt();
        this.LENGTH = getLength(this.X1,this.Y1,this.X2,this.Y2);
    }

    public static double getLength(int x1, int y1,int x2,int y2) {
        double length;
        length = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        return length;
    }
}
