package day18;

public class FindMax {
    TreeNode root;

    private int findMax(TreeNode node) {
        if (node == null) return Integer.MIN_VALUE;

        int left = this.findMax(node.left);
        int right = this.findMax(node.right);
        int recurse = Math.max(left, right);

        return Math.max(node.data, recurse);
    }

    public int findMax() {
        return this.findMax(this.root);
    }
}