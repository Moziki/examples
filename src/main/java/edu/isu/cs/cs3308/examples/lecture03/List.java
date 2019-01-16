package edu.isu.cs.cs3308.examples.lecture03;

public interface List<E> {

    E first();
    E last();
    E removeFirst();
    E removeLast();
    void addFirst(E item);
    void addLast(E item);
    E get(int index);
    int size();
    boolean isEmpty();
    int indexOf(E item);
    void insert(E item, int index);
    E remove(int index);
}
