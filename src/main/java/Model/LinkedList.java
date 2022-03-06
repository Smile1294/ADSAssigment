package Model;

import Interfaces.List;

import java.util.EmptyStackException;

public class LinkedList<T> implements List<T>
{
  private Node<T> head;
  private int size;

  @Override public boolean isEmpty()
  {
    return size == 0;
  }

  @Override public int size()
  {
    return size;
  }

  @Override
  public void addToFront(T data)
  {
    Node<T> newNode = new Node<T>(data);
    newNode.setNext(head);
    head = newNode;
    size++;
  }

  @Override public T removeFirst() throws EmptyStackException
  {
    if (isEmpty())
    {
      throw new EmptyStackException();
    }
    Node<T> oldFirst = head;
    head = head.getNext();
    size--;
    return oldFirst.getData();
  }
}
