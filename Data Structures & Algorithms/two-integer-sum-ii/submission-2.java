class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        while(i<numbers.length){
            int j=0;
            while(j<numbers.length){
                if(numbers[i]+numbers[j] == target && i!=j){
                    return new int[] {i+1,j+1}; 
                }
                j++;
            }
            i++;
        }
        return new int[]{-1,-1};
    }
}
