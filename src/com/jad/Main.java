package com.jad;

import com.jad.nfslist.List;
import com.jad.nfstree.BinaryTree;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        List<Character> myList = new List<>();
        myList.add('A');
        myList.add('B');
        myList.add('C');
        System.out.println(myList);
        myList.push('I');
        System.out.println(myList);
        System.out.println(myList.pop()); // -> I
        System.out.println(myList);
        System.out.println(myList.count());

        BinaryTree<Integer> myTree = new BinaryTree();
        myTree.add(50);
        myTree.add(25);
        myTree.add(53);
        myTree.add(13);
        myTree.add(27);
        myTree.add(27);
        myTree.add(27);
        myTree.add(27);
        myTree.add(26);
        myTree.add(51);
        System.out.println(myTree);

        BinaryTree<String> t2 = new BinaryTree<>();
        t2.add("BEBE");
        t2.add("A");
        t2.add("C");
        System.out.println(t2);
    }
}