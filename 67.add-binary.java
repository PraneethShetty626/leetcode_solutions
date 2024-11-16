/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;

        int rem = 0;

        String res = "";

        while (i >= 0 && j >=0) {
            int ca = (int)a.charAt(i--) - 48;
            int cb = (int)b.charAt(j--) - 48;

            res = (ca + cb + rem) % 2 + res;

            rem = (ca + cb + rem) / 2 ;
        }

        while (i >= 0) {
            int ca = (int)a.charAt(i--) - 48;
            res = (ca  + rem) % 2 + res;

            rem = (ca  + rem) / 2 ;
        }

        while (j >= 0) {
            int cb = (int)b.charAt(j--) - 48 ;

            res = ( cb + rem) % 2 + res;

            rem = ( cb + rem) / 2 ;
        }

        if(rem == 1) {
            res = rem + res;
        }

        return res;
    }
}
// @lc code=end

