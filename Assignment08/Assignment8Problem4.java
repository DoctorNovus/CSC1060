import java.util.Scanner;

/**
 * Daniel Wedding
 * CompSci 1060
 * 03/22/24
 * 
 * Assignment 8 Problem 4
 * The Sieve of Eratosthenes
 */
public class Assignment8Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your max number to make the sieve: ");
        int num = input.nextInt();
        int primeCount = 0;

        boolean[] limiter = new boolean[num + 1];
        for (int i = 0; i < limiter.length; i++) {
            limiter[i] = true;

            boolean primal = isPrime(i);
            if (primal) {
                limiter[i] = false;
                primeCount++;
            }
        }

        int[] primes = getPrimes(limiter, primeCount);
        System.out.print("Primes: ");
        for (int i = 0; i < primes.length; i++)
            if (i == primes.length - 1)
                System.out.printf("%d\n", primes[i]);
            else
                System.out.printf("%d, ", primes[i]);
    }

    /**
     * Checks if n is prime
     * @param n Number to check
     * @return boolean value whether prime or not
     */
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    /**
     * Gets the primes from a sieve limiter
     * @param limiter Boolean array of false values for prime
     * @param primeCount total prime numbers
     * @return prime numbers
     */
    public static int[] getPrimes(boolean[] limiter, int primeCount) {
        int counter = 0;
        int[] primes = new int[primeCount];

        for (int i = 0; i < limiter.length; i++) {
            if (limiter[i] == false) {
                primes[counter] = i;
                counter++;
            }
        }

        return primes;
    }
}
