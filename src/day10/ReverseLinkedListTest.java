package day10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    @Test
    void reverseLinkedListTest() {
        ReverseLinkedList ll = new ReverseLinkedList();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);

        ll.root = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        Object actual = ll.reverseLinkedList(l1);

        ReverseLinkedList ll2 = new ReverseLinkedList();
        ListNode r1 = new ListNode(4);
        ListNode r2 = new ListNode(3);
        ListNode r3 = new ListNode(2);
        ListNode r4 = new ListNode(1);

        ll2.root = r1;
        r1.next = r2;
        r2.next = r3;
        r3.next = r4;

        Object expected = r1;

        assertEquals(expected, actual);
    }
}