import java.util.Scanner;

/**
 * Daniel Wedding
 * Assignment 4 Problem 4
 * Converts char to Unicode & ASCII
 */
public class Assignment4Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your characters to see ASCII codes: ");
        String asciistr = input.nextLine();
        for(int i = 0; i < asciistr.length(); i++){
            char character = asciistr.charAt(i);
            int unicode = getUnicode(character);
            int ascii = getASCII(character);
            System.out.println(String.format("Character: %s | Unicode: %s - ASCII: %s", character, unicode, ascii));

        }
    }

    public static int getUnicode(char character){
        String test = String.format("%s", character);
        return test.codePointAt(0);
    }

    public static int getASCII(char character){
        return (int)character;
    }
}
