package edu.isu.cs.cs3308.examples.lecture03;

public class DoubleLinkNode<E> extends Node<E> {

    protected Node<E> prev;

    public Node<E> getPrev() {
        return prev;
    }

    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }

    public DoubleLinkNode(E data) {
        super(data);
    }
}
