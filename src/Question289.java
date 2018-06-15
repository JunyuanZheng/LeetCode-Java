public class Question289 {
    public void gameOfLife(int[][] board) {
        for (int row = 0; row < board.length; row += 1) {
            for (int column = 0; column < board[row].length; column += 1) {
                update(board, row, column);
            }
        }
        for (int row = 0; row < board.length; row += 1) {
            for (int column = 0; column < board[row].length; column += 1) {
                board[row][column] >>>= 1;
            }
        }
    }

    private void update(int[][] board, int row, int column) {
        int counter = 0;
        int state = status(board, row, column);
        int newState = 1;
        counter += status(board, row - 1, column - 1);
        counter += status(board, row - 1, column);
        counter += status(board, row - 1, column + 1);
        counter += status(board, row, column - 1);
        counter += status(board, row, column + 1);
        counter += status(board, row + 1, column - 1);
        counter += status(board, row + 1, column);
        counter += status(board, row + 1, column + 1);
        if ((state == 1 && counter < 2 || counter > 3) || (state == 0 && counter != 3))
            newState = 0;
        board[row][column] |= newState << 1;
    }

    private int status(int[][] board, int row, int column) {
        if (row >= board.length || row < 0 || column >= board[row].length || column < 0)
            return 0;
        return board[row][column] & 1;
    }
}
