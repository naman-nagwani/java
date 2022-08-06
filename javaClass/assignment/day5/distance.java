/*
Write a program Distance.java that takes two integer command-line arguments x
and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
*/
package javaClass.assignment;

public class distance {

    public static void main(String[] args) {
        int x,y;
        double res;
        x=Integer.parseInt(args[0]);
        y=Integer.parseInt(args[1]);
        res = Math.sqrt((Math.pow(x,2)+Math.pow(y,2)));
        System.out.println(res);
    }

}
