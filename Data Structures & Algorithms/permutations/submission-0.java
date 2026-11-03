class Solution {

    public static void backtrack(int[] arr,List<List<Integer>> res,ArrayList<Integer> ans){
        if(ans.size() == arr.length){
            res.add(new ArrayList<>(ans));
            return;
        }

        for(int i=0;i<arr.length;i++){
            if(ans.contains(arr[i])){
                continue;
            }
            ans.add(arr[i]);
            backtrack(arr,res,ans);
            ans.remove(ans.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums,res,new ArrayList<>());
        return res;
    }
}
