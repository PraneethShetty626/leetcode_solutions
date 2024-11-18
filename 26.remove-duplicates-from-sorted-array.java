/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int element = nums[0];

        int i = 1; 
        int j = 1;

        for(; j < nums.length ; j++) {
            if(element != nums[j]) {
                nums[i++] = nums[j];
                element = nums[j]; 
            }
        }

        return i;
        
    }
}
// @lc code=end

