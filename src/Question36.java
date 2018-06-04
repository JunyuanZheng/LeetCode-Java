import java.util.HashSet;
import java.util.Set;

public class Question36 {
    /*
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] columns = new boolean[9][9];
        boolean[][] cells = new boolean[9][9];
        for (int r = 0; r < 9; r += 1) {
            for (int c = 0; c < 9; c += 1) {
                char value = board[r][c];
                if (value == '.')
                    continue;
                boolean[] row = rows[r];
                boolean[] col = columns[c];
                boolean[] cell = cells[3 * (r / 3) + c / 3];
                int tmp = Character.getNumericValue(value) - 1;
                if (row[tmp])
                    return false;
                if (col[tmp])
                    return false;
                if (cell[tmp])
                    return false;
                row[tmp] = true;
                col[tmp] = true;
                cell[tmp] = true;
            }
        }
        return true;
    }
    */

    public boolean isValidSudoku(char[][] board) {
        Set seen = new HashSet();
        for (int i=0; i<9; ++i) {
            for (int j=0; j<9; ++j) {
                char number = board[i][j];
                if (number != '.')
                    if (!seen.add(number + " in row " + i) ||
                            !seen.add(number + " in column " + j) ||
                            !seen.add(number + " in block " + i/3 + "-" + j/3))
                        return false;
            }
        }
        return true;
    }
}
