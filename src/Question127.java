import java.util.*;

public class Question127 {
    /*
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord))
            return 0;

        HashSet<String> reached = new HashSet<>();
        reached.add(beginWord);

        int distance = 1;

        while (!reached.contains(endWord)) {
            HashSet<String> add = new HashSet<>();
            System.out.println(reached);
            for (String s : reached) {
                for (int i = 0; i < s.length(); i++) {
                    char[] chars = s.toCharArray();
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        if (ch != chars[i]) {
                            chars[i] = ch;
                            String word = new String(chars);
                            if (wordList.contains(word)) {
                                add.add(word);
                                wordList.remove(word);
                            }
                        }
                    }
                }
            }
            distance += 1;
            if (add.isEmpty())
                return 0;
            reached = add;
        }

        return distance;
    }
    */

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord))
            return 0;

        HashSet<String> begin = new HashSet<>();
        HashSet<String> end = new HashSet<>();
        HashSet<String> visited = new HashSet<>();

        begin.add(beginWord);
        end.add(endWord);

        visited.add(endWord);
        visited.add(beginWord);

        int length = 1;

        while (!begin.isEmpty() && !end.isEmpty()) {
            if (begin.size() > end.size()) {
                HashSet<String> tmp = begin;
                begin = end;
                end = tmp;
            }
            HashSet<String> tmp = new HashSet<>();
            for (String s : begin) {
                char[] chars = s.toCharArray();
                for (int i = 0; i < s.length(); i++) {
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        char old = chars[i];
                        if (ch != old) {
                            chars[i] = ch;
                            String word = new String(chars);
                            if (end.contains(word)) {
                                return length + 1;
                            }
                            if (!visited.contains(word) && wordList.contains(word)) {
                                tmp.add(word);
                                visited.add(word);
                            }
                        }
                        chars[i] = old;
                    }
                }
            }
            begin = tmp;
            length += 1;
        }
        return 0;
    }
}
