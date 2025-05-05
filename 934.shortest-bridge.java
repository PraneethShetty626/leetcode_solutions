/*
 * @lc app=leetcode id=934 lang=java
 *
 * [934] Shortest Bridge
 *
 * https://leetcode.com/problems/shortest-bridge/description/
 *
 * algorithms
 * Medium (58.18%)
 * Likes:    5576
 * Dislikes: 217
 * Total Accepted:    240.9K
 * Total Submissions: 412K
 * Testcase Example:  '[[0,1],[1,0]]'
 *
 * You are given an n x n binary matrix grid where 1 represents land and 0
 * represents water.
 * 
 * An island is a 4-directionally connected group of 1's not connected to any
 * other 1's. There are exactly two islands in grid.
 * 
 * You may change 0's to 1's to connect the two islands to form one island.
 * 
 * Return the smallest number of 0's you must flip to connect the two
 * islands.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: grid = [[0,1],[1,0]]
 * Output: 1
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: grid = [[0,1,0],[0,0,0],[0,0,1]]
 * Output: 2
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: grid = [[1,1,1,1,1],[1,0,0,0,1],[1,0,1,0,1],[1,0,0,0,1],[1,1,1,1,1]]
 * Output: 1
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * n == grid.length == grid[i].length
 * 2 <= n <= 100
 * grid[i][j] is either 0 or 1.
 * There are exactly two islands in grid.
 * 
 * 
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    Set<Integer[]> queue = new HashSet<>();

    public int shortestBridge(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] == 0)
                    continue;
                else {
                    addZeroToList(grid, i, j);
                    break;
                }
            }
        }

        int min = Integer.MAX_VALUE;

        for (Integer[] index : queue) {
            min = Math.min(min, getShortestPath(grid, index[0], index[1]));
        }

        return min;
    }

    public void addZeroToList(int[][] grid, int i, int j) {
        if (grid[i][j] == 0) {
            queue.add(new Integer[] { i, j });
        } else {
            grid[i][j] = -1;

            if (i + 1 < grid.length)
                addZeroToList(grid, i, j);

            if (i > 0)
                addZeroToList(grid, i - 1, j);

            if (j > 0)
                addZeroToList(grid, i, j - 1);

            if (j + 1 < grid.length)
                addZeroToList(grid, i, j + 1);
        }
    }

    public int getShortestPath(int[][] grid, int i, int j) {
        if (grid[i][j] == 1)
            return 0;

        if (grid[i][j] == 0) {
            grid[i][j] = -1;

            int left = Integer.MAX_VALUE, right = Integer.MAX_VALUE, bottom = Integer.MAX_VALUE,
                    top = Integer.MAX_VALUE;

            if (i > 0)
                top = getShortestPath(grid, i - 1, j);
            if (j > 0)
                left = getShortestPath(grid, i, j - 1);
            if (i < grid.length - 1)
                bottom = getShortestPath(grid, i + 1, j);
            if (j < grid.length - 1)
                right = getShortestPath(grid, i, j + 1);

            int vert = Math.min(top, bottom);
            int hmin = Math.min(left, right);

            grid[i][j] = 0;

            return Math.min(hmin, vert);

        } else {
            return Integer.MAX_VALUE;
        }
    }
}

// @lc code=end
