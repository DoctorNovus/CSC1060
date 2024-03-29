import java.util.Random;
import java.util.Scanner;

/**
 * Daniel Wedding
 * CompSci 1060
 * 03/29/24
 * 
 * Assignment 9 Problem 1
 * Random Number Selector
 */
public class Assignment9Problem1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("\n----- Sample Set -----");

		int[] set1 = generateSampleSet(5);
		int[] set2 = generateSampleSet(9);
		int[] set3 = generateSampleSet(13);

		System.out.printf("Set 1 | Set Length: %d | Set Random Choice: %d\n", set1.length, getRandom(set1));
		System.out.printf("Set 2 | Set Length: %d | Set Random Choice: %d\n", set2.length, getRandom(set2));
		System.out.printf("Set 3 | Set Length: %d | Set Random Choice: %d\n", set3.length, getRandom(set3));

		System.out.println("----- Sample Set -----\n");

		System.out.print("Enter a series of numbers to choose from: ");
		String[] numberSetStr = input.nextLine().split(" ");
		int[] numset = new int[numberSetStr.length];
		for (int i = 0; i < numberSetStr.length; i++)
			numset[i] = Integer.parseInt(numberSetStr[i]);

		int randChoice = getRandom(numset);
		System.out.printf("Your number is %d\n", randChoice);
	}

	/**
	 * Gets a random number from an array of numbers
	 * 
	 * @param numbers Array of numbers to choose from
	 * @return Random Choice
	 */
	public static int getRandom(int... numbers) {
		Random rand = new Random();

		int min = 0;
		int max = numbers.length;

		int randInt = rand.nextInt(max - min) + min;
		return numbers[randInt];
	}

	/**
	 * Generates a sample set with length of <length>, with numbers from 1 - 100
	 * 
	 * @param length Size of the set
	 * @return Number set
	 */
	public static int[] generateSampleSet(int length) {
		int[] set = new int[length];

		Random rand = new Random();

		for (int i = 0; i < length; i++)
			set[i] = rand.nextInt(100 - 1) + 1;

		return set;
	}
}