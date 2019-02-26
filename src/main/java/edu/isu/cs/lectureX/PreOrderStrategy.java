package edu.isu.cs.lectureX;

import java.util.List;

public class PreOrderStrategy<E> extends TraversalOrderStrategy {

    public void execute(AbstractTraversal<E> tt, List<E> traversal, Node<E> node, List<Node<E>> queue) {
        traversal.add(node.getValue());
        for (Node<E> child : node.getChildren()) {
            tt.enqueue(child, queue);
        }
    }
}
