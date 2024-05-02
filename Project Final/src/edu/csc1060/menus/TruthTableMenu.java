package src.edu.csc1060.menus;

import java.util.Scanner;

import src.edu.csc1060.ProjectSelector;

public class TruthTableMenu {
    public void openMenu(Scanner input) {
        showMenu(input);
    }

    private void showMenu(Scanner input) {

        // System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        System.out.println("Truth Table");
        System.out.println("+-------+-------+-------+-------+-------+-------+");
        System.out.println("| P     | Q     | AND   | OR    | XOR   | NOT   |");
        System.out.println("+-------+-------+-------+-------+-------+-------+");
        showExample(input, true, true);
        showExample(input, true, false);
        showExample(input, false, true);
        showExample(input, false, false);
        System.out.println("+-------+-------+-------+-------+-------+-------+");

        ProjectSelector.stall(input);
    }

    private void showExample(Scanner input, boolean p, boolean q) {
        System.out.printf("| %-5b | %-5b | %-5b | %-5b | %-5b | %-5b |\n", p, q, (p & q), (p | q), (p ^ q), (!p));
    }
}
