package dfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}


public class Dfs {

    public void traverseDfs(Node node){
        Queue<Node> nodeStack = new LinkedList<>();


        List<Node> visited = new ArrayList<>();
        
        visited.add(node);

        nodeStack.add(node);

        while (!nodeStack.isEmpty()) {
            Node cNode = nodeStack.poll();

            System.out.print(cNode.val  +"-");

            for(Node n : cNode.neighbors){
                if(!visited.contains(n)) {
                    nodeStack.add(n);
                    visited.add(n);
                }
                
            }
            
        }

        System.out.println();

    }
    
}
