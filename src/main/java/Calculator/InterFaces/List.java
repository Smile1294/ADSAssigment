package Calculator.InterFaces;

import Calculator.Model.Node;

public interface List<T> {
    public boolean isEmpty();
    public int size();
    public void addToFront(T data);
    public Node<T> getNext();
}
