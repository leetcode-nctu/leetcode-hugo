public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null) return null;
            int[] nums2 = Arrays.copyOf(nums, nums.length);
            Arrays.sort(nums2);
            int a = 0, b = 0, start = 0, end = nums2.length-1;

            while(start<end){
                int sum = nums2[start] + nums2[end];
                if(sum < target)
                    start++;
                else if(sum > target)
                    end--;
                else{
                    a = nums2[start]; b = nums2[end];
                    break;
                }
            }
            
            int[] r = new int[2];
            for(int i = 0; i < nums.length; i++){
                if(r[0] == 0 && nums[i] == a){
                    r[0] = i;
                    if(r[1]!=0) break;
                }
                if(nums[i] == b && i != r[0]){
                    r[1] = i;
                    if(r[0]!=0) break;
                }
            }

            return r;
    }
}