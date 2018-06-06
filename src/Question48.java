public class Question48 {
    public void rotate(int[][] matrix) {
        if (matrix == null)
            return;
        int n = matrix.length;
        for (int r = 0; r < n; r += 1) {
            for (int c = 0; c < r; c += 1) {
                int tmp = matrix[r][c];
                matrix[r][c] = matrix[c][r];
                matrix[c][r] = tmp;
            }
        }
        for (int c = 0; c < n / 2; c += 1) {
            for (int r = 0; r < n; r += 1) {
                int tmp = matrix[r][c];
                matrix[r][c] = matrix[r][n - c - 1];
                matrix[r][n - c - 1] = tmp;
            }
        }
    }
}
