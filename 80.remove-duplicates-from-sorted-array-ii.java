/*
 * @lc app=leetcode id=80 lang=java
 *
 * [80] Remove Duplicates from Sorted Array II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int c = 1;
        int i = 1 ;

        for(; i < nums.length ; ) {
            if(nums[i-1] == nums[i]) {
                c++;
            }
            else if (nums[i] < nums[i -1]){
                break;
            }
            else {
                c = 1;
            }

            if(c > 2) {

                nums[i] = Integer.MIN_VALUE;

                shiftToEnd(nums, i);
                
                c--;
            }
            else {
                i++;
            }
            
        }

        return i;
    }

    public void shiftToEnd(int[] nums, int index){
        for(int i= index ; i <nums.length -1 ; i++) {
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
        }
    }
}
// @lc code=end

