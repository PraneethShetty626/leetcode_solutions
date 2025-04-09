/*
 * @lc app=leetcode id=73 lang=java
 *
 * [73] Set Matrix Zeroes
 *
 * https://leetcode.com/problems/set-matrix-zeroes/description/
 *
 * algorithms
 * Medium (58.36%)
 * Likes:    15466
 * Dislikes: 787
 * Total Accepted:    1.9M
 * Total Submissions: 3.2M
 * Testcase Example:  '[[1,1,1],[1,0,1],[1,1,1]]'
 *
 * Given an m x n integer matrix matrix, if an element is 0, set its entire row
 * and column to 0's.
 * 
 * You must do it in place.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
 * Output: [[1,0,1],[0,0,0],[1,0,1]]
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
 * Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * m == matrix.length
 * n == matrix[0].length
 * 1 <= m, n <= 200
 * -2^31 <= matrix[i][j] <= 2^31 - 1
 * 
 * 
 * 
 * Follow up:
 * 
 * 
 * A straightforward solution using O(mn) space is probably a bad idea.
 * A simple improvement uses O(m + n) space, but still not the best
 * solution.
 * Could you devise a constant space solution?
 * 
 * 
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {

    public void setZeroes(int[][] matrix) {
        int m = matrix.length;

        List<Integer[]> zeros = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int n = matrix[i].length;

            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    zeros.add(new Integer[] { i, j });
                }
            }
        }

        for (Integer[] integers : zeros) {
            int i = integers[0];
            int j = integers[1];

            while (i < m) {
                matrix[i++][j] = 0;
            }

            i = integers[0];

            while (i >= 0) {
                matrix[i--][j] = 0;
            }

            i = integers[0];

            int n = matrix[i].length;

            while (j < n) {
                matrix[i][j++] = 0;
            }

            j = integers[1];

            while (j >= 0) {
                matrix[i][j--] = 0;
            }

        }
    }

}
// @lc code=end
