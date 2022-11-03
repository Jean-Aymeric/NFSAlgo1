package com.jad.nfstree;
public class AVLTree<E extends Comparable> extends BinaryTree<E> {
    public boolean isEquilibrate() {
        if (this.getRoot() == null) {
            return true;
        } else {
            return this.getRoot().isEquilibrate();
        }
    }

    public String toStringWithBalanceFactor() {
        if (this.getRoot() == null) {
            return "";
        } else {
            return this.getRoot().toStringWithBalanceFactor();
        }
    }

    public String toJson() {
        if (this.getRoot() == null) {
            return "";
        } else {
            return this.getRoot().toJson();
        }
    }

    public Node findNodeByValue(E value) {
        return null;
    }

    public void rotate(Node nodeToRotate, SenseOfRotation senseOfRotation) {

    }
    public void rotate(E value, SenseOfRotation senseOfRotation) {
        this.rotate(findNodeByValue(value), senseOfRotation);
    }
}