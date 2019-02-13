package edu.isu.cs.lectureX;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author Isaac Griffith
 */
public class FileTree {

    Node<String> current;
    Node<String> root; // home

    public FileTree(String rootName) {
        root = new Node<>(rootName);
        current = root;
    }

    public void up() {
        // FIXME what if current is root?
        current = current.getParent();
    }

    public void down(String value) {
        Node<String> next = findChild(value);
        if (next != null)
            current = next;
        // FIXME return error
    }

    private Node<String> findChild(String value) {
        for (Node<String> n : current.getChildren()) {
            if (n.getValue().equalsIgnoreCase(value)) {
                return n;
            }
        }

        return null;
    }

    public void goHome() {
        current = root;
    }

    public List<String> children() {
        List<String> temp = Lists.newArrayList();
        for (Node<String> n : current.getChildren()) {
            temp.add(n.getValue());
        }
        return temp;
    }

    public String locPath() {
        return recPath(current);
    }

    private String recPath(Node<String> prev) {
        if (prev.getParent() == null)
            return prev.getValue();
        else {
            return recPath(prev.getParent()) + "/" + prev.getValue();
        }
    }

    /**
     * Insert a new file
     */
    public void touch(String name) {
        Node<String> newFile = new Node<>(name);
        if (current == null)
            current = root = newFile;
        else
            current.addChild(newFile);
    }

    public void delete(String name) {
        Node<String> toRemove = findChild(name);

        if (toRemove != null)
            current.removeChild(toRemove);
    }

}
