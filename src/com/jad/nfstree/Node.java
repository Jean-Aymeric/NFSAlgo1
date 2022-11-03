package com.jad.nfstree;

public class Node<E extends Comparable> {
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
        int compareResult = value.compareTo(this.getData());
        if (compareResult != 0) {
            if (this.getChild(compareResult) == null) {
                this.setChild(compareResult, new Node<>(value));
            } else {
                this.getChild(compareResult).add(value);
            }
        }
    }

    public int getHeight() {
        int heightLeft = (this.getLeft() == null) ? 0 : this.getLeft().getHeight();
        int heightRight = (this.getRight() == null) ? 0 : this.getRight().getHeight();
        return 1 + Math.max(heightLeft, heightRight);
    }

    public int count() {
        int countLeft = (this.getLeft() == null) ? 0 : this.getLeft().count();
        int countRight = (this.getRight() == null) ? 0 : this.getRight().count();
        return 1 + countLeft + countRight;
    }

    public int getBalanceFactor() {
        return ((this.right != null) ? this.right.getHeight() : 0) - ((this.left != null) ? this.left.getHeight() : 0);
    }

    public boolean isEquilibrate() {
        boolean leftNodeEquilibrate = this.getLeft() == null || this.getLeft().isEquilibrate();
        boolean rightNodeEquilibrate = this.getRight() == null || this.getRight().isEquilibrate();
        return (Math.abs(this.getBalanceFactor()) <= 1) && leftNodeEquilibrate && rightNodeEquilibrate;
    }

    public String toStringWithBalanceFactor() {
        return this.data.toString() + "[" + this.getBalanceFactor() + "] (" +
                ((this.getLeft() != null)?this.getLeft().toStringWithBalanceFactor():"-") + ", " +
                ((this.getRight() != null)?this.getRight().toStringWithBalanceFactor():"-") + ")";
    }

    public String toJson() {
        String result;
        result = "{\"\"data\": " + this.data + ",";
        if (this.getLeft() != null) {
            result += " \"left\": " + this.getLeft().toJson();
        }
        if (this.getRight() != null) {
            result += " \"right\": " + this.getRight().toJson();
        }
        result += "},";
        return result;
    }
}
