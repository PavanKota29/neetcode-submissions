class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }else{
                map.put(num,map.get(num)+1);
            }
        }

        for(Map.Entry m:map.entrySet()){
            if((int)m.getValue() >= 2){
                return true;
            }
        }
        return false;
    }
}
