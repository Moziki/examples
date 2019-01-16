package edu.isu.cs.cs3308.examples.lecture03;

public class SLL<E> implements List<E> {

    protected Node<E> head;
    protected Node<E> tail;
    protected int size = 0;

    @Override
    public E first() {
        return null;
    }

    @Override
    public E last() {
        return null;
    }

    @Override
    public E removeFirst() {
        return null;
    }

    @Override
    public E removeLast() {
        return null;
    }

    @Override
    public void addFirst(E item) {
        if (item == null)
            return;

        Node<E> newNode = new Node<>(item);
        newNode.setNext(head);
        head = newNode;
    }

    @Override
    public void addLast(E item) {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int indexOf(E item) {
        return 0;
    }

    @Override
    public void insert(E item, int index) {
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size)
            return null;

        Node<E> current = head;
        for (int i = 0; i < index; i++)
            current = current.getNext();

        Node<E> toRemove = current.getNext();
        current.setNext(toRemove.getNext());
        toRemove.setNext(null);
        return toRemove.getData();
    }
}
