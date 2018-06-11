public class Question130 {
    public void solve(char[][] board) {
        if (board == null || board.length == 0)
            return;
        int row = board.length;
        int column = board[0].length;

        for (int i = 0; i < row; i += 1) {
            dfs(board, i, 0);
            dfs(board, i, column - 1);
        }
        for (int i = 0; i < column; i += 1) {
            dfs(board, 0, i);
            dfs(board, row - 1, i);
        }

        for (int r = 0; r < row; r += 1) {
            for (int c = 0; c < column; c += 1) {
                if (board[r][c] == 'O')
                    board[r][c] = 'X';
            }
        }

        for (int r = 0; r < row; r += 1) {
            for (int c = 0; c < column; c += 1) {
                if (board[r][c] == '1')
                    board[r][c] = 'O';
            }
        }
    }

    private void dfs(char[][] board, int row, int column) {
        if (row < 0 || row == board.length || column < 0 || column == board[row].length)
            return;
        if (board[row][column] == 'O') {
            board[row][column] = '1';
            dfs(board, row - 1, column);
            dfs(board, row + 1, column);
            dfs(board, row, column - 1);
            dfs(board, row, column + 1);
        }
    }
}
