public class Question7 {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int tail = x % 10;
            int tmp = result * 10 + tail;
            if ((tmp - tail) / 10 != result)
                return 0;
            result = tmp;
            x /= 10;
        }
        return result;
    }
}
