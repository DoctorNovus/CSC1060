import java.util.Scanner;

/**
 * Assignment 3 Problem 1
 * Quadratic Equation Solver
 * 
 * @author Daniel Wedding
 * @version 0.0.1
 * @since 1.0
 */
public class Assignment3Problem1 {
    public static void main(String[] args) {
        // Scanner
        Scanner myScanner = new Scanner(System.in);

        // Prompts for input of a, b, and c
        System.out.print("Enter a, b, c (separated by spaces): ");
        String myInput = myScanner.nextLine();

        // Turns input into values
        String[] floats = myInput.split(" ");
        double a = Double.parseDouble(floats[0]);
        double b = Double.parseDouble(floats[1]);
        double c = Double.parseDouble(floats[2]);

        // Gets root count and processes root values
        double rootCount = Assignment3Problem1.getRootCount(a, b, c);
        getRoots(rootCount, a, b, c);

        // Closes out scanner
        myScanner.close();
    }

    /**
     * Gets the amount of roots in a quadratic formula
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static double getRootCount(double a, double b, double c){
        double discriminant = (b * 2) - 4 * a * c;
        if(discriminant > 0)
            return 2;
        else if(discriminant == 0){
            return 1;
        }

        return 0;
    }

    /**
     * Gets all roots from (a)x^2 + (b)x + c = 0
     * @param count Root Count
     * @param a
     * @param b
     * @param c
     */
    public static void getRoots(double count, double a, double b, double c){
        if(count == 2){
            float r1 = (float)getRootOne(a, b, c);
            float r2 = (float)getRootTwo(a, b, c);

            System.out.println("The equation has two roots, %s and %s".formatted(r1, r2));
        } else if(count == 1){
            float r1 = (float)getRootOne(a, b, c);
            System.out.println("The equation has one root, %s".formatted(r1));
        } else {
            System.out.println("The equation has no real roots.");
        }
    }

    /**
     * Gets the positive root from (a)x^2 + (b)x + c = 0
     * @param a
     * @param b
     * @param c
     * @return Value of the positive root
     */
    public static double getRootOne(double a, double b, double c){
        return (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
    }

    /**
     * Gets the negative root from (a)x^2 + (b)x + c = 0
     * @param a
     * @param b
     * @param c
     * @return Value of the negative root
     */
    public static double getRootTwo(double a, double b, double c){
        return (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
    }
}
