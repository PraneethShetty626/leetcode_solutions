/*
 * @lc app=leetcode id=229 lang=java
 *
 * [229] Majority Element II
 *
 * https://leetcode.com/problems/majority-element-ii/description/
 *
 * algorithms
 * Medium (53.25%)
 * Likes:    10231
 * Dislikes: 461
 * Total Accepted:    925.5K
 * Total Submissions: 1.7M
 * Testcase Example:  '[3,2,3]'
 *
 * Given an integer array of size n, find all elements that appear more than ⌊
 * n/3 ⌋ times.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [3,2,3]
 * Output: [3]
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [1]
 * Output: [1]
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: nums = [1,2]
 * Output: [1,2]
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 5 * 10^4
 * -10^9 <= nums[i] <= 10^9
 * 
 * 
 * 
 * Follow up: Could you solve the problem in linear time and in O(1) space?
 * 
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int t = nums.length / 3;

        Map<Integer, Integer> c = new HashMap<>();

        List<Integer> res = new ArrayList<>();

        for (int i : nums) {
            int count = c.getOrDefault(i, 0) + 1;

            c.put(i, count);
        }

        for (Integer key : c.keySet()) {
            if (c.get(key) > t)
                res.add(key);
        }

        return res;

    }
}
// @lc code=end
