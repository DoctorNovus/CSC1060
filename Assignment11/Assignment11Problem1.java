import java.util.Scanner;

/**
 * Daniel Wedding
 * CompSci 1060
 * 04/12/24
 * 
 * Assignment 11 Problem 1
 * Element Summer
 */
public class Assignment11Problem1 {
    public static void main(String[] args) {
        // Sample Set: 1.5 2 3 4 5.5 6 7 8 9.5 1 3 1

        Scanner input = new Scanner(System.in);
        double[] numbersCasted = new double[12];
        double[][] matrix = new double[3][4];

        System.out.println("Enter 12 number values: ");

        for (int i = 0; i < 12; i++) {
            numbersCasted[i] = input.nextDouble();
        }

        System.out.println("Matrix (3x4): ");

        int counter = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = numbersCasted[counter];
                System.out.print(String.format("%.1f ", matrix[i][j]));

                counter++;
            }

            System.out.print("\n");
        }

        for (int i = 0; i < 3; i++) {
            double sum = sumRow(matrix, i);
            System.out.println(String.format("Sum of the elements in row %d is %.2f", i, sum));
        }
    }

    /**
     * Sums up a row of doubles in a matrix, given by the row index
     * 
     * @param m        matrix to sum
     * @param rowIndex index of the row to sum
     * @return sum of row
     */
    public static double sumRow(double[][] m, int rowIndex) {
        double sum = 0;
        double[] row = m[rowIndex];

        for (int i = 0; i < row.length; i++) {
            sum += row[i];
        }

        return sum;
    }
}