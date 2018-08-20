package day27;

public class Node<E> {
    private E data;

    public Node(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public String toString() {
        return this.data.toString();
    }
}

