import java.util.Scanner;

/**
 * Daniel Wedding
 * CompSci 1060
 * 03/22/24
 * 
 * Assignment 8 Problem 1
 * Student Grade Assigner
 */
public class Assignment8Problem1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int studentCount = input.nextInt();

        System.out.print(String.format("Enter your %d scores: ", studentCount));
        int[] grades = new int[studentCount];

        for (int i = 0; i < studentCount; i++) {
            grades[i] = input.nextInt();
        }

        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Student %d's score is %d; Their grade is %s\n", i, grades[i], calculateAlphaGrade(grades[i]));
        }
    }

    /**
     * Calculates the alphabetical grade from numberical value
     * @param grade Student's grade as a number
     * @return Grade in A/B/C/D/F Form
     */
    public static String calculateAlphaGrade(int grade) {
        if (grade >= 90)
            return "A";
        else if (grade >= 80)
            return "B";
        else if (grade >= 70)
            return "C";
        else if (grade >= 60)
            return "D";
        else
            return "F";
    }
}