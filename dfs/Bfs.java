package dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Bfs {
     public void traverseDfs(Node node){
        Stack<Node> nodeStack = new Stack<>();


        List<Node> visited = new ArrayList<>();
        
        visited.add(node);

        nodeStack.add(node);

        while (!nodeStack.isEmpty()) {
            Node cNode = nodeStack.pop();

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
