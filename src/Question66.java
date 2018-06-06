import java.util.ArrayDeque;

public class Question66 {
    /*
    public int[] plusOne(int[] digits) {
        ArrayDeque<Integer> list = new ArrayDeque<>();
        int overflow = 1;
        for (int i = digits.length - 1; i >= 0; i -= 1) {
            int tmp = overflow + digits[i];
            list.push(tmp % 10);
            overflow = tmp / 10;
        }
        if (overflow != 0)
            list.push(overflow);
        return list.stream().mapToInt(i -> i).toArray();
    }
    */
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }
        int[] newNumber = new int [n+1];
        newNumber[0] = 1;
        return newNumber;
    }
}
