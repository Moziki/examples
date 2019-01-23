package edu.isu.cs.cs3308.examples.lecture05;

public class Entry<E, P extends Comparable<P>> implements Comparable<Entry<E, P>> {

    P priority;
    E element;

    public P getPriority() {
        return priority;
    }

    public E getElement() {
        return element;
    }

    @Override
    public int compareTo(Entry<E, P> o) {
        return priority.compareTo(o.getPriority());
    }
}
