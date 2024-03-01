import java.util.Scanner;

/**
 * Assignment 3 Problem 2
 * 4 numbers multiplied by one another, based on AdditionQuiz.java from p.g. 77
 * 
 * @author Daniel Wedding
 * @version 0.0.1
 * @since 1.0
 */
public class Assignment3Problem2 {
    public static void main(String[] args) {
        // Calculates 4 random numbers based on time
        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 10 % 10);
        int number3 = (int) (System.currentTimeMillis() / 100 % 10);
        int number4 = (int) (System.currentTimeMillis() / 100 % 10);

        // Grab user input based on 4 numbers multiplied by one another
        Scanner input = new Scanner(System.in);
        System.out.print("What is %s * %s * %s * %s? ".formatted(number1, number2, number3, number4));
        int answer = input.nextInt();

        // Tells user if their answer is right or wrong
        System.out.println("%s * %s * %s * %s = %s is %s".formatted(number1, number2, number3, number4, answer,
                ((number1 * number2 * number3 * number4) == answer)));
    }
}
