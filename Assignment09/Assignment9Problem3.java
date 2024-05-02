import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

/**
 * Daniel Wedding
 * CompSci 1060
 * 03/29/24
 * 
 * Assignment 9 Problem 3
 * Bubble Sorter
 */
public class Assignment9Problem3 {
    public static void main(String[] args) {
        double[] sampleSet = generateSampleSet(6);
        System.out.println(String.format("Unsorted: %s", cleanupArrStr(sampleSet)));
        double[] sortedSet = bubbleSort(sampleSet);
        System.out.println(String.format("Sorted: %s", cleanupArrStr(sortedSet)));
    }

    /**
     * Follows the bubble sort algorithm of sorting lowest to highest
     * 
     * @param nums set of numbers to sort
     */
    public static double[] bubbleSort(double[] nums) {
        for (int i = 0; i < nums.length; i++) {
            double temp;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }

    /**
     * Generates a set of doubles based on length from 10 to 100
     * 
     * @param length Length of the set
     * @return Double number set
     */
    public static double[] generateSampleSet(int length) {
        double[] set = new double[length];
        DecimalFormat df = new DecimalFormat("0.00");

        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            double choice = rand.nextDouble(100 - 10) + 10;
            set[i] = Double.parseDouble(df.format(choice));
        }

        return set;
    }

    /**
     * Removes the brackets when converting Array to String
     * 
     * @param arr Array as a String
     * @return Cleaned up Array as String
     */
    public static String cleanupArrStr(double[] arr) {
        return Arrays.toString(arr).replace("[", "").replace("]", "").trim();
    }
}
