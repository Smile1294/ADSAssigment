package Calculator.Model;

import Calculator.InterFaces.List;

public class LinkedList<T> implements List<T> {
    private Node<T> head;
    private int size;

    @Override
    public boolean isEmpty() {
        return size >= 1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addToFront(T data) {
        Node<T> node = new Node<T>(data);
        node.setNext(head);
        this.head = node;
        size++;
    }


    @Override
    public Node<T> getNext() {
        return this.head;
    }
}
