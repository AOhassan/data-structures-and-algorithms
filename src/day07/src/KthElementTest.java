package day07.src;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthElementTest {

    @org.junit.jupiter.api.Test
    void kthElementTest1() {
        KthElement l1 = new KthElement();
        l1.prepend(2);
        l1.prepend(8);
        l1.prepend(1);
        l1.prepend(3);

        ListNode expected = l1.root.next.next.next;
        ListNode actual = l1.kthElement(0);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void kthElementTest2() {

        KthElement l1 = new KthElement();
        l1.prepend(2);
        l1.prepend(8);
        l1.prepend(1);
        l1.prepend(3);

        ListNode expected = l1.root.next.next.next;
        ListNode actual = l1.kthElement(0);

        assertEquals(expected, actual);
    }
}