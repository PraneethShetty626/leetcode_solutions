/*
 * @lc app=leetcode id=29 lang=java
 *
 * [29] Divide Two Integers
 */

// @lc code=start
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == -2147483648 && divisor == -1){
            return 2147483647;
        }
        return dividend / divisor;
    }
}
// @lc code=end

