package src.edu.csc1060.menus;

import java.util.Random;
import java.util.Scanner;

import src.edu.csc1060.ProjectSelector;

public class BitManipulationMenu {
    public void openMenu(Scanner input) {
        showMenu(input);
    }

    private void showMenu(Scanner input) {
        System.out.println("Bit Manipulation");
        System.out.println("+---------+----------+-------------+----------+");
        System.out.println("| Decimal | Binary   | Hexadecimal | Octal    |");
        System.out.println("+---------+----------+-------------+----------+");
        for (int i = 0; i <= 10; i++) {
            System.out.printf("| %7d | %8s | %11s | %8o |\n", i, Integer.toBinaryString(i), Integer.toHexString(i), i);
        }
        System.out.println("+---------+----------+-------------+----------+");

        // Random examples
        System.out.println("Random Examples:");
        Random random = new Random();
        int num1 = random.nextInt(100); 
        int num2 = random.nextInt(100); 
        System.out.println("+-------+-------+----------+--------+");
        System.out.println("| Num 1 | Num 2 | Operator | Result |");
        System.out.println("+-------+-------+----------+--------+");
        showValueOnGrid(num1, num2, "&", num1 & num2);
        showValueOnGrid(num1, num2, "|", num1 | num2);
        showValueOnGrid(num1, num2, "^", num1 ^ num2);
        showValueOnGrid(num1, num2, "~ (num1)", ~num1);
        showValueOnGrid(num1, num2, "~ (num2)", ~num2);
        System.out.println("+-------+-------+----------+--------+");

        ProjectSelector.stall(input);
    }

    private void showValueOnGrid(int num1, int num2, String operator, int result) {
        System.out.printf("| %-5d | %-5d | %-8s | %-6d |\n", num1, num2, operator, result);
    }
}
