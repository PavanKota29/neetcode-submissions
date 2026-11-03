class Solution {
    int count = 0;
    int res = 0;
    public void solve(TreeNode root,int k){
        if(root == null) return;
        
        solve(root.left,k);
        count++;
        if(count == k){
            res = root.val;
            return;
        }
        
        solve(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        solve(root,k);
        return res;
    }
}
