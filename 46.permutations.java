/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 *
 * https://leetcode.com/problems/permutations/description/
 *
 * algorithms
 * Medium (79.80%)
 * Likes:    19895
 * Dislikes: 355
 * Total Accepted:    2.6M
 * Total Submissions: 3.2M
 * Testcase Example:  '[1,2,3]'
 *
 * Given an array nums of distinct integers, return all the possible
 * permutations. You can return the answer in any order.
 * 
 * 
 * Example 1:
 * Input: nums = [1,2,3]
 * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 * Example 2:
 * Input: nums = [0,1]
 * Output: [[0,1],[1,0]]
 * Example 3:
 * Input: nums = [1]
 * Output: [[1]]
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 6
 * -10 <= nums[i] <= 10
 * All the integers of nums are unique.
 * 
 * 
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        permute(nums, 0);

        return res;
    }

    public void permute(int[] nums, int index) {
        if (index == nums.length - 1) {
            List<Integer> c = new ArrayList<>();

            for (int i : nums)
                c.add(i);

            res.add(c);
        } else {
            for (int i = index; i < nums.length; i++) {
                int[] pc = new int[nums.length];

                for (int j = 0; j < nums.length; j++) {
                    pc[j] = nums[j];
                }

                int temp = pc[i];
                pc[i] = pc[index];
                pc[index] = temp;

                permute(nums, index + 1);
            }
        }
    }
}
// @lc code=end
