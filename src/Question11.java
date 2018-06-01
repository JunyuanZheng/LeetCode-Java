public class Question11 {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int low = 0;
        int high = height.length - 1;
        while (low <  high) {
            int tmp = Math.min(height[low], height[high]) * (high - low);
            max = tmp > max ? tmp : max;
            if (height[low] < height[high])
                low++;
            else
                high--;
        }
        return max;
    }
}
