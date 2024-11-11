/*
 * @lc app=leetcode id=258 lang=java
 *
 * [258] Add Digits
 */

// @lc code=start
class Solution {
    public int addDigits(int num) {
        if(num <=9 ) return num;
        int sum = 0;
        while (num !=0) {
            sum+=num%10;
            num/=10;
        }
        return addDigits(sum);
    }
}
// @lc code=end

