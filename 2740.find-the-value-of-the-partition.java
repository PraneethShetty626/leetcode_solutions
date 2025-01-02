/*
 * @lc app=leetcode id=2740 lang=java
 *
 * [2740] Find the Value of the Partition
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);

        int max = Integer.MAX_VALUE;

        for(int i = 1 ; i < nums.length ; i++){
            if(Math.abs(nums[i] - nums[i-1]) < max){
                max = Math.abs(nums[i] - nums[i-1]);
            }
        }

        return max;
        
    }
}
// @lc code=end

