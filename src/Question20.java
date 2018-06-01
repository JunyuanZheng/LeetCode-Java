import java.util.ArrayDeque;
import java.util.Queue;

public class Question20 {
    public boolean isValid(String s) {
        ArrayDeque<Character> queue = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                queue.push(')');
            else if (c == '{')
                queue.push('}');
            else if (c == '[')
                queue.push(']');
            else if (queue.isEmpty() || queue.pop() != c)
                return false;
        }
        return queue.isEmpty();
    }
}
