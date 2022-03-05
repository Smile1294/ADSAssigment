package Calculator.Model;

import Calculator.InterFaces.Stack;
import java.util.EmptyStackException;

public class LinkedStack<T> implements Stack<T> {
    private LinkedList<T> list;
    public LinkedStack(LinkedList<T> list){
        this.list = list;
    }
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
    @Override
    public void push(T elem) {
        this.list.addToFront(elem);
    }
    @Override
    public T pop() throws EmptyStackException {
        return this.list.getNext();
    }
}
