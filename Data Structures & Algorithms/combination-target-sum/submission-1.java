class Solution {

    public void backtrack(int indx,List<List<Integer>> res,int[] arr,int t,List<Integer> ans){
        if(indx == arr.length){
            if(t == 0){
                res.add(new ArrayList<>(ans));
            }
            return;
        }

        if(arr[indx] <= t){
            ans.add(arr[indx]);
            backtrack(indx,res,arr,t-arr[indx],ans);
            ans.remove(ans.size()-1);
        }
        backtrack(indx+1,res,arr,t,ans);
    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        backtrack(0,res,nums,target,ans);
        return res;
        }
}
