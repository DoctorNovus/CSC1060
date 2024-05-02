package src.edu.csc1060.sorting;

public class BubbleSort {
    public static void sort(int[] arr) {
        if (arr == null || arr.length <= 1)
            return;

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;

        }

        
    }
}
