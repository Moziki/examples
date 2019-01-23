package edu.isu.cs.cs3308.examples.lecture03;

public class DLL<E> extends AbstractList<E> implements List<E> {

    @Override
    public E first() {
        return head.getNext().getData();
    }

    @Override
    public E last() {
        return ((DoubleLinkNode<E>)tail).getPrev().getData();
    }

    @Override
    public E removeFirst() {
        return null;
    }

    @Override
    public E removeLast() {
        Node<E> temp = ((DoubleLinkNode<E>)tail).getPrev();
        ((DoubleLinkNode<E>)temp).getPrev().setNext(temp.getNext());
        ((DoubleLinkNode<E>)temp.getNext()).setPrev(((DoubleLinkNode<E>)temp).getPrev());
        temp.setNext(null);
        ((DoubleLinkNode<E>)temp).setPrev(null);
        size -= 1;
        return temp.getData();
    }

    @Override
    public void addFirst(E item) {
        Node<E> newNode = new DoubleLinkNode<>(item);
        newNode.setNext(head.getNext());
        ((DoubleLinkNode<E>)newNode).setPrev(head);
        head.setNext(newNode);
        ((DoubleLinkNode<E>)newNode.getNext()).setPrev(newNode);
        size += 1;
    }

    @Override
    public void addLast(E item) {

    }

    @Override
    public E get(int index) {
        return null;
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
        return null;
    }
}
