package edu.isu.cs.cs3308.examples.lecture20.linkedlist;

import java.util.Iterator;

/**
 *
 * @author griffith
 */
public class LinkedList<E> implements Iterable<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public LinkedList() {

    }
    
    public Node getFirstNode() {
        return head;
    }

    public void addFirst(E element) {
        head = new Node(element, head);
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    public void addLast(E element) {
        Node newNode = new Node(element, null);

        if (size == 0) {
            head = newNode;
        } else {
            tail.setNextNode(newNode);
        }

        tail = newNode;
        size++;
    }

    public E removeFirst() {
        if (head != null) {
            E element = head.getElement();
            head = head.getNextNode();
            size--;
            if (size == 0) {
                tail = null;
            }
            return element;
        }
        return null;
    }

    public E getFirst() {
        if (head != null) {
            return head.getElement();
        }
        return null;
    }

    public E getLast() {
        if (tail != null) {
            return tail.getElement();
        }
        return null;
    }
    
    public int getSize() {
        return size;
    }

    public void printList() {
        if (head != null) {
            Node currentNode = head;
            do {
                System.out.println(currentNode.toString());
                currentNode = currentNode.getNextNode();
            } while (currentNode != null);
        }
        System.out.println();
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator<>(this);
    }
}
