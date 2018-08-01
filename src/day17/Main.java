public class Main {

    public static void main(String[] args) {
        BreadthFirstTraversal tree = new BreadthFirstTraversal();

        TreeNode n1 = new TreeNode(30);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(45);
        TreeNode n4 = new TreeNode(20);
        TreeNode n5 = new TreeNode(3);

        tree.root = n2;
        n2.left = n1;
        n2.right = n3;
        n3.left = n4;
        n1.right = n5;

        tree.breadthFirstTraversal();
    }
}
