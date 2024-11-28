package dfs;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Node node = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);
        
        node.neighbors = Arrays.asList(node1, node2);
        node1.neighbors = Arrays.asList(node3, node4);
        node2.neighbors = Arrays.asList(node5, node6);
        node3.neighbors = Arrays.asList(node7, node8);
        node4.neighbors = Arrays.asList(node9, node10);
     

        Dfs dfs = new Dfs();
        Bfs bfs = new Bfs();

        dfs.traverseDfs(node);
        bfs.traverseDfs(node);

        

    }
    
}
