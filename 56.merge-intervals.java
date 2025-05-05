/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 *
 * https://leetcode.com/problems/merge-intervals/description/
 *
 * algorithms
 * Medium (48.47%)
 * Likes:    23218
 * Dislikes: 843
 * Total Accepted:    3.1M
 * Total Submissions: 6.3M
 * Testcase Example:  '[[1,3],[2,6],[8,10],[15,18]]'
 *
 * Given an array of intervals where intervals[i] = [starti, endi], merge all
 * overlapping intervals, and return an array of the non-overlapping intervals
 * that cover all the intervals in the input.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlap, merge them into
 * [1,6].
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: intervals = [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= intervals.length <= 10^4
 * intervals[i].length == 2
 * 0 <= starti <= endi <= 10^4
 * 
 * 
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> res = new ArrayList<>();

        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= current[1]) {
                current[1] = Math.max(current[1], intervals[i][1]); // merge
            } else {
                res.add(current);

                current = intervals[i];
            }
        }

        res.add(current);

        return res.toArray(new int[res.size()][]);

    }
}
// @lc code=end
