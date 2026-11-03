public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> li = new HashMap<>();

        for(String st : strs){
            char[] arr = st.toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
            li.putIfAbsent(s,new ArrayList<>());
            li.get(s).add(st);
        }
        return new ArrayList<>(li.values());
    }
}