public class Solution {
    public int singleNumber(int[] nums) {
        if(nums == null) return -1;
        else if(nums.length < 3) return nums[0];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i : nums){
            if(map.get(i) == null) map.put(i,1);
            else map.put(i,map.get(i)+1);
        }
        
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() < 3) return e.getKey();
        }
        return -1;
    }
}