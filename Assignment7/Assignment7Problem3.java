import java.util.Scanner;

/**
 * Daniel Wedding
 * CompSci 1060
 * 03/08/23
 * 
 * Assignment 7 Problem 3
 * Calculate Occurences from User Input
 */
public class Assignment7Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = input.nextLine();
        System.out.print("Enter your character you want to find occurrences: ");
        char a = input.nextLine().charAt(0);

        int occurrences = count(str, a);

        System.out.println(String.format("Occurences Found: %d", occurrences));
    }

    public static int count(String str, char a) {
        int counter = 0;

        String[] parts = str.split("");
        for (String part : parts) {
            if (part.charAt(0) == a)
                counter++;
        }

        return counter;
    }
}
