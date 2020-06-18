// Question:
// Surrounded Regions
// .*

class Solution {
    void changeRecusrsively(char[][] board, int x, int y) {
        if (x >= 0 && x < board.length && y >= 0 && y < board[0].length && board[x][y] == 'O') {
            board[x][y] = 'C';
            changeRecusrsively(board, x + 1, y);
            changeRecusrsively(board, x, y + 1);
            changeRecusrsively(board, x - 1, y);
            changeRecusrsively(board, x, y - 1);
        }
    }

    public void solve(char[][] board) {
        if (board == null || board.length == 0)
            return;

        int ROWS = board.length;
        int COLS = board[0].length;

        for (int i = 0; i < ROWS; i++) {
            if (board[i][0] == 'O')
                changeRecusrsively(board, i, 0);
            if (board[i][COLS - 1] == 'O')
                changeRecusrsively(board, i, COLS - 1);
        }

        for (int j = 0; j < COLS; j++) {
            if (board[0][j] == 'O')
                changeRecusrsively(board, 0, j);
            if (board[ROWS - 1][j] == 'O')
                changeRecusrsively(board, ROWS - 1, j);
        }

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (board[i][j] == 'O')
                    board[i][j] = 'X';
                if (board[i][j] == 'C')
                    board[i][j] = 'O';
            }
        }
    }
}