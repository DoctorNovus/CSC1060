import java.util.Scanner;

/**
 * Daniel Wedding
 * CompSci 1060
 * 03/08/23
 * 
 * Assignment 7 Problem 3
 * 
 */
public class Assignment7Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your i value: ");
        int inp = input.nextInt();

        System.out.printf("%11s | %11s\n", "i", "m(i)");
        System.out.printf("%22s\n", "-------------------------");

        for (int i = 1; i <= 2001; i += 100) {
            double pi = calculatePI(i);
            System.out.printf("%11d | %11.4f\n", i, pi);
        }

    }

    /**
     * Calculate the value of PI based on I
     * @param inti The value of I
     * @return PI
     */
    public static double calculatePI(int inti) {
        double pi = 0;

        for (int i = 1; i <= inti; i++) {
            double top = Math.pow(-1, (i + 1));
            double bottom = (2 * i) - 1;

            pi += (top / bottom);
        }

        pi = pi * 4;

        return pi;
    }
}
