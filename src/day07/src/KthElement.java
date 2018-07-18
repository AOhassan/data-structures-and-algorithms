package day07.src;

public class KthElement {
    ListNode root;

    public ListNode kthElement(int k) {

        this.root = null;
        ListNode current = this.root;

        int total = 0;
        while (current != null) {
            total++;
            current = current.next;
        }

        current = this.root;
        int count = 0;
        while (count != total - k) {
            current = current.next;
            count++;
        }
        return current;
    }
}


