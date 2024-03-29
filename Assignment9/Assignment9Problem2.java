import java.util.Scanner;

/**
 * Daniel Wedding
 * CompSci 1060
 * 03/29/24
 * 
 * Assignment 9 Problem 2
 * Student Sorter By Grade
 */
public class Assignment9Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int studentCount = input.nextInt();

        String[] students = new String[studentCount];
        int[] scores = new int[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print(String.format("Student %d's name: ", i + 1));
            students[i] = input.next();
            System.out.print(String.format("Student %d's Score: ", i + 1));
            scores[i] = input.nextInt();
        }

        sortStudents(students, scores);

        System.out.println("----- Students Sorted by Grade -----");

        for (int i = 0; i < students.length; i++)
            System.out.println(String.format("Student: %s - Score: %d", students[i], scores[i]));

        System.out.println("----- Students Sorted by Grade -----");
    }

    /**
     * Sort Students by given scores
     * 
     * @param students Students to sort
     * @param scores   Scores associated to students
     */
    public static void sortStudents(String[] students, int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            int maxScore = scores[i];
            int maxIndex = i;

            String swappedName = "";

            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] > maxScore) {
                    maxScore = scores[j];
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                /* Flipping highest students around */
                swappedName = students[i];
                students[i] = students[maxIndex];
                students[maxIndex] = swappedName;

                /* Adjust scores accordingly */
                scores[maxIndex] = scores[i];
                scores[i] = maxScore;
            }
        }
    }
}
