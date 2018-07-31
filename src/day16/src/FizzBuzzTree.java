public class  FizzBuzzTree {
    TreeNode root;
    TreeNode current = this.root;
    TreeNode right = current.right;
    TreeNode left = current.left;

    public void fizzBuzzTree() {

        if (left != null) {
            fizzBuzzTree();
        }

        process(current.data);

        if(right != null) {
            fizzBuzzTree();
        }
    }


    public String process(int value) {
        if(value % 3 == 0 && value % 5 == 0){
            return "FizzBuzz\n";
        }
        if(value % 3 == 0){
            return "Fizz\n";
        }
        else if (value % 5 == 0){
            return "Buzz\n";
        }
        else{
            return value + "\n";
        }
    }
}
