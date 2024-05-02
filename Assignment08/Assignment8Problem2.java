import java.util.Scanner;

/**
 * Daniel Wedding
 * CompSci 1060
 * 03/22/24
 * 
 * Assignment 8 Problem 2
 * 11th-integer comparator
 */
public class Assignment8Problem2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double inputInt = getInput(input);
        double digitCount = getDigitCount(inputInt);

        while (digitCount != 11.0) {
            System.out.println("Number is not 11 digits long. Please try again");
            inputInt = getInput(input);
            digitCount = getDigitCount(inputInt);
        }

        int[] digits = getDigits(inputInt);
        int eleventh = digits[10];

        for(int i = 0; i < digits.length - 1; i++){
            int digit = digits[i];
            if(digit > eleventh){
                System.out.printf("Digit %2d (%d) is greater than the 11th digit (%d)\n", i + 1, digit, eleventh);
            } else if(digit < eleventh){
                System.out.printf("Digit %2d (%d) is smaller than the 11th digit (%d)\n", i + 1, digit, eleventh);
            } else if(digit == eleventh){
                System.out.printf("Digit %2d (%d) is equal to the 11th digit (%d)\n", i + 1, digit, eleventh);

            }
        }
    }

    /**
     * Small function to simplify input loop
     * @param input Scanner
     * @return Input double
     */
    public static double getInput(Scanner input) {
        System.out.print("Enter your 11-digit number: ");
        return input.nextDouble();
    }


    /**
     * Gets the number of digits
     * @param num Double to process
     * @return How many digits in integer form
     */
    public static int getDigitCount(double num) {
        return String.format("%.0f", num).length();
    }

    /**
     * Gets the digits of a num in array form
     * @param num Inputted num
     * @return Digits as an array
     */
    public static int[] getDigits(double num){
        int dCount = getDigitCount(num);
        int[] digits = new int[dCount];

        String[] digitStr = String.format("%.0f", num).split("");
        for(int i = 0; i < digitStr.length; i++){
            digits[i] = Integer.parseInt(digitStr[i]);
        }

        return digits;
    }

}
