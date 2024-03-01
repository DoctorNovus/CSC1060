
/**
 * Assignment 2 Program 4
 * Calculate BMI
 * 
 * @author Daniel Wedding
 * @version 0.0.1
 * @since 1.0
 */

import java.util.Scanner;

class Assignment2Problem4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your Weight (pounds): ");
        int weightPounds = myScanner.nextInt();
        System.out.print("Enter your height (inches): ");
        int heightInches = myScanner.nextInt();

        double weightKilos = weightPounds / 2.205;
        double heightMeters = heightInches / 39.37;

        double bmiValue = weightKilos / Math.pow(heightMeters, 2);     
        System.out.println("Your BMI Value: " + (Math.round(bmiValue * 10.0) / 10.0));   
    }
}