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
    int maxi = 0;
    public int height(TreeNode root){
        return (root == null) ? 0 : Math.max(height(root.left),height(root.right))+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int maxLeft = height(root.left);
        int maxRight = height(root.right);

        maxi = Math.max(maxi , maxLeft+maxRight);

        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);

        return maxi;

    }
}
