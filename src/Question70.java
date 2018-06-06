import java.util.Arrays;

public class Question70 {
    /*
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        memo[0] = 1;
        helper(memo, n);
        return memo[n];
    }

    private int helper(int[] memo, int n) {
        if (n < 0)
            return 0;
        if (memo[n] != -1)
            return memo[n];
        int v1 = helper(memo, n - 1);
        int v2 = helper(memo, n - 2);
        memo[n] = v1 + v2;
        return memo[n];
    }
    */
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
