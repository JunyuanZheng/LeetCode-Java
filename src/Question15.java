import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i += 1) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int low = i + 1, high = nums.length - 1, sum = 0 - nums[i];
                while (low < high) {
                    if (nums[low] + nums[high] == sum) {
                        list.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while (low < high && nums[low] == nums[low + 1])
                            low += 1;
                        while (high > low && nums[high] == nums[high - 1])
                            high -= 1;
                        low += 1;
                        high -= 1;
                    } else if (nums[low] + nums[high] < sum) {
                        low += 1;
                    } else {
                        high -= 1;
                    }
                }
            }
        }
        return list;
    }
}
