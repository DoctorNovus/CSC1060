
/**
 * Assignment 2 Program 2
 * Calculates tip based on bill
 * 
 * @author Daniel Wedding
 * @version 0.0.1
 * @since 1.0
 */

import java.util.Scanner;

class Assignment2Problem2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your bill total: ");
        double billTotal = myScanner.nextDouble();
        System.out.print("Enter your tip %: ");
        double tipTotal = myScanner.nextDouble();
        double tip = (tipTotal / 100) * billTotal;
        System.out.println("Your tip will be " + (Math.round(tip * 100.0) / 100.0));
        double purchaseTotal = billTotal + (tipTotal / 100) * billTotal;
        System.out.println("Your total bill will be " + (Math.round(purchaseTotal * 100.0) / 100.0));
    }
}