import java.util.*;

public class Nqueens {

    class Solution {

        public boolean isSafe(int row, int col, char[][] board) {

            // Horizontal
            for (int j = 0; j < board.length; j++) {
                if (board[row][j] == 'Q') {
                    return false;
                }
            }

            // Vertical
            for (int i = 0; i < board.length; i++) {
                if (board[i][col] == 'Q') {
                    return false;
                }
            }

            // Upper-left diagonal
            int r = row;
            int c = col;

            while (r >= 0 && c >= 0) {
                if (board[r][c] == 'Q') {
                    return false;
                }
                r--;
                c--;
            }

            // Lower-left diagonal
            r = row;
            c = col;

            while (r < board.length && c >= 0) {
                if (board[r][c] == 'Q') {
                    return false;
                }
                r++;
                c--;
            }

            return true;
        }

        public void helper(char[][] board,
                           List<List<String>> allBoards,
                           int col) {

            // Base case
            if (col == board.length) {

                List<String> newBoard = new ArrayList<>();

                for (int i = 0; i < board.length; i++) {
                    newBoard.add(new String(board[i]));
                }

                allBoards.add(newBoard);
                return;
            }

            for (int row = 0; row < board.length; row++) {

                if (isSafe(row, col, board)) {

                    board[row][col] = 'Q';

                    helper(board, allBoards, col + 1);

                    // Backtracking
                    board[row][col] = '.';
                }
            }
        }

        public List<List<String>> solveNQueens(int n) {

            List<List<String>> allBoards = new ArrayList<>();

            char[][] board = new char[n][n];

            // Fill board with '.'
            for (int i = 0; i < n; i++) {
                Arrays.fill(board[i], '.');
            }

            helper(board, allBoards, 0);

            return allBoards;
        }
    }
}