package edu.isu.cs.cs3308.examples.lecture20.linkedlist;

import java.util.Iterator;

/**
 *
 * @author griffith
 */
public class LinkedListIterator<E> implements Iterator{

    private Node<E> next;
    
    public LinkedListIterator(LinkedList list) {
        next = list.getFirstNode();
    }
    
    @Override
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public E next() {
        E value = next.getElement();
        next = next.getNextNode();
        return value;
    }
}
