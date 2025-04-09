/*
 * @lc app=leetcode id=493 lang=java
 *
 * [493] Reverse Pairs
 *
 * https://leetcode.com/problems/reverse-pairs/description/
 *
 * algorithms
 * Hard (31.50%)
 * Likes:    6405
 * Dislikes: 277
 * Total Accepted:    236.5K
 * Total Submissions: 748.5K
 * Testcase Example:  '[1,3,2,3,1]'
 *
 * Given an integer array nums, return the number of reverse pairs in the
 * array.
 * 
 * A reverse pair is a pair (i, j) where:
 * 
 * 
 * 0 <= i < j < nums.length and
 * nums[i] > 2 * nums[j].
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [1,3,2,3,1]
 * Output: 2
 * Explanation: The reverse pairs are:
 * (1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
 * (3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [2,4,3,5,1]
 * Output: 3
 * Explanation: The reverse pairs are:
 * (1, 4) --> nums[1] = 4, nums[4] = 1, 4 > 2 * 1
 * (2, 4) --> nums[2] = 3, nums[4] = 1, 3 > 2 * 1
 * (3, 4) --> nums[3] = 5, nums[4] = 1, 5 > 2 * 1
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 5 * 10^4
 * -2^31 <= nums[i] <= 2^31 - 1
 * 
 * 
 */

// @lc code=start
class Solution {
    public int reversePairs(int[] nums) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        int count = 0;
        for (int i = 0; i < nums.length;) {
            if (nums[i] >= max) {
                if (nums[i] == max && nums[i] < 0) {
                    count++;
                }

                max = nums[i];
                index = i++;

            } else if ((2 * nums[i]) < max) {
                count++;
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                i = 0;
                max = Integer.MIN_VALUE;
                index = 0;
            } else if (nums[i] < max) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                i = 0;
                max = Integer.MIN_VALUE;
            } else {
                i++;
            }

        }

        return count;

    }
}
// @lc code=end
