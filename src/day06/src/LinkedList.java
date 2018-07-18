public class LinkedList {
    ListNode root;

    public LinkedList() {
        this.root = null;
    }

    public void append(int value) {
        ListNode val = new ListNode(value);
        ListNode current = this.root;
        while (current.next != null) {
            current = current.next;
        }
        current.next = val;
    }

    public void insertBefore(int value, int newVal) {
        ListNode newValue = new ListNode(newVal);
        ListNode current = this.root;
        while (current.next.data != value) {
            current = current.next;
        }
        newValue.next = current.next;
        current.next = newValue;
    }

    public void insertAfter(int value, int newVal) {
        ListNode newValue = new ListNode(newVal);
        ListNode current = this.root;
        if (this.root.data == value) {

        }
        while (current.data != value) {
            current = current.next;
        }
        newValue.next = current.next;
        current.next = newValue;
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
