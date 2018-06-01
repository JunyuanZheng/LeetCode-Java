public class Question10 {
    public int myAtoi(String str) {
        int result = 0, sign = 1, idx = 0;

        if (str.length() == 0)
            return 0;

        while (str.charAt(idx) != ' ')
            idx += 1;


        if (str.charAt(idx) == '-' || str.charAt(idx) == '+') {
            sign = str.charAt(idx) == '+' ? 1 : -1;
            idx += 1;
        }

        while (idx < str.length()) {
            int digit = str.charAt(idx) - '0';
            if (digit > 9 || digit < 0)
                break;
            //check if total will be overflow after 10 times and add digit
            if (Integer.MAX_VALUE / 10 < result || Integer.MAX_VALUE / 10 == result && Integer.MAX_VALUE % 10 < digit)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            result = 10 * result + digit;
            idx++;
        }

        return sign * result;
    }
}
