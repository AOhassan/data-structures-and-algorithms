package day20;

public class TreeReverse {
    TreeNode root;

    public TreeNode treeReverse(){
        return treeReverse(this.root);
    }

    public TreeNode treeReverse(TreeNode current){
        if(current != null) {
            TreeNode newLeft = treeReverse(current.right);
            current.right = treeReverse(current.left);
            current.left = newLeft;
        }
        return current;
    }
}
