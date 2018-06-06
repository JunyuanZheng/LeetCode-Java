public class Question53 {
    public int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int tmp = 0;
        for (int num : nums) {
            tmp = tmp + num > num ? tmp + num : num;
            sum = Math.max(sum, tmp);
        }
        return sum;
    }
}
