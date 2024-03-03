import java.util.Scanner;

/**
 * Daniel Wedding
 * CompSci 1060
 * 03/01/24
 * 
 * Assignment6Problem1
 * Flip Calculator
 */
public class Assignment6Problem1 {
    public static void main(String[] args) {
        double flipCount = 2000000;
        double headsCount = 0;
        double tailsCount = 0;

        for (int i = 0; i < flipCount; i++) {
            int choice = (int) Math.round(Math.random() * (2 - 1)) + 1;
            if (choice == 1)
                headsCount++;
            else if (choice == 2)
                tailsCount++;
        }

        System.out.printf("Flips: %.0f\n", flipCount);
        System.out.printf("Heads: %.0f (%.2f%%)\n", headsCount, headsCount > 0 ? (headsCount / flipCount) * 100 : 0);
        System.out.printf("Tails: %.0f (%.2f%%)\n", tailsCount, tailsCount > 0 ? (tailsCount / flipCount) * 100 : 0);
    }
}
