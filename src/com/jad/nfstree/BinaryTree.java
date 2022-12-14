package com.jad.nfstree;

public class BinaryTree<E extends Comparable> {
    private Node<E> root;

    public BinaryTree() {
        this.root = null;
    }

    public Node<E> getRoot() {
        return root;
    }

    public void add(E value) {
        if (this.root == null) {
            this.root = new Node<>(value);
        } else {
            this.root.add(value);
        }
    }

    @Override
    public String toString() {
        if (this.root == null) {
            return "";
        } else {
            return this.root.toString();
        }
    }

    public int getHeight() {
        if (this.root == null) {
            return 0;
        } else {
            return this.root.getHeight();
        }
    }

    public int count() {
        if (this.root == null) {
            return 0;
        } else {
            return this.root.count();
        }
    }

}
