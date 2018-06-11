public class Question122 {
    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 1; i < prices.length; i += 1) {
            if (prices[i] > prices[i - 1])
                result += (prices[i] - prices[i - 1]);
        }
        return result;
    }
}
