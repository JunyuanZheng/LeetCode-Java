import java.util.Arrays;

public class Question279 {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= n; i += 1) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; i - j * j >= 0; j += 1) {
                min = Math.min(min, dp[i - j * j] + 1);
            }
            dp[i] = min;
        }
        return dp[n];
    }
}
