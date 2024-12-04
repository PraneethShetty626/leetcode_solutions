/*
 * @lc app=leetcode id=22 lang=java
 *
 * [22] Generate Parentheses
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        if(n == 0) return res;

        String pattern = "";

        addNode(pattern, n, n);

        return res;
    }

    public void addNode(String pattern, int o, int c){
        if(o == 0 && c == 0 ){
            if(!pattern.isEmpty())res.add(pattern);
            return;
        }
        else {

            if(o == c) {
                addNode(pattern+"(", o - 1, c);
            }
            else {
                if(o != 0){
                    addNode(pattern+"(", o - 1, c);
                }
    
                if(c != 0){
                    addNode(pattern+")", o , c - 1);
                }
            }
        }
    }
}
// @lc code=end

