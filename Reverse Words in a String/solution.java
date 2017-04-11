public class Solution {
    public String reverseWords(String s) {
         String[] t = s.trim().split(" ");
         if("".equals(t[0])) return "";
         StringBuilder sb = new StringBuilder();
         for(int i = t.length-1; i >= 0; i--){
             if("".equals(t[i])) continue;
             else { 
                 sb.append(t[i]);
                 if(i > 0) sb.append(" "); 
                }
             } 
        return sb.toString(); 
    }
}