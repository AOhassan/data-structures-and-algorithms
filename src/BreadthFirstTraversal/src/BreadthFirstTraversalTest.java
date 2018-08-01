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
        String expected = "1\n 30\n 45\n 3\n 20\n";

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
        String expected = "15\n 5\n 21\n 30\n 27\n";

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
        String expected = "1\n 5\n 4\n 70\n 15\n";

        assertEquals(expected, actual);
    }
}