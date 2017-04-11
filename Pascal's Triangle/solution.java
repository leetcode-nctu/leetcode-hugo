public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sublist;
        for(int j = 0 ; j < numRows; j++){
            sublist = new ArrayList<Integer>();
            for(int i =0;i < j/2+1;i++){
                sublist.add(calculate(j,i));
            }
            for(int i = j - (j/2+1); i >-1;i--){
                sublist.add(sublist.get(i));
            }
            result.add(sublist);
        }
        return result;
    }
    
    public int calculate(int row,int idx){
        double a=1 , b =1, c =1 ;
        for(int i = row; i > 0 ;i--) a *= i;
        for(int i = idx; i > 0 ;i--) b *= i;
        for(int i = (row-idx); i > 0 ;i--) c *= i;
        return (int)((a/(b*c))+0.5);
    }
    
}