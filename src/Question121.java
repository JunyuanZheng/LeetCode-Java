public class Question121 {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i : prices) {
            if (i < min)
                min = i;
            max = Math.max(max, i - min);
        }
        return max;
    }
}
