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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(null == root) return result;
        dfs(result,root,1);
        return result;
    }
    
    public void dfs(List<Integer> result, TreeNode node, int layer){
        if(null == node) return;
        if(layer > result.size()) result.add(node.val);
        dfs(result,node.right,layer+1);
        dfs(result,node.left,layer+1);
    }
}