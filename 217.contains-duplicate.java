/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> amp = new HashMap<>();

        for(int i: nums) {
            if(amp.containsKey(i)) return true;
            amp.put(i, null);
        }

        return false;
    }
}
// @lc code=end

