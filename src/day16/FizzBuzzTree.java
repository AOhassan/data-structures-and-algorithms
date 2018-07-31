package day16;

public class  FizzBuzzTree {
    TreeNode root;

    public void fizzBuzzTree(TreeNode current) {
        if (current != null) {
            fizzBuzzTree(current.left);
            process(current.data);
            fizzBuzzTree(current.right);
        }
    }

    public void process(int value) {
        if(value % 3 == 0 && value % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if(value % 3 == 0) {
            System.out.println("Fizz");
        } else if (value % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(value);
        }
    }
}
