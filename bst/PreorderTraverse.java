
package bst;


public class PreorderTraverse extends TraverseBTree {

    @Override
    public void traverse(TreeNode treeNode) {
        if(treeNode== null) return;
        System.out.print(treeNode.val + "-");
        traverse(treeNode.left);
        traverse(treeNode.right);
    }
    
}
