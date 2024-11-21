/*
 * @lc app=leetcode id=713 lang=java
 *
 * [713] Subarray Product Less Than K
 */

// @lc code=start
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;

        for(int i = 0 ; i < nums.length ; i++) {
            int p = 1;

            for(int j = i ; j < nums.length ; j ++) {
                p = p * nums[j];

                if(p < k) {
                    count++;
                }
                else {
                    break;
                }
            }
        }

        return count;
    }
}
// @lc code=end

