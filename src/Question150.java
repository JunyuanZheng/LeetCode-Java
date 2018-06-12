import java.util.Stack;

public class Question150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int v1 = stack.pop();
                int v2 = stack.pop();
                int v;
                switch (s) {
                    case "+":
                        v = v2 + v1;
                        break;
                    case "-":
                        v = v2 - v1;
                        break;
                    case "*":
                        v = v2 * v1;
                        break;
                    case "/":
                        v = v2 / v1;
                        break;
                    default:
                        throw new Error("Error");
                }
                stack.push(v);
            } else {
                stack.push(Integer.valueOf(s));
            }
        }
        return stack.pop();
    }
}
