/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */

// @lc code=start

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = -1;
        int end = -1;
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] == target) {
                if(start == -1) {
                    start = i;
                }

                end = i;
            }
            else if(start != -1 ){
                break;
            }
        }

        return new int[] {start, end};
    }
}
// @lc code=end

