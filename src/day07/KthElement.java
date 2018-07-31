package day07;

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

    public void prepend(int data) {
        ListNode nn = new ListNode(data);
        nn.next = this.root;
        this.root = nn;
    }

    public int size() {
        int total = 0;

        ListNode current = this.root;
        while (current != null) {
            total++;
            current = current.next;
        }
        return total;
    }

    public int[] toArray() {
        int[] numbers = new int[this.size()];

        int i = 0;
        ListNode current = this.root;
        while (current != null) {
            numbers[i] = current.data;
            i++;
        }
        return numbers;
    }
}




