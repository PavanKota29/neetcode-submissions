class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] res  = new int[temp.length];

        for(int i=0;i<temp.length;i++){
            int count = 1;
            int j=i+1;
            while(j<temp.length){
                if(temp[j] > temp[i]){
                    break;
                }
                j++;
                count++;
            }
            count = (j==temp.length) ? 0 : count;
            res[i] = count;
        }

        return res;
    }
}
