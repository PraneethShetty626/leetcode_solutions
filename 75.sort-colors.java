/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        int cindex = 0;

        for(int i =0 ; i < 2 ; i++) {
            for(int j = cindex ; j < nums.length ; j++) {
                if(nums[j] == i){
                    int temp = nums[j];
                    nums[j] = nums[cindex];
                    nums[cindex++] = temp;
                }
            }
        }
    }
}
// @lc code=end

