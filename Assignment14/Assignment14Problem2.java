import java.util.Random;
import java.util.Scanner;

class StateBuilder {
    String state;
    String city;
    boolean didAnswerCorrect;

    StateBuilder(String state, String city) {
        this.state = state;
        this.city = city;
    }

    public void setResult(boolean result) {
        this.didAnswerCorrect = result;
    }
}

/**
 * Daniel Wedding
 * CompSci 1060
 * 04/29/24
 * 
 * Assignment 14 (Extra Credit) Problem 2
 * Guess the Capitals
 */
public class Assignment14Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        StateBuilder[] items = {
                new StateBuilder("Alabama", "Montgomery"),
                new StateBuilder("Alaska", "Juneau"),
                new StateBuilder("Arizona", "Phoenix"),
                new StateBuilder("Arkansas", "Little"),
                new StateBuilder("California", "Sacramento"),
                new StateBuilder("Colorado", "Denver"),
                new StateBuilder("Connecticut", "Hartford"),
                new StateBuilder("Delaware", "Dover"),
                new StateBuilder("Florida", "Tallahassee"),
                new StateBuilder("Georgia", "Atlanta"),
                new StateBuilder("Hawaii", "Honolulu"),
                new StateBuilder("Idaho", "Boise"),
                new StateBuilder("Illinois", "Springfield"),
                new StateBuilder("Indiana", "Indianapolis"),
                new StateBuilder("Iowa", "Des"),
                new StateBuilder("Kansas", "Topeka"),
                new StateBuilder("Kentucky", "Frankfort"),
                new StateBuilder("Louisiana", "Baton"),
                new StateBuilder("Maine", "Augusta"),
                new StateBuilder("Maryland", "Annapolis"),
                new StateBuilder("Massachusetts", "Boston"),
                new StateBuilder("Michigan", "Lansing"),
                new StateBuilder("Minnesota", "St."),
                new StateBuilder("Mississippi", "Jackson"),
                new StateBuilder("Missouri", "Jefferson"),
                new StateBuilder("Montana", "Helena"),
                new StateBuilder("Nebraska", "Lincoln"),
                new StateBuilder("Nevada", "Carson"),
                new StateBuilder("New", "Hampshire"),
                new StateBuilder("New", "Jersey"),
                new StateBuilder("New", "Mexico"),
                new StateBuilder("New", "York"),
                new StateBuilder("North", "Carolina"),
                new StateBuilder("North", "Dakota"),
                new StateBuilder("Ohio", "Columbus"),
                new StateBuilder("Oklahoma", "Oklahoma"),
                new StateBuilder("Oregon", "Salem"),
                new StateBuilder("Pennsylvania", "Harrisburg"),
                new StateBuilder("Rhode", "Island"),
                new StateBuilder("South", "Carolina"),
                new StateBuilder("South", "Dakota"),
                new StateBuilder("Tennessee", "Nashville"),
                new StateBuilder("Texas", "Austin"),
                new StateBuilder("Utah", "Salt"),
                new StateBuilder("Vermont", "Montpelier"),
                new StateBuilder("Virginia", "Richmond"),
                new StateBuilder("Washington", "Olympia"),
                new StateBuilder("West", "Virginia"),
                new StateBuilder("Wisconsin", "Madison"),
                new StateBuilder("Wyoming", "Cheyenne")
        };

        System.out.print("How many states do you want to attempt? ");
        int total = input.nextInt();
        input.nextLine();

        promptUser(input, items, total);
    }

    public static void promptUser(Scanner input, StateBuilder[] items, int total) {
        int currentState = 0;
        int won = 0;

        for (int i = 0; i < total; i++) {
            StateBuilder[] randomCapitals = getRandomCapitals(items, currentState);
            StateBuilder original = items[currentState];
            shuffle(randomCapitals);

            System.out.println();
            System.out.printf("State: %s \n", original.state);
            System.out.printf("- %s \n", randomCapitals[0].city);
            System.out.printf("- %s \n", randomCapitals[1].city);
            System.out.printf("- %s \n", randomCapitals[2].city);
            System.out.printf("- %s \n", randomCapitals[3].city);
            System.out.println();

            System.out.print("Your Guess: ");
            String city = input.nextLine();

            if (city.toLowerCase().equals(original.city.toLowerCase())) {
                original.setResult(true);
                won++;
                System.out.println("That is correct!");
            } else {
                original.setResult(false);
                System.out.println("That is incorrect!");
            }

            currentState++;
        }

        System.out.printf("Congratulations! You won %d capitals out of %d total capitals. \n", won, total);
    }

    public static StateBuilder[] getRandomCapitals(StateBuilder[] items, int currentState) {
        StateBuilder[] capitals = new StateBuilder[4];
        double[] guessed = new double[4];
        capitals[0] = items[currentState];
        guessed[0] = currentState;

        for (int i = 1; i < 4; i++) {
            int chosenNum = (int) Math.floor(Math.random() * items.length);
            boolean canProceed = true;

            for (double guess : guessed) {
                if (chosenNum == guess)
                    canProceed = false;
            }

            if (!canProceed)
                return getRandomCapitals(items, currentState);

            capitals[i] = items[chosenNum];
            guessed[i] = chosenNum;
        }

        return capitals;
    }

    public static void shuffle(StateBuilder[] items) {
        Random rnd = new Random();
        for (int i = items.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            StateBuilder a = items[index];
            items[index] = items[i];
            items[i] = a;
        }
    }
}
