public class Question62 {
    public int uniquePaths(int m, int n) {
        if (m == 0 || n == 0)
            return 0;
        int[][] result = new int[n][m];
        for (int r = 0; r < n; r += 1) {
            for (int c = 0; c < m; c += 1) {
                if (r == 0 || c == 0)
                    result[r][c] = 1;
                else
                    result[r][c] = result[r - 1][c] + result[r][c - 1];
            }
        }
        return result[n - 1][m - 1];
    }
}
