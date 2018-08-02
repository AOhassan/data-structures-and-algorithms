package day18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMaxTest {

    @Test
    void findMaxTest() {
        FindMax tree = new FindMax();

        TreeNode n1 = new TreeNode(-30);
        TreeNode n2 = new TreeNode(-1);
        TreeNode n3 = new TreeNode(-45);
        TreeNode n4 = new TreeNode(-20);
        TreeNode n5 = new TreeNode(-3);

        tree.root = n2;

        n2.left = n1;
        n2.right = n3;

        n3.left = n4;
        n1.right = n5;

        int expected = -1;
        int actual = tree.findMax();

        assertEquals(expected,actual);
    }

    @Test
    void findMaxTest2() {
        FindMax tree = new FindMax();

        TreeNode n1 = new TreeNode(70);
        TreeNode n2 = new TreeNode(55);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(40);
        TreeNode n5 = new TreeNode(81);
        TreeNode n6 = new TreeNode(80);

        tree.root = n2;

        n2.left = n1;
        n2.right = n3;

        n3.left = n4;
        n3.right = n6;

        n1.right = n5;

        int expected = 81;
        int actual = tree.findMax();

        assertEquals(expected,actual);
    }

    @Test
    void findMaxTest3() {
        FindMax tree = new FindMax();

        TreeNode n1 = new TreeNode(401);
        TreeNode n2 = new TreeNode(100);
        TreeNode n3 = new TreeNode(101);
        TreeNode n4 = new TreeNode(80);
        TreeNode n5 = new TreeNode(81);

        tree.root = n2;

        n2.left = n1;
        n2.right = n3;

        n3.left = n4;
        n1.right = n5;

        int expected = 401;
        int actual = tree.findMax();

        assertEquals(expected,actual);
    }
}