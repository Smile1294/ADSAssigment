package Calculator.InterFaces;

import java.util.EmptyStackException;

public interface Stack<T> {
    public boolean isEmpty();
    public void push(T elem);
    public T pop() throws EmptyStackException;

}
