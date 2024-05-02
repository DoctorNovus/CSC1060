package src.edu.csc1060.menus;

import java.util.Scanner;

import src.edu.csc1060.ProjectSelector;
import src.edu.csc1060.sorting.BubbleSort;
import src.edu.csc1060.sorting.HeapSort;
import src.edu.csc1060.sorting.InsertionSort;
import src.edu.csc1060.sorting.MergeSort;
import src.edu.csc1060.sorting.SelectionSort;
import src.edu.csc1060.utils.UtilityTimer;

public class SortingMenu {
    public void openMenu(Scanner input) {
        showMenu(input);
    }

    private void showMenu(Scanner input) {
        int[] items = presentDataCollector(input);
        String sortingMethod = presentSortMethods(input);

        long startTime = UtilityTimer.getTime();

        switch (sortingMethod) {
            case "a":
                System.out.println("Running merge sort on data.");
                MergeSort.sort(items);
                break;

            case "b":
                System.out.println("Running heap sort on data.");
                HeapSort.sort(items);
                break;

            case "c":
                System.out.println("Running insertion sort on data.");
                InsertionSort.sort(items);
                break;

            case "d":
                System.out.println("Running selection sort on data.");
                SelectionSort.sort(items);
                break;

            case "e":
                System.out.println("Running bubble sort on data.");
                BubbleSort.sort(items);
                break;

            default:
                System.out.println("Unknown method, try again.");
                break;
        }

        long endTime = UtilityTimer.getTime();
        long duration = UtilityTimer.compareTime(startTime, endTime);

        System.out.println(String.format("Sorting Method took %.2fms", (float) duration / 1000000));

        System.out.print("Formatted Data: ");

        for (int i = 0; i < items.length; i++) {
            System.out.printf("%d ", items[i]);
        }

        System.out.print("\n");

        ProjectSelector.stall(input);
    }

    private String presentSortMethods(Scanner input) {
        System.out.println("Sorting Algorithms");
        System.out.println("+--------+---------------------------+");
        System.out.println("| Option | Description               |");
        System.out.println("+--------+---------------------------+");
        System.out.println("| A      | Merge Sort                |");
        System.out.println("| B      | Heap Sort                 |");
        System.out.println("| C      | Insertion Sort            |");
        System.out.println("| D      | Selection Sort            |");
        System.out.println("| E      | Bubble Sort               |");
        System.out.println("+--------+---------------------------+");
        System.out.print("Choose an option: ");

        return input.nextLine();
    }

    private int[] presentDataCollector(Scanner input) {
        input.nextLine();

        System.out.print("Enter your numbers: ");
        String[] itemsAsStrings = input.nextLine().split(" ");
        int[] items = new int[itemsAsStrings.length];

        for (int i = 0; i < itemsAsStrings.length; i++) {
            items[i] = Integer.parseInt(itemsAsStrings[i]);
        }

        return items;
    }
}
