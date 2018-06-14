public class Question238 {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];
        result[0] = 1;
        for (int i = 1; i < size; i += 1) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = size - 1; i >= 0; i -= 1) {
            result[i] = result[i] * right;
            right = right * nums[i];
        }
        return result;
    }
}
