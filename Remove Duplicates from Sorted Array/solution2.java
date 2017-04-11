public class Solution {
    public int removeDuplicates(int[] nums) {
        int tmp = Integer.MIN_VALUE,count=0,limit = nums.length;
        int[] another = new int[limit];
        for(int i = 0; i< limit;i++){
            if(tmp != nums[i]){
                tmp = nums[i];
                another[count] = nums[i];
                count++;
            }
            else continue;
        }
        for(int i = 0; i< another.length;i++){
            nums[i] = another[i];
        }
        return count;
    }
}