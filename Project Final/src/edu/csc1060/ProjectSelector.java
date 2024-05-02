package src.edu.csc1060;

import java.util.Scanner;

import src.edu.csc1060.menus.ASCIIMenu;
import src.edu.csc1060.menus.BitManipulationMenu;
import src.edu.csc1060.menus.SortingMenu;
import src.edu.csc1060.menus.SudokuMenu;
import src.edu.csc1060.menus.TruthTableMenu;

public class ProjectSelector {
    ProjectOption option;
    boolean busy = false;

    ASCIIMenu asciiMenu;
    TruthTableMenu truthTableMenu;
    BitManipulationMenu bitManipulationMenu;
    SudokuMenu sudokuMenu;
    SortingMenu sortingMenu;

    public ProjectSelector() {
        this.asciiMenu = new ASCIIMenu();
        this.truthTableMenu = new TruthTableMenu();
        this.bitManipulationMenu = new BitManipulationMenu();
        this.sudokuMenu = new SudokuMenu();
        this.sortingMenu = new SortingMenu();
    }

    public void selectOption(ProjectOption option) {
        this.option = option;
    }

    public boolean openMenu(Scanner input) {
        ProjectCore.clearConsole();

        boolean isRunning = true;
        this.busy = true;

        switch (option) {
            case ProjectOption.ASCII:
                asciiMenu.openMenu(input);
                break;

            case ProjectOption.TruthTable:
                truthTableMenu.openMenu(input);
                break;

            case ProjectOption.BitManipulation:
                bitManipulationMenu.openMenu(input);
                break;

            case ProjectOption.Sudoku:
                sudokuMenu.openMenu(input);
                break;

            case ProjectOption.SortingAlgs:
                sortingMenu.openMenu(input);
                break;

            default:
                break;
        }

        return isRunning;
    }

    public static void stall(Scanner input) {
        while (!input.nextLine().toLowerCase().equals("close")) {
            System.out.print("Enter 'close' to return to main menu: ");
        }
    }
}
