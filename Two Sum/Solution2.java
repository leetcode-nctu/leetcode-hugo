public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null) return null;
        int[] answer = new int[2];
        int limit = nums.length;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i< limit;i++){
            if(map.containsKey(nums[i])){
                answer[0] = map.get(nums[i]);
                answer[1] = i;
                break;
            }else map.put(target-nums[i],i);
        }  
        return answer;
    }
}