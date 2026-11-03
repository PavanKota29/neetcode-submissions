class Solution {

    public void backtrack(int indx,List<List<Integer>> res,int[] num,int t,ArrayList<Integer> ans){

        if(indx == num.length){
            if(t == 0){
                res.add(new ArrayList<>(ans));
            }
            return;
        }

        if(num[indx] <= t){
            ans.add(num[indx]);
            backtrack(indx,res,num,t - num[indx],ans);
            ans.remove(ans.size()-1);
        
        }

        backtrack(indx+1,res,num,t,ans);


    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        
        backtrack(0,res,nums,target,new ArrayList<>());
        return res;
        }
}
