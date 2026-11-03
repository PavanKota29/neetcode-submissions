class Solution {
    public int maxArea(int[] heights) {
        int i=0,j=heights.length-1;
        int maxArea = 0;

        while(i<j){
            int w = j-i;//weight
            int h = Math.min(heights[i],heights[j]);
            int area = w*h;
            maxArea = Math.max(area,maxArea);
            if(heights[i] < heights[j]){
                i++;
            }else if(heights[i] > heights[j]){
                j--;
            }else{
                j--;
            }

        }

        return maxArea;
    }
}
