package edu.isu.cs.cs3308.examples.lecture20.linkedlist;

/**
 *
 * @author griffith
 */
public class Node<E>{
    private E element;
    private Node<E> next;
    
    public Node(E element, Node next) {
        this.element = element;
        this.next = next;
    }
    
    public void setNextNode(Node next) {
        this.next = next;
    }
    
    public Node<E> getNextNode() {
        return next;
    }
    
    public E getElement() {
        return element;
    }
    
    public String toString() {
        return element.toString();
    }
}
