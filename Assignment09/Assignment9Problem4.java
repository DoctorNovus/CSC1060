import java.util.Random;
import java.util.Scanner;

/**
 * Daniel Wedding
 * CompSci 1060
 * 03/29/24
 * 
 * Assignment 9 Problem 4
 * Hangman
 */
public class Assignment9Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean isGameFinished = false;

        String[] words = { "did", "you", "know", "that", "when", "reading", "this",
                "code", "you", "are", "cheating",
                "because", "you", "already", "know", "the", "general", "gist", "of", "the",
                "words", "in", "this",
                "set", "nonetheless", "you", "can", "still", "have", "fun", "with", "this",
                "little", "program",
                "hangman", "that",
                "its", "creator", "is", "myself" };

        while (!isGameFinished)
            isGameFinished = startGame(isGameFinished, input, words);
    }

    /**
     * Handles Game Process
     * @param isGameFinished User finished state
     * @param input Scanner
     * @param words Words to pick from
     * @return Finished state
     */
    public static boolean startGame(boolean isGameFinished, Scanner input, String[] words) {
        String word = getRandomWord(words);
        String[] letters = word.split("");
        int[] letterToggles = new int[word.length()];
        int misses = 0;

        boolean isGameOver = false;

        System.out
                .println(String.format("Welcome to Hangman. Your word is %d letters long. Good luck.", letters.length));

        while (!isGameOver) {
            String prompt = generatePrompt(letters, letterToggles);
            System.out.print(prompt);
            String letter = input.nextLine();
            misses = calculateMiss(misses, letters, letter);

            if (handleComplete(letters, letter, letterToggles)) {
                isGameOver = true;
                System.out.println(String.format(
                        "Congrats on guessing all letters. Your word was %s. You missed %d times.", word, misses));
            }
        }

        System.out.print("Would you like to play another hangman game? Enter y/n: ");
        String playAgain = input.nextLine();
        if (playAgain.equals("n"))
            isGameFinished = true;

        return isGameFinished;
    }

    /**
     * Chooses a random word from a set of words
     * @param words Words to choose from
     * @return Chosen word
     */
    public static String getRandomWord(String[] words) {
        return words[(new Random()).nextInt(words.length)];
    }

    /**
     * Generates hangman prompt to show correct letters
     * @param letters Letters of the word
     * @param letterToggles boolean as int toggles to say whether the letter has been guessed or not
     * @return Text to output to user
     */
    public static String generatePrompt(String[] letters, int[] letterToggles) {
        String output = "(Guess) Enter a letter in word ";

        for (int i = 0; i < letterToggles.length; i++)
            if (letterToggles[i] == 1)
                output += letters[i];
            else
                output += "*";

        output += " > ";

        return output;
    }

    /**
     * Calculate if a user missed, and return new miss count
     * @param misses Current misses user is at
     * @param letters Letters of the word
     * @param letter Chosen letter
     * @return Miss count
     */
    public static int calculateMiss(int misses, String[] letters, String letter) {
        boolean didFind = false;
        for (int i = 0; i < letters.length; i++)
            if (letters[i].equals(letter))
                didFind = true;

        if (!didFind) {
            System.out.println(String.format("%s is not in the word.", letter));
            misses++;
        }

        return misses;
    }

    /**
     * Checks if game is finished, based on if word was guessed correctly
     * @param letters Letters of the word
     * @param letter Chosen letter
     * @param letterToggles boolean as int toggles to say whether the letter has been guessed or not
     * @return Complete state as boolean
     */
    public static boolean handleComplete(String[] letters, String letter, int[] letterToggles) {
        for (int i = 0; i < letters.length; i++) {
            if (letters[i].equals(letter))
                letterToggles[i] = 1;
        }

        boolean complete = true;

        for (int i = 0; i < letterToggles.length; i++) {
            if (letterToggles[i] == 0)
                complete = false;
        }

        return complete;
    }
}