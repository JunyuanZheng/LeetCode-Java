import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question17 {
    private Map<Character, Character[]>  map = new HashMap<>();

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits.length() == 0)
            return result;

        map.put('2', new Character[] { 'a', 'b', 'c' });
        map.put('3', new Character[] { 'd', 'e', 'f' });
        map.put('4', new Character[] { 'g', 'h', 'i' });
        map.put('5', new Character[] { 'j', 'k', 'l' });
        map.put('6', new Character[] { 'm', 'n', 'o' });
        map.put('7', new Character[] { 'p', 'q', 'r', 's' });
        map.put('8', new Character[] { 't', 'u', 'v' });
        map.put('9', new Character[] { 'w', 'x', 'y', 'z' });

        helper(result, digits, 0, new StringBuilder());
        return result;
    }

    private void helper(List<String> result, String digits, int idx, StringBuilder sb) {
        if (idx == digits.length()) {
            result.add(new String(sb));
            return;
        }
        Character[] characters = map.get(digits.charAt(idx));
        for (Character c : characters) {
            sb.append(c);
            helper(result, digits, idx + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
