class Solution {
    public int trap(int[] height) {
        if(height.length == 0 || height == null){
            return 0;
        }
        int n = height.length;
        int res = 0;
        for(int i=0;i<n;i++){
            int maxleft = height[i];
            int maxright = height[i];
            for(int l=0;l<i;l++){
                maxleft = Math.max(maxleft,height[l]);
            }
            for(int k=i+1;k<n;k++){
                maxright = Math.max(maxright,height[k]);
            }

            res += Math.min(maxleft,maxright) - height[i];
        }

        return res;
    }
}
// public class Solution {
//     public int trap(int[] height) {
//         if (height == null || height.length == 0) {
//             return 0;
//         }
//         int n = height.length;
//         int res = 0;

//         for (int i = 0; i < n; i++) {
//             int leftMax = height[i];
//             int rightMax = height[i];

//             for (int j = 0; j < i; j++) {
//                 leftMax = Math.max(leftMax, height[j]);
//             }
//             for (int j = i + 1; j < n; j++) {
//                 rightMax = Math.max(rightMax, height[j]);
//             }

//             res += Math.min(leftMax, rightMax) - height[i];
//         }
//         return res;
//     }
// }
