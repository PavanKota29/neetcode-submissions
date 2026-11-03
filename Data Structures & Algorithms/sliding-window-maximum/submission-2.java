class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<=nums.length-k;i++){
            for(int j=i;j<=i+k-1;j++){
                max=Math.max(max,nums[j]);
            }
            li.add(max);
            max = Integer.MIN_VALUE;
        }

        int[] arr = new int[li.size()];
        int i=0;
        for(int l:li){
            arr[i++] = l;
        }

        return arr;
    }
}
