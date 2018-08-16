package day20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeReverseTest {

    @Test
    void treeReverseTest() {

        TreeReverse r1 = new TreeReverse();

        TreeNode n1 = new TreeNode(30);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(45);
        TreeNode n4 = new TreeNode(20);
        TreeNode n5 = new TreeNode(3);

        r1.root = n2;

        n2.left = n3;
        n2.right = n1;

        n3.right = n4;
        n1.left = n5;

        TreeReverse r2 = new TreeReverse();

        TreeNode nn1 = new TreeNode(30);
        TreeNode nn2 = new TreeNode(1);
        TreeNode nn3 = new TreeNode(45);
        TreeNode nn4 = new TreeNode(20);
        TreeNode nn5 = new TreeNode(3);

        r2.root = nn2;

        nn2.left = nn1;
        nn2.right = nn3;

        nn3.left = nn4;
        nn1.right = nn5;

        TreeNode expected = r1.root;
        TreeNode actual = r2.treeReverse();

        assertEquals(expected.data, actual.data);
    }


    void TreeReverseTest2() {
        TreeReverse r1 = new TreeReverse();

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);

        r1.root = n2;

        n2.left = n3;
        n2.right = n1;

        n3.right = n4;
        n1.left = n5;

        TreeReverse r2 = new TreeReverse();

        TreeNode nn1 = new TreeNode(1);
        TreeNode nn2 = new TreeNode(2);
        TreeNode nn3 = new TreeNode(3);
        TreeNode nn4 = new TreeNode(4);
        TreeNode nn5 = new TreeNode(5);

        r2.root = nn2;

        nn2.left = nn1;
        nn2.right = nn3;

        nn3.left = nn4;
        nn1.right = nn5;

        TreeNode expected = r1.root;
        TreeNode actual = r2.treeReverse();

        assertEquals(expected.data, actual.data);
    }

    void TreeReverseTest3() {
        TreeReverse r1 = new TreeReverse();

        TreeNode n1 = new TreeNode(200);
        TreeNode n2 = new TreeNode(124);
        TreeNode n3 = new TreeNode(120);
        TreeNode n4 = new TreeNode(150);
        TreeNode n5 = new TreeNode(500);

        r1.root = n2;

        n2.left = n3;
        n2.right = n1;

        n3.right = n4;
        n1.left = n5;

        TreeReverse r2 = new TreeReverse();

        TreeNode nn1 = new TreeNode(200);
        TreeNode nn2 = new TreeNode(124);
        TreeNode nn3 = new TreeNode(120);
        TreeNode nn4 = new TreeNode(150);
        TreeNode nn5 = new TreeNode(500);

        r2.root = nn2;

        nn2.left = nn1;
        nn2.right = nn3;

        nn3.left = nn4;
        nn1.right = nn5;

        TreeNode expected = r1.root;
        TreeNode actual = r2.treeReverse();

        assertEquals(expected.data, actual.data);
    }
}

