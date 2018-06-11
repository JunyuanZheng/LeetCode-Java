import java.util.*;

public class Question139 {
    /*
    public boolean wordBreak(String s, List<String> wordDict) {
        return helper(s, wordDict, 0, new Boolean[s.length()]);
    }

    private boolean helper(String s, List<String> wordDirect, int start, Boolean[] memo) {
        if (start == s.length())
            return true;
        if (memo[start] != null)
            return memo[start];
        for (int i = start + 1; i <= s.length(); i += 1) {
            if (wordDirect.contains(s.substring(start, i)) && helper(s, wordDirect, i, memo)) {
                memo[start] = true;
                return true;
            }
        }
        memo[start] = false;
        return false;
    }
    */

    /* BFS
    public boolean wordBreak(String s, List<String> wordDict) {
        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] memo = new boolean[s.length()];
        queue.add(0);
        while (queue.size() != 0) {
            int start = queue.poll();
            if (!memo[start]) {
                for (int i = start + 1; i <= s.length(); i += 1) {
                    if (wordDict.contains(s.substring(start, i))) {
                        queue.add(i);
                        if (i == s.length()) {
                            return true;
                        }
                    }
                }
                memo[start] = true;
            }
        }
        return false;
    }
    */

    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 0; i <= s.length(); i += 1) {
            for (int j = 0; j < i; j += 1) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
