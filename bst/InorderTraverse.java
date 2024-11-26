package bst;


public class InorderTraverse extends TraverseBTree {

    @Override
    public void traverse(TreeNode treeNode) {
        if(treeNode== null) return;
        traverse(treeNode.left);
        System.out.print(treeNode.val + "-");
        traverse(treeNode.right);
    }
    
}
