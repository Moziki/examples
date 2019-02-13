package edu.isu.cs.lectureX;

import java.util.List;

public class BreadthFirstTraversal<E> extends AbstractTraversal<E> {

    @Override
    public void enqueue(Node<E> node, List<Node<E>> queue) {
        queue.add(node);
    }
}
