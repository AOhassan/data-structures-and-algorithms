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


    private int findMax2(TreeNode node) {
        if (node == null) return Integer.MIN_VALUE;

        int left = (node.data > this.findMax(node.left)) ? node.data : this.findMax(node.left);
        int right = (node.data > this.findMax(node.right)) ? node.data : this.findMax(node.right);
        int max = (left > right) ? left : right;

        return max;
    }

    public int findMax2() {
        return this.findMax(this.root);
    }
}