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
    public int height(TreeNode root,int[] maxi){
        if(root == null) return 0;

        int maxLeft = height(root.left,maxi);
        int maxRight = height(root.right,maxi);
        maxi[0] = Math.max(maxi[0], maxLeft + maxRight);
        return Math.max(maxLeft,maxRight)+1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        int[] result = new int[1];
        height(root, result);
        return result[0];
    }
}
