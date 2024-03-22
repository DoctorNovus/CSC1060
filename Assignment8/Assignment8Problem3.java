import java.util.Scanner;

/**
 * Daniel Wedding
 * CompSci 1060
 * 03/22/24
 * 
 * Assignment 8 Problem 3
 * Number Counter; even & odd;
 */
public class Assignment8Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] collector = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int evens = 0;
        int odds = 0;

        boolean hasEnded = false;

        System.out.print("Enter numbers: ");
        while (hasEnded == false) {
            int numero = input.nextInt();

            if (numero != 0) {
                if (numero % 2 == 0)
                    evens++;
                else
                    odds++;

                collector[numero - 1]++;
            } else {
                hasEnded = true;
            }
        }

        System.out.printf("The number of odd numbers: %d\n", odds);
        System.out.printf("The number of even numbers: %d\n", evens);

        System.out.printf("%-3s| %-6s\n", "##", "Count");
        System.out.println("----------");
        for (int i = 0; i < collector.length; i++) {
            if (collector[i] == 0)
                continue;

            System.out.printf("%-3d| %-5s\n", i + 1, collector[i]);
        }
    }
}
