import java.util.Scanner;

/**
 * Daniel Wedding
 * CompSci 1060
 * 04/12/24
 * 
 * Assignment 11 Problem 3
 * Tic-Tac-Toe
 */
public class Assignment11Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] gameBoard = createBlankBoard();
        int turn = 0;
        boolean gameFinished = false;

        drawGrid(gameBoard);

        while (!gameFinished) {
            if (turn == 0) {
                gameBoard = promptPlayer("X", input, gameBoard);
                turn = 1;
            } else {
                gameBoard = promptPlayer("O", input, gameBoard);
                turn = 0;
            }

            drawGrid(gameBoard);

            String winner = processWin(gameBoard);
            if (winner.trim().length() != 0) {
                gameFinished = true;
                System.out.println(String.format("%s is the winner!", winner));
            }
        }
    }

    /**
     * Creates a blank 3x3 board
     * @return game board
     */
    public static String[][] createBlankBoard() {
        String[][] board = new String[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = " ";
            }
        }

        return board;
    }

    /**
     * Draws the grid from the game board
     * @param board game board
     */
    public static void drawGrid(String[][] board) {
        System.out.printf("-------------\n");
        System.out.printf("| %s | %s | %s |\n", board[0][0], board[0][1], board[0][2]);
        System.out.printf("-------------\n");
        System.out.printf("| %s | %s | %s |\n", board[1][0], board[1][1], board[1][2]);
        System.out.printf("-------------\n");
        System.out.printf("| %s | %s | %s |\n", board[2][0], board[2][1], board[2][2]);
        System.out.printf("-------------\n");
    }

    /**
     * Creates the prompt system to prompt the user to enter result
     * @param player X | O
     * @param input Scanner system
     * @param board game board
     * @return new board layout
     */
    public static String[][] promptPlayer(String player, Scanner input, String[][] board) {
        System.out.printf("Enter a row (0, 1, or 2) for player %s: ", player);
        int row = input.nextInt();
        System.out.printf("Enter a column (0, 1, or 2) for player %s: ", player);
        int col = input.nextInt();

        String selection = board[row][col];
        if (selection.trim().length() == 0)
            board[row][col] = player;
        else {
            System.out.println("Selection could not be done. Try again.");
            board = promptPlayer(player, input, board);
        }

        return board;
    }

    /**
     * Checks if there is a winner, and returns it
     * @param board game board
     * @return " " if no winner, "x" or "o" if there is a winner
     */
    public static String processWin(String[][] board) {
        String winner = "";

        // Process Horizontal
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2])
                if (board[i][0].trim().length() != 0) {
                    winner = board[i][0];
                }
        }

        // Process Vertical
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j])
                if (board[0][j].trim().length() != 0) {
                    winner = board[0][j];
                }
        }

        // Process Diag Left
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2])
            if (board[0][0].trim().length() != 0) {
                winner = board[0][0];
            }

        // Process Diag Right
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0])
            if (board[0][2].trim().length() != 0) {
                winner = board[0][2];
            }

        return winner;
    }
}
