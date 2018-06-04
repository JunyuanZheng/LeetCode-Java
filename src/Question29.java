public class Question29 {
    public int divide(int dividend, int divisor) {
        long result = 0;
        long sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        if (dvd == 0)
            return 0;
        while (dvd >= dvs) {
            long temp = dvs, multiple = 1;
            while (dvd >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            dvd -= temp;
            result += multiple;
        }

        int value;
        if (result > Integer.MAX_VALUE) {
            value = (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            value = sign > 0 ? (int) result : (int) -result;
        }
        return value;
    }
}
