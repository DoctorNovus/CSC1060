package src.edu.csc1060.sorting;



public class HeapSort {
    public static void sort(int[] arr) {        
        if (arr == null || arr.length <= 1)
            return;

        


        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            sort(arr, n, i);

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            sort(arr, i, 0);
        }

        
    }

    public static void sort(int[] arr, int n, int i) {
        

        int largest = i;
        int left = 2 * i + 1;

        int right = 2 * i + 2;
        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            sort(arr, n, largest);
        }

        
    }
}
