/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        if(s.isEmpty()) {
            return 0;
        }
        int res = getNumber(s.charAt(0));

        int i = 1 ;

        for(; i < s.length() ; i++) {
            int c = getNumber(s.charAt(i));

            if(c  <= res) {
               break;
            }

            res = c - res;
        }

        return res + romanToInt(s.substring(i));
    }

    public int getNumber(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
// @lc code=end
