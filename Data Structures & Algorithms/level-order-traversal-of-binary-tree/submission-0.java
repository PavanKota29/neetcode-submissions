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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> re = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        if(root==null){
            return re;
        }

        que.add(root);

        while(!que.isEmpty()){
            int level = que.size();
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<level;i++){
                if(que.peek().left != null){
                    que.add(que.peek().left);
                }
                if(que.peek().right != null){
                    que.add(que.peek().right);
                }
                temp.add(que.poll().val);
            }
            re.add(temp);
        }

        return re;
        
    }
}
