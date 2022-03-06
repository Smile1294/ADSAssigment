package Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void setData() {
        Node<Integer> node = new Node<>(1);
        node.setData(2);
        assertEquals(node.getData(),2);
    }
    @Test
    void getData() {
        Node<Integer> node = new Node<>(1);
        assertEquals(node.getData(),1);
    }

    @Test
    void getNext() {
        Node<Integer> node = new Node<>(1);
        node.setData(2);
        node.setNext(new Node<Integer>(4));
        assertEquals(4,node.getNext().getData());
    }

    @Test
    void setNext() {
        Node<Integer> node = new Node<>(1);
        node.setData(2);
        node.setNext(new Node<Integer>(4));
        assertEquals(4,node.getNext().getData());
    }
}