import java.util.*;
import java.util.stream.Collectors;

public class Question49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> tmp = map.getOrDefault(key, new ArrayList<>());
            tmp.add(s);
            map.put(key, tmp);
        }
        return map.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
    }
}
