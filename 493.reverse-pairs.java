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
        return getCount(nums, 0, nums.length - 1);
    }

    public int getCount(int[] nums, int start, int end) {
        if (start == end)
            return 0;

        int middle = start + (end - start) / 2;

        int leftCount = getCount(nums, start, middle);
        int rightCount = getCount(nums, middle + 1, end);

        int c = 0;

        for (int i = start; i <= middle; i++) {
            for (int j = middle + 1; j <= end; j++) {
                if ((long) nums[i] > 2L * nums[j])
                    c++;
            }
        }

        return c + leftCount + rightCount;

    }

}
// @lc code=end
