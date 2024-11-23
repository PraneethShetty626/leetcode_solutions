/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;

        for(int i = 0 , j = height.length -1; i < j ;  ){
            int area = Math.min(height[i], height[j]) * (j - i);

            if(area > max){
                max = area;
            }

            if(height[i] < height[j]){
                i++;
            }
            else {
                j--;
            }
        }

        return max;
    }
}
// @lc code=end

