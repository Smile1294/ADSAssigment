package Interfaces;

import Model.LinkedList;
import Model.LinkedStack;
import Model.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class ListTest<T>{


    @Test
    void isEmpty() {
        List<T> list = new LinkedList<T>();
        T data = null;
        list.addToFront(data);
        assertFalse(list.isEmpty());
    }
    @Test
    void size() {
        List<T> list = new LinkedList<T>();
        T data = null;
        list.addToFront(data);
        assertEquals(list.size(),1);
    }

    @Test
    void addToFront() {
        List<T> list = new LinkedList<T>();
        T data = null;
        list.addToFront(data);
    }

    @Test
    void removeFirst() {
        List<T> list = new LinkedList<T>();
        T data = null;
        list.addToFront(data);
        list.removeFirst();
    }
    @Test
    void popExpectedException() throws EmptyStackException
    {
        Assertions.assertThrows(EmptyStackException.class,()->
        {
            List<T> list = new LinkedList<T>();
            list.removeFirst();
        });
    }
}