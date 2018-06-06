import java.util.ArrayList;
import java.util.List;

public class Question78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        helper(result, tmp, nums, 0);
        return result;
    }

    private void helper(List<List<Integer>> list, List<Integer> tmp, int[] nums, int idx) {
        list.add(new ArrayList<>(tmp));
        for (int i = idx; i < nums.length; i += 1) {
            tmp.add(nums[i]);
            helper(list, tmp, nums, idx + 1);
            tmp.remove(tmp.size() - 1);
        }
    }
}
