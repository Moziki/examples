package edu.isu.cs.lectureX;

import java.util.List;

public interface Tree<T> {

    void insert(T data);

    T remove(Node<T> node);

    List<T> children();

    T parent();

    void traverse();

    int height();

    int depth();
}
