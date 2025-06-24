class Solution {
    public void solveSudoku(char[][] board) {
        function(board, 0, 0);
        
    }
    public static boolean function(char[][] board, int row, int col) {

        if (row == 9 && col == 0) {
            return true;
        } else if (row == 9) {
            return false;
        }
         

        int nr = row;
        int nc = col + 1;
        if (col + 1 == 9) {
            nr = row + 1;
            nc = 0;
        }

        if (board[row][col] != '.') {
            return function(board, nr, nc);
        }

        for (char digit = '1'; digit <= '9'; digit++) {
            if (isSafe(board, row, col, digit)) {
                board[row][col] = digit;
                if (function(board, nr, nc)) {
                    return true;
                }
                board[row][col] = '.';
            }
        }

        return false;
    }

    public static boolean isSafe(char[][] board, int row, int col, char digit) {
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == digit || board[j][col] == digit) {
                return false;
            }
        }

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }
}