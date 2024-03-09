/**
 * Daniel Wedding
 * CompSci 1060
 * 03/08/23
 * 
 * Assignment 7 Problem 1
 * Calculate Pentagonal Numbers
 */
public class Assignment7Problem1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            int pentaNumber = getPentagonalNumber(i);
            System.out.println(String.format("%3dth number: %7d", i, pentaNumber));
        }
    }

    /**
     * Returns the pentagonal number from passed in integer; Formula: n(3n-1)/2
     * @param n nth number to get the pentagonal number of
     * @return pentagonal number at nth index
     */
    public static int getPentagonalNumber(int n){
        return (n * (3 * n - 1) / 2);
    }
}