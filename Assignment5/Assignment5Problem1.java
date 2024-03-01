import java.util.Scanner;

/**
 * Daniel Wedding - CompSci 1060 - 02/23/24
 * Assignment5Problem1
 * Grade Calculator
 */
public class Assignment5Problem1 {
    public static void main(String[] args) {
        int score = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter your score: ");
            score = input.nextInt();

            if (score >= 60) {
                System.out.println("You passed the exam.");
            } else if (score > 0) {
                System.out.println("You did not pass the exam.");
            }
        } while (score > 0);
    }
}