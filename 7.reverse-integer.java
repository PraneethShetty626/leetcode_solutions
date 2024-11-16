/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        int n = 0;
        while (x != 0) {
            n = ( n * 10 ) + (x % 10);
            x = x / 10; 
        }

        return n;
    }
}
// @lc code=end

