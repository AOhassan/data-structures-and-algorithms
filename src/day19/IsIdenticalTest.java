package day19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsIdenticalTest {

    @Test
    void isIdenticalTest() {

        IsIdentical r1 = new IsIdentical();

        TreeNode n1 = new TreeNode(30);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(45);
        TreeNode n4 = new TreeNode(20);
        TreeNode n5 = new TreeNode(3);

        r1.root = n2;

        n2.left = n1;
        n2.right = n3;

        n3.left = n4;
        n1.right = n5;

        IsIdentical r2 = new IsIdentical();

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

        boolean expected = true;
        boolean actual = r1.isIdentical(r2.root);

        assertEquals(expected, actual);
    }

    void isIdenticalTest2() {

        IsIdentical r1 = new IsIdentical();

        TreeNode n1 = new TreeNode(30);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(45);
        TreeNode n4 = new TreeNode(20);
        TreeNode n5 = new TreeNode(3);

        r1.root = n2;

        n2.left = n1;
        n2.right = n3;

        n3.left = n4;
        n1.right = n5;

        IsIdentical r2 = new IsIdentical();

        TreeNode nn1 = new TreeNode(33);
        TreeNode nn2 = new TreeNode(1);
        TreeNode nn3 = new TreeNode(45);
        TreeNode nn4 = new TreeNode(20);
        TreeNode nn5 = new TreeNode(3);

        r2.root = nn2;

        nn2.left = nn1;
        nn2.right = nn3;

        nn3.left = nn4;
        nn1.right = nn5;

        boolean expected = true;
        boolean actual = r1.isIdentical(r2.root);

        assertEquals(expected, actual);
    }

    void isIdenticalTest3() {

        IsIdentical r1 = new IsIdentical();

        TreeNode n1 = new TreeNode(30);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(20);
        TreeNode n4 = new TreeNode(20);
        TreeNode n5 = new TreeNode(3);

        r1.root = n2;

        n2.left = n1;
        n2.right = n3;

        n3.left = n4;
        n1.right = n5;

        IsIdentical r2 = new IsIdentical();

        TreeNode nn1 = new TreeNode(30);
        TreeNode nn2 = new TreeNode(1);
        TreeNode nn3 = new TreeNode(20);
        TreeNode nn4 = new TreeNode(20);
        TreeNode nn5 = new TreeNode(3);

        r2.root = nn2;

        nn2.left = nn1;
        nn2.right = nn3;

        nn3.left = nn4;
        nn1.right = nn5;

        boolean expected = true;
        boolean actual = r1.isIdentical(r2.root);

        assertEquals(expected, actual);
    }
}