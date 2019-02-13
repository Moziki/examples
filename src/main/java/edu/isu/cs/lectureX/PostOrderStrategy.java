package edu.isu.cs.lectureX;

import java.util.List;

public class PostOrderStrategy<E> extends TraversalOrderStrategy<E> {

    public void execute(AbstractTraversal<E> tt, List<E> traversal, Node<E> node, List<Node<E>> queue) {
        for (Node<E> child : node.getChildren()) {
            tt.enqueue(child, queue);
        }
        traversal.add(node.getValue());
    }
}
