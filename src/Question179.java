import java.util.Arrays;

public class Question179 {
    public String largestNumber(int[] nums) {
        String[] tmp = new String[nums.length];
        for (int i = 0; i < nums.length; i += 1) {
            tmp[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(tmp, (a, b) -> {
            String s1 = a + b;
            String s2 = b + a;
            return s2.compareTo(s1);
        });
        if (tmp[0].equals("0"))
            return "0";
        StringBuilder sb = new StringBuilder();
        for (String s : tmp)
            sb.append(s);
        return sb.toString();
    }
}
