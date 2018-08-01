package day18;

public class FindMax {
    TreeNode root;

    public int findMax() {
        return this.findMax(this.root);
    }

    private int findMax(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = this.findMax(node.left);
        int right = this.findMax(node.right);
        int recurse = Math.max(left, right);

        return Math.max(node.data, recurse);
    }
}

