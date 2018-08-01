import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstTraversal {
    TreeNode root;

    public String breadthFirstTraversal(){
        return breadthFirstTraversal(this.root);
    }
    public String breadthFirstTraversal(TreeNode current){

        if(current == null) return "";

        Queue<TreeNode> qq = new LinkedList();
        qq.add(current);
        String result = "\n";

        while(!qq.isEmpty()){

            TreeNode poll = qq.poll();
            result += poll.data + "\n";

            if(poll.left != null){
                qq.add(poll.left);
            } if(poll.right != null) {
                qq.add(poll.right);
            }
        }
        return result;
    }
}
