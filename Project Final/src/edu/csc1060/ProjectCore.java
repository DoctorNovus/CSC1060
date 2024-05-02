package src.edu.csc1060;

import java.util.Scanner;

public class ProjectCore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProjectSelector selector = new ProjectSelector();

        boolean isCommandReading = true;

        while (isCommandReading) {
            clearConsole();

            String selected = prompt(input);
            selector.selectOption(handleChosen(selected));

            if (selector.option.equals(ProjectOption.END)) {
                isCommandReading = false;
                System.out.println("Thanks for trying this project out!");
            } else
                isCommandReading = selector.openMenu(input);
        }

        input.close();
    }

    public static String prompt(Scanner input) {
        System.out.println("Main Menu");
        System.out.println("+--------+---------------------------+");
        System.out.println("| Option | Description               |");
        System.out.println("+--------+---------------------------+");
        System.out.println("| A      | ASCII Table               |");
        System.out.println("| B      | Truth Table               |");
        System.out.println("| C      | Bit Manipulation          |");
        System.out.println("| D      | Sudoku Board              |");
        System.out.println("| E      | Sorting Algorithms        |");
        System.out.println("+--------+---------------------------+");
        System.out.println("| End    | Ends the program          |");
        System.out.println("+--------+---------------------------+");

        System.out.print("Choose an option: ");

        return input.next();
    }

    public static void clearConsole() {
        System.out.print("\033\143");
    }

    public static ProjectOption handleChosen(String selected) {
        selected = selected.toLowerCase().trim();

        if (selected.equals("a"))
            return ProjectOption.ASCII;

        if (selected.equals("b"))
            return ProjectOption.TruthTable;

        if (selected.equals("c"))
            return ProjectOption.BitManipulation;

        if (selected.equals("d"))
            return ProjectOption.Sudoku;

        if (selected.equals("e"))
            return ProjectOption.SortingAlgs;

        if (selected.equals("end"))
            return ProjectOption.END;

        return ProjectOption.NONE;
    }

}