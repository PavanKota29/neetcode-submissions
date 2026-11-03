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
    public int maxPathSum(TreeNode root) {

        int[] res = new int[1];
        res[0] = Integer.MIN_VALUE;
        maxPathDown(root,res);
        return res[0];
        
    }

    public int maxPathDown(TreeNode root,int[] res){
        if(root == null){
            return 0;
        }
        int maxLeft = Math.max(0,maxPathDown(root.left,res));
        int maxRight = Math.max(0,maxPathDown(root.right,res));
        res[0] = Math.max(res[0],maxLeft + maxRight + root.val);

        return Math.max(maxLeft,maxRight)+ root.val;

    }
}
