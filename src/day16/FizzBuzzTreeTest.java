package day16;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTreeTest extends FizzBuzzTree {

    @org.junit.jupiter.api.Test
    void fizzBuzzTreeTest1() {
        FizzBuzzTree tree = new FizzBuzzTree();

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

        tree.fizzBuzzTree(n2);
        System.out.println();

//        expected:
//        FizzBuzz
//        Fizz
//        1
//        Buzz
//        FizzBuzz
    }

    @org.junit.jupiter.api.Test
    void fizzBuzzTreeTest2() {
        FizzBuzzTree tree = new FizzBuzzTree();

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


        tree.fizzBuzzTree(n2);
        System.out.println();

//        expected:
//        Buzz
//        FizzBuzz
//        FizzBuzz
//        Fizz
//        Fizz
    }

    @org.junit.jupiter.api.Test
    void fizzBuzzTreeTest3() {
        FizzBuzzTree tree = new FizzBuzzTree();

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

        tree.fizzBuzzTree(n2);
        System.out.println();

//        expected:
//        Buzz
//        Buzz
//        1
//        FizzBuzz
//        4
    }

    @org.junit.jupiter.api.Test
    void processTest1() {

        process(45);
        System.out.println();

//        expected:
//        FizzBuzz
    }

    @org.junit.jupiter.api.Test
    void processTest2() {

        process(9);
        System.out.println();
    }
//            expected:
//            Fizz

    @org.junit.jupiter.api.Test
    void processTest3() {

        process(10);
        System.out.println();

//        expected:
//        Buzz
    }
}