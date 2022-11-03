package com.jad.nfstree;

class Node<E extends Comparable> {
    private final E data;
    private Node<E> left;
    private Node<E> right;

    public Node(final E data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public Node(final E data, final Node<E> left, final Node<E> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Node<E> getChild(int leftOrRight) {
        return (leftOrRight < 0) ? this.getLeft(): this.getRight();
    }

    public void setChild(int leftOrRight, Node<E> value) {
        if (leftOrRight < 0) {
            this.setLeft(value);
        } else {
            this.setRight(value);
        }
    }

    public Node<E> getLeft() {
        return left;
    }

    public void setLeft(final Node<E> left) {
        this.left = left;
    }

    public Node<E> getRight() {
        return right;
    }

    public void setRight(final Node<E> right) {
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

    public void add(E value) {
        int compareResult = this.getData().compareTo(value);
        if (compareResult != 0) {
            if (this.getChild(compareResult) == null) {
                this.setChild(compareResult, new Node<>(value));
            } else {
                this.getChild(compareResult).add(value);
            }
        }
    }

    public int getHeight() {
        return 0;
    }

    public int countNodes() {
        return 0;
    }
}
