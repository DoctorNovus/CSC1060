import java.util.Random;

/**
 * Daniel Wedding
 * CompSci 1060
 * 04/26/24
 * 
 * Assignment 13 Problem 4
 * 
 */
public class Assignment13Problem4 {
    public static void main(String[] args) {
        int seed = 1000;
        int max = 100;

        Random rand = new Random(seed);

        for (int i = 0; i < 50; i++) {
            int randInt = rand.nextInt(max);
            System.out.println(String.format("Number %d: %d", i + 1, randInt));
        }
    }
}
