import java.util.ArrayList;
import java.util.List;

public class Question163 {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> list = new ArrayList<>();
        if(nums == null) return list;
        int n = nums.length;
        for(int i = 0; i <= n; i++) {
            long lt = (i == 0) ? lower : (long) nums[i - 1] + 1;
            long gt = (i == n) ? upper : (long) nums[i] - 1;
            addRange(list, lt, gt);
        }
        return list;
    }
    private void addRange(List<String> list, long lo, long hi) {
        if(lo == hi) list.add(String.valueOf(lo));
        else if (hi > lo)list.add(lo + "->" + hi);
    }
}
