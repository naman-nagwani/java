package javaClass.assignment.day4.snakenladder;

import java.util.Random;

public class SnakeNLadder {
    static int POSITION=0; //current position
    static final int IS_LADDER=1;
    static final int IS_SNAKE=2;
    public static void main(String[] args) {
        System.out.println("Welcome to Snake And ladder");
        System.out.println("Current Position : " + POSITION);
        int dieNumber = dieRoll();
        System.out.println("Die Number is : " +dieNumber);
        action(dieNumber);
        System.out.println("Current Position : "+ POSITION);


    }

    private static void action(int dieNumber) {
        int option = (int) (Math.random() * 10) % 3;
        switch (option){
            case IS_LADDER:
                System.out.println("Yay... you got a Ladder");
                POSITION+=dieNumber;
                break;
            case IS_SNAKE:
                System.out.println("Oops it's a Snake");
                POSITION-=dieNumber;
                break;
            default:
                System.out.println("No Play");
        }
    }

    private static int dieRoll() {
        Random random = new Random();
        int dieNumber = random.nextInt(6)+1;
        return dieNumber;

    }
}
