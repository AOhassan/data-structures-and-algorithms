public class ReverseLinkedList {
    public ListNode root;

    public ListNode reverseLinkedList(ListNode ll) {

        ListNode prev = null;
        ListNode cur = root;
        ListNode next = ll.next;

        while(cur != null){

            cur.next = prev;

            prev = cur;
            cur = next;
            next = next.next;
        }
        return prev;
    }
}
