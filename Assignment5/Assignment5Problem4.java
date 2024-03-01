import java.util.Scanner;

/*
 * Daniel Wedding - CompSci 1060 - 02/23/24
 * Assignment5Problem4
 * RPS (Rock Paper Scissor)
 */
public class Assignment5Problem4 {
    public static void main(String[] args) {
        System.out.println("Welcome to Rock (1), Paper (2), Scissors (3).");
        Scanner input = new Scanner(System.in);

        int userScore = 0;
        int computerScore = 0;

        do {
            System.out.printf("User Score: %d | Computer Score: %d\n", userScore, computerScore);

            System.out.print("Choose your selection: ");
            int choice = input.nextInt();
            int compChoice = Math.round((int) (Math.random() * 3)) + 1;
             
            int winnerNum = Assignment5Problem4.chooseWinner(choice, compChoice);
            String winStr = "";

            if (winnerNum == 0)
                winStr = "Tie";
            else if (winnerNum == 1){
                winStr = "Win";
                userScore++;
            } else if (winnerNum == 2) {
                winStr = "Lose";
                computerScore++;
            }


            System.out.printf("User chose %s, Computer chose %s. You %s\n", getRPS(choice), getRPS(compChoice), winStr);
        } while (userScore < 3 && computerScore < 3);

        if(userScore == 3){
            System.out.printf("You win! Player %d : Computer %d\n", userScore, computerScore);
        } 

        if(computerScore == 3){
            System.out.printf("Computer wins! Player %d : Computer %d\n", userScore, computerScore);
        }
    }

    /**
     * Calculates if player wins
     * 
     * @param player   Player's Choice
     * @param computer Computer's Choice
     * @return 0 - Tie | 1 - Win | 2 - Lose
     */
    public static int chooseWinner(int player, int computer) {
        if (player == 1 && computer == 1)
            return 0;
        if (player == 1 && computer == 2)
            return 2;
        if (player == 1 && computer == 3)
            return 1;
        if (player == 2 && computer == 1)
            return 1;
        if (player == 2 && computer == 2)
            return 0;
        if (player == 2 && computer == 3)
            return 2;
        if (player == 3 && computer == 1)
            return 2;
        if (player == 3 && computer == 2)
            return 1;
        if (player == 3 && computer == 3)
            return 0;

        return 0;
    }

    public static String getRPS(int option){
        switch (option) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
        
            default:
                System.out.println(option);
                return "";
        }
    }
}
