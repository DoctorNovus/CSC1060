import java.util.Date;

/**
 * Daniel Wedding
 * CompSci 1060
 * 04/26/24
 * 
 * Assignment 13 Problem 2
 * Date Implementor
 */
public class Assignment13Problem2 {
    public static void main(String[] args) {
        long[] elapsedTimes = { 10_000L, 100_000L, 1_000_000L, 10_000_000L, 100_000_000L, 1_000_000_000L,
                10_000_000_000L, 100_000_000_000L };

        for(long elapsedTime: elapsedTimes){
            Date date = new Date(elapsedTime);

            System.out.println(String.format("Elapsed Time: %d", elapsedTime));
            System.out.println(String.format("Date and Time: %s", date.toString()));
        }
    }
}
