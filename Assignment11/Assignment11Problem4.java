import java.util.Scanner;

/**
 * Daniel Wedding
 * CompSci 1060
 * 04/12/24
 * 
 * Assignment 11 Problem 4
 * Major Diagonal Average
 */
public class Assignment11Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int matrixSize = input.nextInt();

        double[][] matrix = new double[matrixSize][matrixSize];

        System.out.println(String.format("Enter number values to fill the %d-by-%d matrix:", matrixSize, matrixSize));

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        double average = averageMajorDiagonal(matrix);

        System.out.println(String.format("The average of the elements in the major diagonal is %f", average));
    }

    /**
     * Gets the average major diagonal from a matrix
     * @param m matrix to average
     * @return average major diagonal
     */
    public static double averageMajorDiagonal(double[][] m) {
        double sum = 0;
        double counter = 0;

        for(int i = 0; i < m[0].length; i++){
            for(int j = 0; j < m[0].length; j++){
                sum += m[i][j];
                counter++;
            }
        }

        return sum / counter;
    }
}
