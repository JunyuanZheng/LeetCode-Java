public class Question125 {
    public boolean isPalindrome(String s) {
        if (s.length() == 0)
            return true;
        s = s.toLowerCase();
        int low = 0, high = s.length() - 1;
        while (low < high) {
            char l = s.charAt(low);
            char h = s.charAt(high);
            if (!Character.isLetterOrDigit(l)) {
                low += 1;
            } else if (!Character.isLetterOrDigit(h)) {
                high -= 1;
            } else if (l != h) {
                return false;
            } else {
                high -= 1;
                low += 1;
            }

        }
        return true;
    }
}
