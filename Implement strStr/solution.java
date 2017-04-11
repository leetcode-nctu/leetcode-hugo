public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.equals("")) return 0;
        else if(haystack.equals("")&&!needle.isEmpty()) return -1;
        return haystack.indexOf(needle);
    }
}