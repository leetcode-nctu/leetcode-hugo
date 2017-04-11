public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums==null || nums.length==0) { return 0; }
        int current=0, maxSum = nums[0];
        for(int i = 0;i < nums.length;i++){
            current += nums[i];
            maxSum = Math.max(current,maxSum);
            current = Math.max(0,current);
        }
        return maxSum;
    }
}