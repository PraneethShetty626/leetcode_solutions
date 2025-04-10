/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 *
 * https://leetcode.com/problems/pascals-triangle/description/
 *
 * algorithms
 * Easy (76.03%)
 * Likes:    13632
 * Dislikes: 500
 * Total Accepted:    2.1M
 * Total Submissions: 2.7M
 * Testcase Example:  '5'
 *
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * 
 * In Pascal's triangle, each number is the sum of the two numbers directly
 * above it as shown:
 * 
 * 
 * Example 1:
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * Example 2:
 * Input: numRows = 1
 * Output: [[1]]
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= numRows <= 30
 * 
 * 
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> row = new ArrayList<>();

        List<Integer> prevRow = new ArrayList<>();

        prevRow.add(1);

        row.add(prevRow);

        int c = 1;

        while (c < numRows) {

            List<Integer> newRow = new ArrayList<>();

            newRow.add(1);

            for (int i = 1; i < prevRow.size(); i++) {
                newRow.add(prevRow.get(i) + prevRow.get(i - 1));
            }

            newRow.add(1);

            row.add(newRow);

            prevRow = newRow;

            c++;
        }

        return row;
    }
}
// @lc code=end
