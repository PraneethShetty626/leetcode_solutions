/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start

class Solution {
    public int[] plusOne(int[] digits) {
    int reminder = (digits[digits.length - 1]  + 1 ) ;
        
        digits[digits.length - 1] = reminder % 10;

        reminder /= 10;

        if(reminder == 0) {
            return digits;
        }
        else {
            for(int i = digits.length - 2; i >=0 ; i-- ) {
                reminder+=digits[i]; 
                digits[i] = reminder % 10 ;
                reminder /= 10;
            }

            if(reminder != 0) {
                int[] res = new int[digits.length + 1];

                res[0] = reminder ;

                for(int i = 1 ; i < res.length ; i++) {
                    res[i] = digits[i -1];
                }

                return res;
            }else {
                return digits;
            }
        }
    }
}
// @lc code=end

