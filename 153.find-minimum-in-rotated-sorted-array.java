/*
 * @lc app=leetcode id=153 lang=java
 *
 * [153] Find Minimum in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    int max = Integer.MAX_VALUE;

    public int findMin(int[] nums) {

        index(nums, 0, nums.length - 1);

        return max;

    }

    public void index(int[] nums, int start, int end) {
        if(start == end) {
            if(nums[start] < max) {
                max = nums[start];
            }
            return;
        }

        int middle = start + (end - start ) / 2;

        index(nums,start, middle);
        index(nums,middle + 1, end);
    }
}
// @lc code=end

