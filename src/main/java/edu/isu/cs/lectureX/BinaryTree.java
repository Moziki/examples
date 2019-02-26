package edu.isu.cs.lectureX;

import com.google.common.collect.Lists;

import java.util.List;

public class BinaryTree<E> {

    private BinaryTreeNode<E> root;

    protected static class BinaryTreeNode<E> extends Node<E> {

        BinaryTreeNode<E> right = null;
        BinaryTreeNode<E> left = null;

        public BinaryTreeNode<E> getRight() {
            return right;
        }

        public void setRight(BinaryTreeNode<E> right) {
            this.right = right;
        }

        public BinaryTreeNode<E> getLeft() {
            return left;
        }

        public void setLeft(BinaryTreeNode<E> left) {
            this.left = left;
        }

        public BinaryTreeNode(E data) {
            super(data);
            this.parent = null;
        }
    }

    public void insert(E data) {
        if (root == null) {
            root = new BinaryTreeNode<E>(data);
        } else {
            insert(data, root);
        }
    }

    public void insert(E data, BinaryTreeNode<E> parent) {
        BinaryTreeNode<E> node = new BinaryTreeNode<>(data);
        insert(node, parent);
    }

    private void insert(BinaryTreeNode<E> node, BinaryTreeNode<E> parent) {
        if (parent.getLeft() == null) {
            node.setParent(parent);
            parent.setLeft((BinaryTreeNode<E>) node);
        } else if (parent.getRight() == null) {
            node.setParent(parent);
            parent.setRight((BinaryTreeNode<E>) node);
        } else {
            insert(node, parent.getLeft());
        }
    }

    public E remove(Node<E> node) {
        if (node instanceof BinaryTreeNode) {
            BinaryTreeNode<E> btn = (BinaryTreeNode<E>)node;

            Node<E> parent = btn.getParent();
            btn.setParent(null);
            BinaryTreeNode<E> left = btn.getLeft();
            insert(left, (BinaryTreeNode<E>) parent);
            BinaryTreeNode<E> right = btn.getRight();
            insert(right, left);
        }

        return node.getValue();
    }

    public List<E> children(Node<E> n) {
        return null;
    }


    public E parent(Node<E> n) {
        return null;
    }

    public void traverse() {

    }

    public int height() {
        return 0;
    }

    public int depth() {
        return 0;
    }
}
