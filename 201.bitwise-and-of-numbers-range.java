/*
 * @lc app=leetcode id=201 lang=java
 *
 * [201] Bitwise AND of Numbers Range
 */

// @lc code=start
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int res = left++;

        while (left <= right) {
            res = res & left++;
        }

        return res;
    }
}
// @lc code=end

