package edu.isu.cs.cs3308.examples.lecture05;

import edu.isu.cs.cs3308.examples.lecture03.List;
import edu.isu.cs.cs3308.examples.lecture03.SLL;

public class LinkedQueue<E> {

    List<E> data;

    public LinkedQueue() {
        data = new SLL<>();
    }

    public void offer(E data) {
        this.data.addLast(data);
    }

    public E poll() {
        return this.data.removeFirst();
    }

    public E peek() {
        return data.first();
    }

    public int size() {
        return data.size();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }
}
