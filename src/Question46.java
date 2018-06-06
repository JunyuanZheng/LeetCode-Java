import java.util.ArrayList;
import java.util.List;

public class Question46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void helper(List<List<Integer>> result, List<Integer> tmp, int[] nums, int idx) {
        if (idx >= nums.length) {
            result.add(new ArrayList<>(tmp));
            return;
        }
        for (int num : nums) {
            if (tmp.contains(num))
                continue;
            tmp.add(num);
            helper(result, tmp, nums, idx + 1);
            tmp.remove(tmp.size() - 1);
        }
    }
}
