package com.jad.nfstree;

public class Node<E> {
    private final E data;
    private Node left;
    private Node right;

    public Node(final E data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public Node(final E data, final Node left, final Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(final Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(final Node right) {
        this.right = right;
    }

    public E getData() {
        return data;
    }

    @Override
    public String toString() {
        return this.data.toString() + "(" +
                ((this.getLeft() != null)?this.getLeft().toString():"-") + ", " +
                ((this.getRight() != null)?this.getRight().toString():"-") + ")";
    }

    public int getHeight() {
        return 0;
    }

    public int countNodes() {
        return 0;
    }
}
