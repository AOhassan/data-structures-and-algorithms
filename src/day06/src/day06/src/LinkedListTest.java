package day06.src;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class LinkedListTest {



//    @Test
//    void appendToShortList() {
//        LinkedList l1 = new LinkedList();
//        l1.prepend(1);
//        l1.append(5);
//
//
//        int[] actual = l1.toArray();
//        int[] expected = {1,5};
//        assertArrayEquals(expected,actual);
//    }
//
//    @Test
//    void appendToLongList() {
//        LinkedList l1 = new LinkedList();
//        l1.prepend(6);
//        l1.prepend(5);
//        l1.prepend(4);
//        l1.prepend(3);
//        l1.prepend(2);
//        l1.prepend(1);
//        l1.append(7);
//
//        int[] actual = l1.toArray();
//        int[] expected = {1,2,3,4,5,6,7};
//        assertArrayEquals(expected,actual);
//    }
//
//    @org.junit.jupiter.api.Test
//    void insertBefore() {
//    }
//
//    @org.junit.jupiter.api.Test
//    void insertAfter() {
//    }

    @org.junit.jupiter.api.Test
    void toArrayTest() {
        LinkedList l1 = new LinkedList();
        l1.prepend(6);
        l1.prepend(5);
        l1.prepend(4);
        l1.prepend(3);
        l1.prepend(2);
        l1.prepend(1);

        int[] actual = l1.toArray();
        int[] expected = {1,2,3,4,5,6};

        assertArrayEquals(expected,actual);
    }


}