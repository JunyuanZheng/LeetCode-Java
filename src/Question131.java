import java.util.ArrayList;
import java.util.List;

public class Question131 {
    public List<List<String>> partition(String s) {
        List<List<String>> lists = new ArrayList<>();
        List<String> list = new ArrayList<>();
        helper(lists, list, s, 0);
        return lists;
    }

    private void helper(List<List<String>> lists, List<String> list, String s, int start) {
        if (list.size() > 0 && start == s.length()) {
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int end = start; end < s.length(); end += 1) {
            if (this.isPalindrome(s, start, end)) {
                list.add(s.substring(start, end + 1));
                helper(lists, list, s, end + 1);
                list.remove(list.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String str, int l, int r){
        if(l==r) return true;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)) return false;
            l++;r--;
        }
        return true;
    }

    public static void main(String[] args) {
        Question131 test = new Question131();
        test.partition("aab");
    }
}
