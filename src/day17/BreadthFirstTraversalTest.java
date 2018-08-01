package day17;

import static org.junit.jupiter.api.Assertions.*;

class BreadthFirstTraversalTest {

    @org.junit.jupiter.api.Test
    void breadthFirstTraversal() {
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

        String actual = tree.breadthFirstTraversal();
        String expected = "\n1\n30\n45\n3\n20\n";

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void breadthFirstTraversal2() {
        BreadthFirstTraversal tree = new BreadthFirstTraversal();

        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(15);
        TreeNode n3 = new TreeNode(21);
        TreeNode n4 = new TreeNode(27);
        TreeNode n5 = new TreeNode(30);

        tree.root = n2;

        n2.left = n1;
        n2.right = n3;

        n3.left = n4;
        n1.right = n5;

        String actual = tree.breadthFirstTraversal();
        String expected = "\n15\n5\n21\n30\n27\n";

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void breadthFirstTraversal3() {
        BreadthFirstTraversal tree = new BreadthFirstTraversal();

        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(4);
        TreeNode n4 = new TreeNode(15);
        TreeNode n5 = new TreeNode(70);

        tree.root = n2;

        n2.left = n1;
        n2.right = n3;

        n3.left = n4;
        n1.right = n5;

        String actual = tree.breadthFirstTraversal();
        String expected = "\n1\n5\n4\n70\n15\n";

        assertEquals(expected, actual);
    }
}