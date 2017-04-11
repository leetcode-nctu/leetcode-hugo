public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int lastline = triangle.size()-1;
        int result = triangle.get(lastline).get(0);
        for(int i = 1; i < triangle.size();i++){
            int len = triangle.get(i).size();
            triangle.get(i).set(0,  triangle.get(i).get(0) + triangle.get(i-1).get(0));
            triangle.get(i).set(len-1, triangle.get(i).get(len-1) + triangle.get(i-1).get(len-2));
            
            int c,l,r,t;
            for(int j = 1,k = len-2; j < len/2; j++,k--){
                c = triangle.get(i).get(j);
                l = c + triangle.get(i-1).get(j-1);
                r = c + triangle.get(i-1).get(j);
                t = l < r ? l : r;
                triangle.get(i).set(j,t);
                
                c = triangle.get(i).get(k);
                l = c + triangle.get(i-1).get(k-1);
                r = c + triangle.get(i-1).get(k);
                t = l < r ? l : r;
                triangle.get(i).set(k,t);
            }
            
            if(len%2!=0){
                c = triangle.get(i).get(len/2);
                l = c + triangle.get(i-1).get(len/2-1);
                r = c + triangle.get(i-1).get(len/2);
                t = l < r ? l : r;
                triangle.get(i).set(len/2,t);
            }
            
            if(i == lastline){
                result = triangle.get(i).get(0);
                for(int j = 1; j < len; j++)
                if(triangle.get(lastline).get(j) < result)
                    result = triangle.get(lastline).get(j);
            }
        }
        return result;
    }
    
}