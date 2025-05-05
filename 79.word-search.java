/*
 * @lc app=leetcode id=79 lang=java
 *
 * [79] Word Search
 *
 * https://leetcode.com/problems/word-search/description/
 *
 * algorithms
 * Medium (44.22%)
 * Likes:    16642
 * Dislikes: 708
 * Total Accepted:    2M
 * Total Submissions: 4.6M
 * Testcase Example:  '[["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]]\n"ABCCED"'
 *
 * Given an m x n grid of characters board and a string word, return true if
 * word exists in the grid.
 * 
 * The word can be constructed from letters of sequentially adjacent cells,
 * where adjacent cells are horizontally or vertically neighboring. The same
 * letter cell may not be used more than once.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word
 * = "ABCCED"
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word
 * = "SEE"
 * Output: true
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word
 * = "ABCB"
 * Output: false
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * m == board.length
 * n = board[i].length
 * 1 <= m, n <= 6
 * 1 <= word.length <= 15
 * board and word consists of only lowercase and uppercase English letters.
 * 
 * 
 * 
 * Follow up: Could you use search pruning to make your solution faster with a
 * larger board?
 * 
 */

// @lc code=start
class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (dfs(i, j, board, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(int i, int j, char[][] board, String word, int index) {

        if (word.charAt(index) != board[i][j])
            return false;

        board[i][j] = '*';

        index++;

        if (index == word.length())
            return true;

        // search for top
        else if (i > 0 && dfs(i - 1, j, board, word, index)) {
            return true;
        }

        // search for bottom

        else if (i < board.length - 1 && dfs(i + 1, j, board, word, index)) {
            return true;
        }

        // search for left

        else if (j > 0 && dfs(i, j - 1, board, word, index)) {
            return true;
        }
        // search for right

        else if (j < board[i].length - 1 && dfs(i, j + 1, board, word, index)) {
            return true;
        } else {
            board[i][j] = word.charAt(index - 1);
            return false;
        }

    }

}
// @lc code=end
