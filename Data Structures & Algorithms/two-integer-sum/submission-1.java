class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];

        if(nums.length == 0 || nums.length == 1){
            return arr;
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int cal = target - nums[i];
            if(map.containsKey(cal) && map.get(cal)!=i){
                arr[0] = i;
                arr[1] = map.get(cal);
                break;
            }
        }

        return arr;
    }
}
