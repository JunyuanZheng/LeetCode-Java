import java.util.HashMap;

public class Question3 {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        for (int i = 0; i < s.length(); i += 1) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                left = Math.max(map.get(c) + 1, left);
            }
            map.put(c, i);
            result = Math.max(result, i - left + 1);
        }
        return result;
    }
}
