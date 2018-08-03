package day19;

public class IsIdentical {
    TreeNode root;

    public boolean isIdentical(TreeNode r2){
        return isIdentical(this.root, r2);
    }

    public boolean isIdentical(TreeNode r1, TreeNode r2){
        if(r1 == null && r2 == null) return true;

        boolean current = (r1.data == r2.data);
        boolean left = this.isIdentical(r1.left, r2.left);
        boolean right = this.isIdentical(r1.right, r2.right);

        if(r1 != null && r2 != null ) return current && left && right;

        return false;
    }
}