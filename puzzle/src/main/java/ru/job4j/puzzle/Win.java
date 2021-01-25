package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean result = false;
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 1)
            if (horizontal(board, index) || vertical(board, index)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean horizontal(int[][] board, int row) {
        boolean result = true;
        for (int column = 0; column < board.length; column++) {
            if (board[row][column] != 1) {
                result = false;
                break;
            }
        }
        return result;

    }
    public static boolean vertical(int[][] board, int column) {
        boolean result = true;
        for (int line = 0; line < board.length; line++) {
            if (board[line][column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}