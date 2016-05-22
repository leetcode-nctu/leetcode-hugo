public class Solution {
    public boolean isPalindrome(String s) {
        for(int i = 0,j = s.length()-1;i<j;i++,j--){
            if(!isAlphanumeric(s.charAt(i))){
                ++j;
                continue;
            }
            if(!isAlphanumeric(s.charAt(j))){
                --i;
                continue;
            }
            if(Character.toLowerCase(s.charAt(i))!= Character.toLowerCase(s.charAt(j))) return false;
        }
        
        return true;
    }
    
    private static boolean isAlphanumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }
}