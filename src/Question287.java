public class Question287 {
    public int findDuplicate(int[] nums) {
        int fast = nums[0];
        int slow = nums[0];
        do {
            fast = nums[nums[fast]];
            slow = nums[slow];
        } while (nums[fast] != nums[slow]);

        int p1 = nums[0];
        int p2 = fast;
        while (p1 != p2) {
            p1 = nums[p1];
            p2 = nums[p2];
        }

        return p1;
    }
}
