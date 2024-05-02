/**
 * Assignment 3 Problem 3
 * Generate a random int from 1 to 12, and determine the month by number to string
 * 
 * @author Daniel Wedding
 * @version 0.0.1
 * @since 1.0
 */
public class Assignment3Problem3 {
    public static void main(String[] args) {
        int randInt = generateRandom(1, 12);
        String monthStr = generateMonth(randInt);

        System.out.println("Month #: " + randInt);
        System.out.println("Month: " + monthStr);
    }

    public static int generateRandom(double min, double max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

    public static String generateMonth(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "Febuary";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";

            default:
                return "No Valid Month";
        }
    }
}
