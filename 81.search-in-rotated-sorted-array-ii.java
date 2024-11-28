/*
 * @lc app=leetcode id=81 lang=java
 *
 * [81] Search in Rotated Sorted Array II
 */

// @lc code=start
class Solution {
    public boolean search(int[] nums, int target) {
        for(int i: nums) {
            if(i == target) return true;
        }
        return false;
    }
}
// @lc code=end

