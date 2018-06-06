public class Question73 {
    public void setZeroes(int[][] matrix) {
        boolean row = false;
        boolean column = false;
        for (int r = 0; r < matrix.length; r += 1) {
            for (int c = 0; c < matrix[r].length; c += 1) {
                if (matrix[r][c] == 0) {
                    if (r == 0) column = true;
                    if (c == 0) row = true;
                    matrix[0][c] = 0;
                    matrix[r][0] = 0;
                }
            }
        }

        for (int r = 1; r < matrix.length; r += 1) {
            for (int c = 1; c < matrix[r].length; c += 1) {
                if (matrix[r][0] == 0 || matrix[0][c] == 0) {
                    matrix[r][c] = 0;
                }
            }
        }

        if (row) {
            for (int r = 0; r < matrix.length; r += 1) {
                matrix[r][0] = 0;
            }
        }

        if (column) {
            for (int c = 0; c < matrix[0].length; c += 1) {
                matrix[0][c] = 0;
            }
        }
    }
}
