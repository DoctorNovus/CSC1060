package src.edu.csc1060.menus;

import java.util.Scanner;

import src.edu.csc1060.ProjectSelector;

public class SudokuMenu {
    int[][] board;

    public void openMenu(Scanner input) {
        showMenu(input);
    }

    private void showMenu(Scanner input) {
        this.board = generateBoard();

        System.out.println("Sudoku Board (Non-Interactive)");
        this.board = randomlyPopulateBoard(board, 16);
        drawBoard(board);

        ProjectSelector.stall(input);
    }

    private int[][] generateBoard() {
        int[][] board = new int[9][9];

        return board;
    }

    private int[][] randomlyPopulateBoard(int[][] board, int count) {
        int[][] tempBoard = board.clone();

        for (int i = 0; i < count; i++) {
            int row = (int) Math.floor(Math.random() * 9);
            int col = (int) Math.floor(Math.random() * 9);

            tempBoard[row][col] = generateValidValue(tempBoard, row, col);
            if (isValid(tempBoard))
                board[row][col] = tempBoard[row][col];
            else {
                tempBoard[row][col] = 0;
                return randomlyPopulateBoard(tempBoard, count - i);
            }
        }

        return board;
    }

    private int generateValidValue(int[][] board, int row, int col) {
        int value = (int) Math.floor(Math.random() * 9);
        int[][] tempBoard = board.clone();
        tempBoard[row][col] = value;

        if (!isValid(tempBoard)) {
            tempBoard[row][col] = 0;
            return generateValidValue(tempBoard, row, col);
        }

        return value;
    }

    private boolean isValid(int[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!isValidRow(board, i) || !isValidColumn(board, i) || !isValidSquare(board, i))
                return false;
        }

        return true;
    }

    private boolean isValidRow(int[][] board, int row) {
        boolean[] nums = new boolean[9];

        for (int i = 0; i < 9; i++) {
            int num = board[row][i];

            if (num != 0) {
                if (nums[num])
                    return false;

                nums[num] = true;
            }
        }

        return true;
    }

    private boolean isValidColumn(int[][] board, int column) {
        boolean[] nums = new boolean[9];

        for (int i = 0; i < 9; i++) {
            int num = board[i][column];

            if (num != 0) {
                if (nums[num])
                    return false;

                nums[num] = true;
            }
        }

        return true;
    }

    private boolean isValidSquare(int[][] board, int square) {
        boolean[] nums = new boolean[9];

        int starterRow = (square / 3) * 3;
        int starterColumn = (square % 3) * 3;

        for (int i = starterRow; i < starterRow + 3; i++) {
            for (int j = starterColumn; j < starterColumn + 3; j++) {
                int num = board[i][j];
                if (num != 0) {
                    if (nums[num])
                        return false;

                    nums[num] = true;
                }
            }
        }

        return true;
    }

    public void drawBoard(int[][] board) {
        /*
            Demo Board

            +---+---+---+---+---+---+
            |       |       |   3 1 |
            |       |       |       |
            |       |       |       |
            +---+---+---+---+---+---+
            |     8 |       |     7 |
            | 4     |   8   |       |
            |       |       |       |
            +---+---+---+---+---+---+
            |       | 2     |       |
            |   8   |     6 | 4     |
            | 7     |     4 |       |
            +---+---+---+---+---+---+
        */

        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0)
                System.out.println("+---+---+---+---+---+---+");

            drawRow(board, i);

            if (i == 8)
                System.out.println("+---+---+---+---+---+---+");
        }

    }

    private void drawRow(int[][] board, int row) {
        for (int i = 0; i < 9; i++) {
            int num = board[row][i];

            if (i == 0)
                System.out.print("| ");

            if (i % 3 == 0 && i != 0)
                System.out.print("| ");

            if (num == 0)
                System.out.print("  ");
            else
                System.out.printf("%d ", num);

            if (i == 8)
                System.out.print("|");
        }

        System.out.print("\n");
    }
}
