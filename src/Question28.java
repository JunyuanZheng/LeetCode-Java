import share.ListNode;

public class Question28 {
    public int strStr(String haystack, String needle) {
        if (needle.equals(""))
            return 0;
        int size = needle.length();
        for (int i = 0; i <= haystack.length() - size; i += 1) {
            if (haystack.substring(i, i + size).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
