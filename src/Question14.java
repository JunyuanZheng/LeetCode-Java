public class Question14 {
    /*
      Horizontal scanning
     */
    /*
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        String result = strs[0];
        int i = 1;
        while (i < strs.length) {
            while (strs[i].indexOf(result) != 0) {
                result = result.substring(0, result.length() - 1);
                if (result.isEmpty())
                    return "";
            }
            i += 1;
        }
        return result;
    }
    */

    /*
      Method 2
     */
    /*
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        return longestCommonPrefix(strs, 0, strs.length - 1);
    }
    public String longestCommonPrefix(String[] strs, int low, int high) {
        if (low == high) {
            return strs[low];
        }
        else {
            int mid = low + (high - low) / 2;
            String lcpLeft =   longestCommonPrefix(strs, low , mid);
            String lcpRight =  longestCommonPrefix(strs, mid + 1,r);
            return commonPrefix(lcpLeft, lcpRight);
        }
    }
    String commonPrefix(String left,String right) {
        int min = Math.min(left.length(), right.length());
        for (int i = 0; i < min; i++) {
            if ( left.charAt(i) != right.charAt(i) )
                return left.substring(0, i);
        }
        return left.substring(0, min);
    }
    */
}
