/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    Integer res = 0;
    public int climbStairs(int n) {
        if(n <= 1) {
            return 1;
        }
        int[] res = new int[n];

        res[0] = 1;
        res[1]  = 1;


        for(int i = 2 ; i < n ; i++) {
            res[i] =  res [i - 1] + res[i -2];
        }

        return res[n - 1] + res[n -2];


    }
    // Inefficient for more thatn 40
    // public int sum(int n, int c) {
    //     if(c == n) {
    //         res = res + 1;
    //         return 1;
    //     }
    //     else if( c > n) {
    //         return 0;
    //     }
    //     else {
    //         int step1 = sum(n, c + 1);

    //         int step2 = sum(n, c + 2);

    //         if(step1 != 0 ) {
    //             if(step2 != 0) {
    //                 return 1 + step1 + step2;
    //             }
    //             return 1 + step1 ;
    //         }
    //         else if(step2 != 0){
    //             return 1 + step2;
    //         }
    //         else {
    //             return 0;
    //         }
    //     }
    // }
}
// @lc code=end

