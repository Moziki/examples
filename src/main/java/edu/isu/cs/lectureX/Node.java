package edu.isu.cs.lectureX;

import com.google.common.collect.Lists;

import java.util.List;

public class Node<T> {

    private List<Node<T>> children;
    protected Node<T> parent;
    private T value;

    public Node(T value) {
        this.value = value;
        children = Lists.newLinkedList();
    }

    public List<Node<T>> getChildren() {
        return children;
    }

    public void addChild(Node<T> child) {
        if (child != null) {
            children.add(child);
            child.setParent(this);
        }
    }

    public void removeChild(Node<T> child) {
        if (child != null)
            children.remove(child);
    }

    public Node<T> getParent() {
        return parent;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
