public class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\W", "");
        if(s.length()>0){
            for(int i = 0,j = s.length()-1;i<j;i++,j--){
                if(s.charAt(i) == s.charAt(j)) continue;
                if(Character.toLowerCase(s.charAt(i))!= Character.toLowerCase(s.charAt(j))) return false;
            }
        }
        return true;
    }
}
