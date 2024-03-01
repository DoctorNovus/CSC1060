/**
 * Assignment 2 Program 1
 * Convert Kilo to Miles and Visa Versa
 * 
 * @author Daniel Wedding
 * @version 0.0.1
 * @since 1.0
 */

import java.util.Scanner;

class Assignment2Problem1 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the number of miles: ");
        double inputMiles = myScanner.nextDouble();
        System.out.println("Your kilometers are " + inputMiles * 1.6);

        System.out.print("Enter the number of kilometers: ");
        double inputKilos = myScanner.nextDouble();
        System.out.println("Your miles are " + inputKilos / 1.6);
    }
}