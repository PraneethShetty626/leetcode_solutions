/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        int res = 0;
        int a =x;
        while (a != 0) {
            res = (res * 10 ) + ( a % 10 );

            a = a/ 10;
        }

        return res ==x ;
    }
}
// @lc code=end

