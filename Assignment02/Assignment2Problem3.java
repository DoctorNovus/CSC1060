
/**
 * Assignment 2 Program 3
 * Multiple the digits of a 4-digit number together
 * 
 * @author Daniel Wedding
 * @version 0.0.1
 * @since 1.0
 */

import java.util.Scanner;

class Assignment2Problem3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter an integer from 1000 through 9999: ");
        int inputInt = myScanner.nextInt();
        int fourthInt = inputInt % 10;
        inputInt /= 10;
        int thirdInt = inputInt % 10;
        inputInt /= 10;
        int secondInt = inputInt % 10;
        inputInt /= 10;
        int firstInt = inputInt;

        System.out.println("Digits multiplied: " + firstInt + " * " + secondInt + " * " + thirdInt + " * " + fourthInt);
        System.out.println("Answer: " + (firstInt * secondInt * thirdInt * fourthInt));
    }
}