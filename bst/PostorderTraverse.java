package bst;

public class PostorderTraverse extends TraverseBTree {

    @Override
    public void traverse(TreeNode treeNode) {
        if(treeNode== null) return;
        traverse(treeNode.left);
        traverse(treeNode.right);
        System.out.print(treeNode.val + "-");
    }
    
}