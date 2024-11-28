/*
 * @lc app=leetcode id=207 lang=java
 *
 * [207] Course Schedule
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    private class Node {
        int val;
        List<Node> dependency;

        Node(int val){
            this.val = val;
            dependency = new ArrayList<>();
        }
    }

 

    public boolean canFinish(int numCourses, int[][] prerequisites) {
    
        Map<Integer, Node> graph = new HashMap<>();

        for(int[] item : prerequisites){
            graph.putIfAbsent(item[0], new Node(item[0]));
            graph.putIfAbsent(item[1], new Node(item[1]));

            Node  node = graph.get(item[0]);
            node.dependency.add(graph.get(item[1]));

        }


        for(int i : graph.keySet()){
            int val = graph.get(i).val;

            if(isCycle(graph.get(i).dependency, val)){
                return false;
            }
        }

        return graph.keySet()  true;

    }

    public boolean isCycle(Node node, int val){
        if(node == null) return false;


        if(val > (val ^ node.val)) return true;

        val = val ^ node.val;

        return isCycle(node.dependency, val);
    }
}
// @lc code=end

