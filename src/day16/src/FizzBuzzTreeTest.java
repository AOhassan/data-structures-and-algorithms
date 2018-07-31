import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTreeTest extends FizzBuzzTree {

    @org.junit.jupiter.api.Test
    void fizzBuzzTreeTest1() {
        TreeNode n1 = new TreeNode(30);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(45);
        TreeNode n4 = new TreeNode(20);
        TreeNode n5 = new TreeNode(3);

        n2 = root;
        n1 = n2.left;
        n3 = n2.right;
        n4 = n3.left;
        n5 = n1.right;

        String actual = ("1\n" + "Fizz\n" + "Buzz\n" + "FizzBuzz\n" + "FizzBuzz\n" );
        String expected =  ;

        assertEquals(expected,actual);


    }

    @org.junit.jupiter.api.Test
    void fizzBuzzTreeTest2() {
        TreeNode n1 = new TreeNode(30);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(45);
        TreeNode n4 = new TreeNode(20);
        TreeNode n5 = new TreeNode(3);

        n2 = root;
        n1 = n2.left;
        n3 = n2.right;
        n4 = n3.left;
        n5 = n1.right;

        String actual = ("1\n" + "Fizz\n" + "Buzz\n" + "FizzBuzz\n" + "FizzBuzz\n" );
        String expected = ;

        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void fizzBuzzTreeTest3() {
        TreeNode n1 = new TreeNode(30);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(45);
        TreeNode n4 = new TreeNode(20);
        TreeNode n5 = new TreeNode(3);

        n2 = root;
        n1 = n2.left;
        n3 = n2.right;
        n4 = n3.left;
        n5 = n1.right;

        String actual = ("1\n" + "Fizz\n" + "Buzz\n" + "FizzBuzz\n" + "FizzBuzz\n" );
        String expected = ;

        assertEquals(expected,actual);
//    }

    @org.junit.jupiter.api.Test
    void processTest1() {

        String expected = "FizzBuzz";
        String actual = process(45);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void processTest2() {

        String expected = "Fizz";
        String actual = process(9);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void processTest3() {

        String expected = "Buzz";
        String actual = process(10);

        assertEquals(expected, actual);
    }
}