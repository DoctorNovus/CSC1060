import java.util.Scanner;

/**
 * Daniel Wedding
 * CompSci 1060
 * 04/12/24
 * 
 * Assignment 11 Problem 2
 * Matrix Multiplier
 */
public class Assignment11Problem2 {
    public static void main(String[] args) {
        // Sample Set 1: 1 2 3 4 5 6 7 8 9
        // Sample Set 2: 0 2 4 1 4.5 2.2 1.1 4.3 5.2

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Matrix 1: ");
        String[] set1str = input.nextLine().split(" ");
        double[][] set1 = castMatrix(set1str, 3, 3);

        // System.out.println("");

        System.out.print("Enter Matrix 2: ");
        String[] set2str = input.nextLine().split(" ");
        double[][] set2 = castMatrix(set2str, 3, 3);

        double[][] set3 = multiplyMatrix(set1, set2);

        displayOutput(set1, set2, set3);
    }

    public static double[][] castMatrix(String[] matrixStr, int rows, int cols) {
        double[][] set = new double[rows][cols];
        int counter = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                set[i][j] = Double.parseDouble(matrixStr[counter]);
                counter++;
            }
        }

        return set;
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] newMatrix = new double[a[1].length][b[0].length];

        for (int i = 0; i < a[1].length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                newMatrix[i][j] = a[i][j] * b[i][j];
            }
        }

        return newMatrix;
    }

    public static void displayOutput(double[][] m1, double[][] m2, double[][] m3) {
        double[] set1 = new double[9];
        double[] set2 = new double[9];
        double[] set3 = new double[9];

        double[][][] superset = new double[3][3][3];

        System.out.println("The multiplication of the matrices is:");

        for (int set = 0; set < 3; set++) {
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 3; i++) {
                    if (set == 0)
                        superset[0][i][j] = m1[i][j];

                    if (set == 1)
                        superset[1][i][j] = m2[i][j];

                    if (set == 2)
                        superset[2][i][j] = m3[i][j];
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            String str = "";

            for (int j = 0; j < 3; j++) {
                str += String.format("%4.1f ", superset[0][i][j]);
            }

            if (i == 1)
                str += "  *  ";
            else
                str += "     ";

            for (int j = 0; j < 3; j++) {
                str += String.format("%4.1f ", superset[1][i][j]);
            }

            if (i == 1)
                str += "  =  ";
            else
                str += "     ";

            for (int j = 0; j < 3; j++) {
                str += String.format("%4.1f ", superset[2][i][j]);
            }

            System.out.println(str);
        }
    }
}