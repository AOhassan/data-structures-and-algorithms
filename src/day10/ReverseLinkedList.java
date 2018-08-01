package day10;

public class ReverseLinkedList {
    public ListNode root;

    public ListNode reverseLinkedList(ListNode ll) {

        ListNode prev = null;
        ListNode cur = root;
        ListNode next = ll.next;

        while(cur != null){
            next = cur.next;

            cur.next = prev;

            prev = cur;
            cur = next;
        }
        return prev;
    }
}
