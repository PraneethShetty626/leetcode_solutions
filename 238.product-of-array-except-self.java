/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];


        prefix[0] = 1;

        for(int i = 1; i < nums.length ; i++) {
            prefix[i] = nums[i - 1] * prefix[i - 1];
        }

        
        suffix[nums.length - 1] = 1;


        for(int i = nums.length - 2; i >= 0 ; i--) {
            suffix[i] = nums[i + 1] * suffix[i + 1];

        }

        for(int i =0 ; i < nums.length ; i++){
            nums[i] = prefix[i] * suffix[i];
        }

        return nums;

    }


}
// @lc code=end

