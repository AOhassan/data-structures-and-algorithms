package day09;

import day08.ListNode;

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
            if(set.contains(current.data)){
                return true;
            }
            set.add(current.data);
            current = current.next;
        }
        return false;
    }
}