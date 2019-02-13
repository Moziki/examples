package edu.isu.cs.lectureX;

import com.google.common.collect.Lists;

import java.util.Collection;
import java.util.List;

public abstract class AbstractTraversal<E> implements TreeTraversal<E> {

    @Override
    public List<E> traverse(Node<E> start) {
        List<E> traversal = Lists.newArrayList();
        List<Node<E>> queue = Lists.newLinkedList();

        queue.add(start);
        while (!queue.isEmpty()) {
            Node<E> node = dequeue(queue);

        }

        return traversal;
    }

    public Node<E> dequeue(List<Node<E>> queue) {
        if (!queue.isEmpty())
            return queue.get(0);
        return null;
    }

    public abstract void enqueue(Node<E> node, List<Node<E>> queue);
}
