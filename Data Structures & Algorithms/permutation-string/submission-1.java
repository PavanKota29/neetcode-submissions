class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> count1 = new HashMap<>();

        for(char ch : s1.toCharArray()){
            count1.put(ch,count1.getOrDefault(ch,0)+1);
        }

        int need = count1.size();
        for(int i=0;i<s2.length();i++){
            Map<Character,Integer> count2 = new HashMap<>();

            int cur = 0;
            for(int j=i;j<s2.length();j++){
                char ch = s2.charAt(j);
                count2.put(ch,count2.getOrDefault(ch,0)+1);
                if(count1.getOrDefault(ch,0) < count2.get(ch)){
                    break;
                }
                if(count1.getOrDefault(ch,0) == count2.get(ch)){
                    cur++;
                }

                if(need == cur){
                    return true;
                }
            }
        }

        return false;


        // char[] ch1 = s1.toCharArray();
        // Arrays.sort(ch1);
        // String s = new String(ch1);
        // for(int i=0;i<s2.length();i++){
        //     for(int j=i;j<s2.length();j++){
        //         char[] st = s2.substring(i,j+1).toString().toCharArray();
        //         Arrays.sort(st);
        //         String ss = new String(st);
        //         if(ss.equals(s)){
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }

}
