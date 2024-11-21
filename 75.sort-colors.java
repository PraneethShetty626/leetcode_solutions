/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        int[] res = new int[nums.length];

        int c = 0 ;

        for(int i = 0; i < 3 ; i++) {
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[j] == i) {
                    res[c++] = nums[j];
                }
            }
        }

        for(int i = 0; i < nums.length ; i++) {
            nums[i] = res[i];
        }
    }
}
// @lc code=end

