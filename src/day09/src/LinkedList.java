import java.util.HashSet;

public class LinkedList {
    ListNode root;
    public LinkedList() {
        this.root = null;
    }

    public boolean hasLoop() {

        HashSet<Integer> set = new HashSet<>();
        LinkedList ll = new LinkedList();

        ListNode current = this.root;
        while(current != null) {
            if(set.contains(current.data)){       // checks if the set has current node value
                return true;
            }
            set.add(current.data);             // if it doesn't it adds that value to the set
            current = current.next;
        }
        return false;
    }
}