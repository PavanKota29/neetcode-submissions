class Solution {

    public void backtrack(int[] arr,List<List<Integer>> res,List<Integer> ans,int n,boolean[] fq){
        if(ans.size() == n){
            res.add(new ArrayList<>(ans));
            return;
        }

        for(int i=0;i<n;i++){
           if(!fq[i]){
            fq[i] = true;
            ans.add(arr[i]);
            backtrack(arr,res,ans,n,fq);
            ans.remove(ans.size()-1);
            fq[i] = false;
           }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        boolean[] fq = new boolean[nums.length];
        
        backtrack(nums,res,ans,nums.length,fq);
        return res;
    }
}
