package edu.isu.cs.cs3308.examples.lecture05;

import edu.isu.cs.cs3308.examples.lecture03.Node;

public class OrderedList<E extends Comparable<E>> {

    Node<E> head;

    public void add(E element) {
        if (head != null)
        {
            Node<E> current = head;
            while (current.getNext() != null && current.getData().compareTo(element) >= 0) {
                current = current.getNext();
            }

        }
    }

    public void remove(int level) {}
}
