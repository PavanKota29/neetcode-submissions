class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int l = 0;
        HashSet<Character> st = new HashSet<>();
        for(int i=0;i<s.length();i++){
            while(st.contains(s.charAt(i))){
                st.remove(s.charAt(l));
                l++;
            }
            st.add(s.charAt(i));
            res = Math.max(res,i-l+1);
        }
        return res;
    }

}
