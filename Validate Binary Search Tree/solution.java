/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    long BigNum = Long.MAX_VALUE ,SmallNum = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root,BigNum,SmallNum);
    }
    
    public boolean isValidBST(TreeNode root , long max, long min){
        if(root == null) return true;
        if(root.val <= min || root.val >= max) return false;
        return isValidBST(root.left,root.val,min) && isValidBST(root.right,max,root.val);
    }
}