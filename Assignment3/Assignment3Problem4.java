import java.util.Scanner;

/**
 * Assignment 3 Problem 4
 * Calculates ISBN-10 from first 9 digits of ISBN
 * 
 * @author Daniel Wedding
 * @version 0.0.1
 * @since 1.0
 */
public class Assignment3Problem4 {
    public static void main(String[] args) {
        // Gets user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN: ");
        String isbn9 = input.nextLine();
        // Converts digits to array
        String[] digitsStr = isbn9.split("");

        // Calculates checksum
        int checksum = Assignment3Problem4.getISBN10(digitsStr);

        // Converts checksum to X if 10, and prints result
        if (checksum == 10)
            System.out.println("Your ISBN-10 Number is %s".formatted(isbn9) + "X");
        else
            System.out.println("Your ISBN-10 Number is %s%s".formatted(isbn9, checksum));
    }

    /**
     * Gets ISBN-10 Checksum from digits array
     * @param digitsStr Digits of ISBN
     * @return Checksum
     */
    public static int getISBN10(String[] digitsStr) {
        int checksum = 0;

        for (int i = 0; i < digitsStr.length; i++) {
            checksum += Integer.parseInt(digitsStr[i]) * (i + 1);
        }

        return (checksum % 11);
    }
}
