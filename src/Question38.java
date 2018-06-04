public class Question38 {
    public String countAndSay(int n) {
        StringBuilder sb = new StringBuilder("1");
        for (int i = 1; i < n; i += 1) {
            String previous = new String(sb);
            sb = new StringBuilder();
            for (int right = 0; right < previous.length(); right += 1) {
                int left = right;
                while (right + 1 < previous.length() && previous.charAt(right) == previous.charAt(right + 1)) {
                    right += 1;
                }
                int counter = right - left + 1;
                int value = Character.getNumericValue(previous.charAt(left));
                sb.append(counter);
                sb.append(value);
            }
        }
        return new String(sb);
    }
}
