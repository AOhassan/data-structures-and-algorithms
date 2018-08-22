package day32;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TreeIntersectionTest extends TreeIntersection {

    @Test
    void treeIntersectionShortTest() {

        TreeNode n1 = new TreeNode(100);
        TreeNode n2 = new TreeNode(200);
        TreeNode n3 = new TreeNode(300);

        n1.left = n2;
        n1.right = n3;

        TreeNode r1 = new TreeNode(400);
        TreeNode r2 = new TreeNode(200);
        TreeNode r3 = new TreeNode(500);


        r1.left = r2;
        r1.right = r3;

        Set expected = new HashSet();
        expected.add(200);

        Set actual = treeIntersection(n1, r1);

        assertEquals(expected, actual);

    }

    @Test
    void treeIntersectionMidTest() {

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);


        n1.left = n2;
        n1.right = n3;

        n2.left= n4;
        n2.right= n5;

        n3.left= n6;
        n3.right= n7;

        TreeNode r1 = new TreeNode(2);
        TreeNode r2 = new TreeNode(5);
        TreeNode r3 = new TreeNode(7);


        r1.left = r2;
        r1.right = r3;

        Set expected = new HashSet();
        expected.add(2);
        expected.add(5);
        expected.add(7);

        Set actual = treeIntersection(n1, r1);

        assertEquals(expected, actual);
    }

    @Test
    void treeIntersectionLong() {

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(100);
        TreeNode n9 = new TreeNode(200);
        TreeNode n10 = new TreeNode(30);
        TreeNode n11 = new TreeNode(67);


        n1.left = n2;
        n1.right = n3;

        n2.left= n3;
        n2.right= n4;

        n3.left= n5;
        n3.right= n6;

        n4.left = n7;
        n4.right= n8;

        n5.left= n9;
        n5.right= n10;

        n6.left= n11;

        TreeNode r1 = new TreeNode(1);
        TreeNode r2 = new TreeNode(2);
        TreeNode r3 = new TreeNode(3);
        TreeNode r4 = new TreeNode(4);
        TreeNode r5 = new TreeNode(5);
        TreeNode r6 = new TreeNode(6);
        TreeNode r7 = new TreeNode(7);


        r1.left = r2;
        r1.right = r3;

        r2.left= r4;
        r2.right= r5;

        r3.left= r6;
        r3.right= r7;

        Set expected = new HashSet();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);


        Set actual = treeIntersection(n1, r1);

        assertEquals(expected, actual);
    }

    @Test
    void hashSetTraversalShortTest() {

        TreeNode n1 = new TreeNode(100);
        TreeNode n2 = new TreeNode(200);
        TreeNode n3 = new TreeNode(300);

        n1.left = n2;
        n1.right = n3;


        Set expected = new HashSet();
        expected.add(300);
        expected.add(200);
        expected.add(100);
        Set actual = hashSetTraversal();

        assertEquals(expected, actual);
    }

    @Test
    void hashSetTraversalMidTest() {

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);


        n1.left = n2;
        n1.right = n3;

        n2.left=n4;
        n2.right=n5;

        n3.left=n6;
        n3.right=n7;

        TreeNode r1 = new TreeNode(1);
        TreeNode r2 = new TreeNode(2);
        TreeNode r3 = new TreeNode(5);


        r1.left = r2;
        r1.right = r3;

        Set expected = new HashSet();
        expected.add(200);

        Set actual = treeIntersection(n1, r1);

        assertEquals(expected, actual);
    }

    @Test
    void hashSetTraversalLongTest() {
    }

}