import java.util.Collections;
import java.util.HashSet;

public class LinkedList {
    ListNode root;
    public LinkedList() {
        this.root = null;
    }

    public static boolean hasLoop() {
        HashSet<Integer> list = new HashSet<>();
        LinkedList ll = new LinkedList();
       while(current != null) {
                list.add(ll.get(i));
            }
        for (int i = 0; i < list.size(); i++) {
            if (list.contains(i))
                return true;
        }
        return false;
    }

    public int get(int index) {
        int n = 0;
        ListNode current = this.root;

        while (n < index) {
            n++;
            current = current.next;
        }
        return current.data;
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

    public void append(int value) {
        ListNode val = new ListNode(value);
        ListNode current = this.root;
        while (current.next != null) {
            current = current.next;
        }
        current.next = val;
    }
}