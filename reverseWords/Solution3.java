public class Solution {
    public String reverseWords(String s) {
         String[] t = s.trim().split(" ");
         StringBuffer sb = new StringBuffer();
         for(int i = t.length-1; i >= 0; i--){
             if(t[i].isEmpty()) continue;
             else { 
                 sb.append(t[i]);
                 if(i > 0) sb.append(" "); 
                }
             } 
        return sb.toString(); 
    }
}