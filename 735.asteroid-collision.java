/*
 * @lc app=leetcode id=735 lang=java
 *
 * [735] Asteroid Collision
 */

// @lc code=start

import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
      Stack<Integer> stack = new Stack<>();

        for(int i : asteroids){
            if(stack.isEmpty() || i > 0 || (stack.peek() < 0 && i < 0)){
                stack.add(i);
            }
            else {
                Integer lv = null;
                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() <= Math.abs(i)) {
                    if(stack.peek() == Math.abs(i))
                    {
                        lv = null;
                        stack.pop();
                        break;
                    } 
                    else lv  = stack.pop();
                }

                if(lv != null && (stack.isEmpty() || (stack.peek() < 0) )){
                    if(lv < Math.abs(i))
                         stack.add(i);
                }
                
            }
        }

        int size = stack.size();

        int[] res = new int[size];

        while (stack.size() != 0) {
            res[--size] = stack.pop();
        }

        return res;
    }
}
// @lc code=end

