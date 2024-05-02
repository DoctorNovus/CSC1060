package src.edu.csc1060.sorting;



public class MergeSort {
    public static void sort(int[] arr) {
        if (arr == null || arr.length <= 1)
            return;

        

        int[] temp = arr.clone();
        sort(arr, temp);

        
    }

    public static void sort(int[] arr, int[] temp) {
        sort(arr, temp, 0, arr.length - 1);
    }

    public static void sort(int[] arr, int[] temp, int left, int right) {
        

        if (left < right) {
            int mid = (left + right) / 2;

            // Split Into Two
            sort(arr, temp, left, mid);
            sort(arr, temp, mid + 1, right);
            sort(arr, temp, left, mid, right);
        }

        
    }

    public static void sort(int[] arr, int[] temp, int left, int mid, int right) {
        

        for (int i = left; i <= right; i++)
            temp[i] = arr[i];

        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j])
                arr[k++] = temp[i++];
            else
                arr[k++] = temp[j++];
        }

        while (i <= mid)
            arr[k++] = temp[i++];

        
    }
}
