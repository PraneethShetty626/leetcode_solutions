/*
 * @lc app=leetcode id=133 lang=java
 *
 * [133] Clone Graph
 */

// @lc code=start
/*
// Definition for a Node.

*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    
    Map<Integer, Node> clone = new HashMap<>();

    public Node cloneGraph(Node node) {
        
        if(node == null) return null;

        if(clone.containsKey(node.val)){
            return clone.get(node.val);
        }
        else {
            Node node2 = new Node(node.val);

            clone.put(node.val, node2);
            
            ArrayList<Node> neighbours = new ArrayList<>();

            for(Node node3:node.neighbors){
                neighbours.add(cloneGraph(node3));
            }

            node2.neighbors = neighbours;

            return node2;
        }
    }
}
// @lc code=end

