public class Question26 {
    public int removeDuplicates(int[] nums) {
        int counter = 0;
        int p = 0;
        while (p < nums.length) {
            if ((counter == 0 && p == 0) || (nums[p] != nums[p - 1])) {
                nums[counter++] = nums[p];
            }
            p += 1;
        }
        return counter;
    }
}
