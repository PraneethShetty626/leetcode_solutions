/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return binarySearch(matrix, target, 0, matrix.length - 1);
    }
    public boolean binarySearch(int[][] row, int target, int start, int end){
        if(start == end ) {
            return binarySearch(row[start], target, 0, row[start].length - 1);
        }

        int m = start + (end - start) / 2;

        if(row[m][row[m].length - 1] >= target) {
            return binarySearch(row, target, start, m);
        }
        else {
            return binarySearch(row, target, m+1, end);
        }
    }


    public boolean binarySearch(int[] row, int target, int start, int end){

        if(start == end) {
            return row[start] == target;
        }

        int m = start + (end - start) / 2;

        if(row[m] >= target) {
            return binarySearch(row, target, start, m);
        }
        else {
            return binarySearch(row, target, m+1, end);
        }
    }
}
// @lc code=end

