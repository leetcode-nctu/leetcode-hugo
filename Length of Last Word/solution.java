public class Solution {
    public int lengthOfLastWord(String s) {
        String[] tmpStr = s.split(" ");
        if(tmpStr.length < 1) return 0;
        return tmpStr[tmpStr.length-1].length();
    }
}