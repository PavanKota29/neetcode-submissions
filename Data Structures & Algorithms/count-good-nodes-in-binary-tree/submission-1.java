/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int count = 0;
    public void solve(TreeNode root,int val){
        if(root == null) return;
        if(root.val >= val){
            count++;
        }
        val = Math.max(val,root.val);
        solve(root.left,val);
        solve(root.right,val);
    }

    public int goodNodes(TreeNode root) {
        solve(root,root.val);
        return count;
    }
}
