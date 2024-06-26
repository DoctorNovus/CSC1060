package src.edu.csc1060.sorting;



public class SelectionSort {
    public static void sort(int[] arr) {
        if (arr == null || arr.length <= 1)
            return;

        

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        
    }
}
