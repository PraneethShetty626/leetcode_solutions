/*
 * @lc app=leetcode id=37 lang=java
 *
 * [37] Sudoku Solver
 *
 * https://leetcode.com/problems/sudoku-solver/description/
 *
 * algorithms
 * Hard (63.54%)
 * Likes:    10138
 * Dislikes: 292
 * Total Accepted:    760K
 * Total Submissions: 1.2M
 * Testcase Example:  '[["5","3",".",".","7",".",".",".","."],["6",".",".","1","9","5",".",".","."],[".","9","8",".",".",".",".","6","."],["8",".",".",".","6",".",".",".","3"],["4",".",".","8",".","3",".",".","1"],["7",".",".",".","2",".",".",".","6"],[".","6",".",".",".",".","2","8","."],[".",".",".","4","1","9",".",".","5"],[".",".",".",".","8",".",".","7","9"]]'
 *
 * Write a program to solve a Sudoku puzzle by filling the empty cells.
 * 
 * A sudoku solution must satisfy all of the following rules:
 * 
 * 
 * Each of the digits 1-9 must occur exactly once in each row.
 * Each of the digits 1-9 must occur exactly once in each column.
 * Each of the digits 1-9 must occur exactly once in each of the 9 3x3
 * sub-boxes of the grid.
 * 
 * 
 * The '.' character indicates empty cells.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: board =
 * [["5","3",".",".","7",".",".",".","."],["6",".",".","1","9","5",".",".","."],[".","9","8",".",".",".",".","6","."],["8",".",".",".","6",".",".",".","3"],["4",".",".","8",".","3",".",".","1"],["7",".",".",".","2",".",".",".","6"],[".","6",".",".",".",".","2","8","."],[".",".",".","4","1","9",".",".","5"],[".",".",".",".","8",".",".","7","9"]]
 * Output:
 * [["5","3","4","6","7","8","9","1","2"],["6","7","2","1","9","5","3","4","8"],["1","9","8","3","4","2","5","6","7"],["8","5","9","7","6","1","4","2","3"],["4","2","6","8","5","3","7","9","1"],["7","1","3","9","2","4","8","5","6"],["9","6","1","5","3","7","2","8","4"],["2","8","7","4","1","9","6","3","5"],["3","4","5","2","8","6","1","7","9"]]
 * Explanation: The input board is shown above and the only valid solution is
 * shown below:
 * 
 * 
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * board.length == 9
 * board[i].length == 9
 * board[i][j] is a digit or '.'.
 * It is guaranteed that the input board has only one solution.
 * 
 * 
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public void solveSudoku(char[][] board) {
        solveSudokuIndex(board);
    }

    public boolean solveSudokuIndex(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; i++) {
                if (board[i][j] == '.') {
                    for (int k = 49; k < 58; k++) {
                        board[i][j] = (char) 49;

                        if (solveSudoku(board, i, j) && solveSudokuIndex(board)) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }

    public boolean solveSudoku(char[][] board, int i, int j) {
        Map<Character, Integer> map = new HashMap<>();

        for (int k = i; k < board.length; k++) {
            if (map.containsKey(board[k][j]))
                return false;
            else {
                map.put(board[k][j], 0);
            }
        }

        map.clear();

        for (int k = j; k < board[i].length; k++) {
            if (map.containsKey(board[i][k]))
                return false;
            else {
                map.put(board[i][k], 0);
            }
        }

        map.clear();

        i = (i / 3) * 3;
        j = (j / 3) * 3;

        for (int k = i; k < i + 3; k++) {
            for (int l = j; l < j + 3; l++) {
                if (map.containsKey(board[k][l]))
                    return false;
                else {
                    map.put(board[k][l], 0);
                }
            }
        }

        return true;

    }
}
// @lc code=end
