class Solution {
    public int trap(int[] height) {
        if(height == null || height.length==0){
            return 0;
        }

        int n = height.length;
        int i=0,j=n;
        int maxleft = height[0],maxright=height[n-1];

        int res = 0;
        while(i<j){
            if(maxleft < maxright){
                i++;
                maxleft = Math.max(maxleft,height[i]);
                res += maxleft - height[i];
            }else{
                j--;
                maxright = Math.max(maxright,height[j]);
                res += maxright - height[j];
            }
        }

        return res;
        
    }
}
