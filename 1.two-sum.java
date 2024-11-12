/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

import java.util.HashMap;
import java.util.Map;

/**
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i < nums.length ; i++) {
            int rest =  target - nums[i] ;

            if(map.containsKey(rest)) {
                res[0] = i;
                res[1] = map.get(rest);
                break;
            }

            map.put(nums[i], i);
        }

        return res;
    }
}
// @lc code=end

