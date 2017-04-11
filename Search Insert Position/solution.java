public class Solution {
    public int searchInsert(int[] nums, int target) {
        int litmit = nums.length;
        if(litmit < 1) return 0;
        int start = 0,end = litmit,mid = litmit /2;
        if(target >= nums[mid]) start = mid;
        else end = mid+1;
        
        for(int i = start;i <end;i++){
            if( target > nums[i]) continue;
            else return i;
        }
        return litmit;
    }
}