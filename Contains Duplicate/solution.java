public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hash = new HashSet<Integer>();
        for(int i : nums) if(!hash.add(i)) return true;
        return false;
    }
}