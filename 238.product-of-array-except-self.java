/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int prod = 1;
        int isZero = 0;
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] == 0) {
                isZero++;
            }
            else {
                prod *= nums[i];
            }
            res[i]=nums[i];
        }

        for(int i =0 ; i < res.length ; i++) {
            if (res[i] != 0) {
                if(isZero > 0) res[i] = 0;
                else res[i] = prod / res[i];
            }
            else {
                if(isZero == 1)
                    res[i] = prod;
                else
                    res[i] = 0;
            }
        }


        return res;
    }


}
// @lc code=end

