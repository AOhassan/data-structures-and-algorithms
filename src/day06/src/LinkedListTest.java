package day06.src;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class LinkedListTest {



    @Test
    void appendToEmptyListTest() {
        LinkedList l1 = new LinkedList();
        l1.append(5);

        assert


        int[] actual = l1.toArray();
        int[] expected = {5};
        assertArrayEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void insertBefore() {
    }

    @org.junit.jupiter.api.Test
    void insertAfter() {
    }

}