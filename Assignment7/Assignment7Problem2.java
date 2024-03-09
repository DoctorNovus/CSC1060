import java.util.Scanner;

/**
 * Daniel Wedding
 * CompSci 1060
 * 03/08/23
 * 
 * Assignment 7 Problem 2
 * Calculate Credit Card Company and Validity
 */
public class Assignment7Problem2 {
    public static void main(String[] args) {
        // Sample Set: 4388576018402626

        Scanner input = new Scanner(System.in);
        System.out.print("What is your credit card number: ");
        long creditCardNumber = input.nextLong();
        boolean isNumberValid = isValid(creditCardNumber);
        String vendor = getTypeOfCard(creditCardNumber);

        System.out.println(String.format("Vendor: %s | Valid: %s", vendor, isNumberValid));
    }

    /**
     * Gets the count of digits in a number
     * 
     * @param number Number to check digits
     * @return digit length
     */
    public static int getDigits(long number) {
        return String.valueOf(number).length();
    }

    /**
     * Gets the digits in a number, based on n
     * 
     * @param number Number you want to pass in
     * @param start  Where you want to start, 0 if ignore
     * @param n      nth digit you want
     * @return Number every nth digit
     */
    public static int[] getNthDigits(long number, int start, int n) {
        int counter = 1;

        String numberStr = String.valueOf(number);
        String[] items = numberStr.split("");

        int itemCount = 0;

        int[] digits = new int[items.length / n];

        for (int i = 0 + start; i < items.length; i++) {
            counter++;

            if (counter == n) {
                digits[itemCount] = Integer.parseInt(items[i]);
                itemCount++;
                counter = 0;
            }
        }

        return digits;
    }

    /** Return true if the card number is valid */
    public static boolean isValid(long number) {
        int sum1 = sumOfDoubleEvenPlace(number);
        int sum2 = sumOfOddPlace(number);

        int sum3 = sum1 + sum2;

        if(sum3 % 10 == 0){
            return true;
        }

        return false;
    }

    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;

        int[] digits = getNthDigits(number, 0, 2);
        for (int digit : digits) {
            sum += getDigit(digit * 2);
        }

        return sum;
    }

    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        long reversed = reverseNumber(number);

        int[] digits = getNthDigits(reversed, 0, 2);
        for (int digit : digits) {
            sum += getDigit(digit);
        }

        return sum;
    }

    /* Reverses a number */
    public static long reverseNumber(long number){
        long reversed = 0;
        long num = number;

        while(num != 0){
            long digit = Math.abs(num % 10);
            reversed = reversed * 10 + digit;

            num /= 10;
        }

        return reversed;
    }

    /**
     * Return this number if it is a single digit, otherwise,
     * return the sum of the two digits
     */
    public static int getDigit(int number) {
        if (number < 10)
            return (int) number;
        else {
            int sum = 0;

            String[] parts = String.valueOf(number).split("");
            for (String part : parts) {
                sum += Integer.parseInt(part);
            }

            return sum;
        }

    }

    /** Return true if the number d is a prefix for number */
    public static boolean prefixMatched(long number, int d) {
        return (d == 4 || d == 5 || d == 6 || d == 37);
    }

    /** Return the number of digits in d */
    public static int getSize(long d) {
        return getDigits(d);
    }

    /**
     * Return the first k number of digits from number. If the
     * ;* number of digits in number is less than k, return number.
     */
    public static long getPrefix(long number, int k) {
        String castedPrefix = "";

        String[] parts = String.valueOf(number).split("");
        for (int i = 0; i < k; i++) {
            castedPrefix += parts[i];
        }

        long prefix = Integer.parseInt(castedPrefix);
        return prefix;
    }

    /**
     * Return a string stating the type of card this number
     * belongs to.
     */
    public static String getTypeOfCard(long number) {
        long prefixSingle = getPrefix(number, 1);

        if (prefixSingle == 3) {
            long fullPrefix = getPrefix(number, 2);
            if (fullPrefix == 37)
                return "American Express";
        } else if (prefixSingle == 4)
            return "Visa";
        else if (prefixSingle == 5)
            return "Master";
        else if (prefixSingle == 6)
            return "Discover";

        return "Unknown";
    }
}
