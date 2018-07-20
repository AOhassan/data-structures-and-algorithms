import java.util.Collections;
import java.util.HashSet;

public class LinkedList {
    ListNode root;
    public LinkedList() {
        this.root = null;
    }

    public boolean hasLoop() {

        HashSet<Integer> list = new HashSet<>();
        LinkedList ll = new LinkedList();

        ListNode current = this.root;
        while(current != null) {
            if(list.contains(current.data)){
                return true;
            }
            list.add(current.data);
            current = current.next;
        }
        return false;
    }
}