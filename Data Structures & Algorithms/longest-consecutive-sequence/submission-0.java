class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        for(int n:nums){
            st.add(n);
        }
        int longest = 0;
        for(int num:nums){
            int length = 1;
            if(!st.contains(num-1)){
                while(st.contains(num+length)){
                    length++;
                }
                longest = Math.max(length,longest);
            }
        }
    
        return longest;

    }
}
