class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] ch1 = s1.toCharArray();
        Arrays.sort(ch1);
        String s = new String(ch1);
        for(int i=0;i<s2.length();i++){
            for(int j=i;j<s2.length();j++){
                char[] st = s2.substring(i,j+1).toString().toCharArray();
                Arrays.sort(st);

                String ss = new String(st);

                if(ss.equals(s)){
                    return true;
                }
            }
        }
        return false;
    }

}
