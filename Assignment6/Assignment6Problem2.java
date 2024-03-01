import java.util.Scanner;

/**
 * Daniel Wedding
 * CompSci 1060
 * 03/01/24
 * 
 * Assignment6Problem2
 * Finance Calculator
 */
public class Assignment6Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baseTuition = 10000;
        double increasePercent = 0.06;

        System.out.print("In how many years will you begin your 4-year college: ");
        int yearStart = input.nextInt();

        float totalTuition = 0;

        for (int i = 0 + yearStart; i < 4 + yearStart; i++) {
            double yearTuition = (baseTuition + baseTuition * (increasePercent * i));
            System.out.printf("Your tuition for Year %d in %d years is $%.2f\n", i - yearStart + 1, yearStart,
                    yearTuition);
            totalTuition += yearTuition;
        }

        System.out.printf("Your total tuition for the 4-year college is $%.2f\n", totalTuition);
    }
}
