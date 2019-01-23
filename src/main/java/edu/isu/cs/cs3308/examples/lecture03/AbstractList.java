package edu.isu.cs.cs3308.examples.lecture03;

public abstract class AbstractList<E> implements List<E> {
    int size;
    Node<E> tail;
    Node<E> head;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
