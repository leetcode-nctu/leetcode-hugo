public class Solution {
    public int integerReplacement(int n) {
        return (int) recur(n,0);
    }
    
    public long recur(long n, int count){
        if(n <= 1) return count;
        if(n%2 == 0){
            long t = recur(n/=2,count+1);
            return t;
        }
        else{
            long f = recur(n+1,count+1);
            long s = recur(n-1,count+1);
            f = f < s ? f : s;
            return f;
        }
    }
    
}