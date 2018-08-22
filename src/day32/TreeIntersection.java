package day32;

import java.util.HashSet;
import java.util.Set;

public class TreeIntersection {
    public TreeNode root;
    public Set treeIntersection(TreeNode node1, TreeNode node2){
        Set set1 = new HashSet();
        Set set2 = new HashSet();

        hashSetTraversal(node1,set1);
        hashSetTraversal(node2,set2);

        set1.retainAll(set2);

        return set1;
    }

    public void hashSetTraversal(TreeNode node, Set set){
        if(node != null){
            hashSetTraversal(node.left, set);
            set.add(node.data);
            hashSetTraversal(node.right, set);
        }
    }
}
