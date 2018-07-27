import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class MaxStackTest {

    @org.junit.jupiter.api.Test
    void poshEmptyTest() {
        MaxStack stack = new MaxStack();
        stack.posh(1);

        int expected = 1;
        int actual = (int) stack.pop();

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void poshShortTest() {
        MaxStack stack = new MaxStack();
        stack.posh(1);
        System.out.println(stack.max());
        stack.posh(2);
        System.out.println(stack.max());


        int[] expected = {1,2};
        int[] actual = stack.toArr();



        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void poshLongTest() {
    }

    @org.junit.jupiter.api.Test
    void maxEmptyTest() {
    }
    @org.junit.jupiter.api.Test
    void maxShortTest() {
    }
    @org.junit.jupiter.api.Test
    void maxLongTest() {
    }
}