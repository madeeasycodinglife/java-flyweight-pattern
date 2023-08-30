package com.madeeasy;

import com.madeeasy.impl.TreeType;

public class Main {
    public static void main(String[] args) {
        TreeFactory treeFactory = new TreeFactory();

        TreeType oakTree = treeFactory.getTreeType("Oak", "Green");
        TreeType pineTree = treeFactory.getTreeType("Pine", "Brown");

        oakTree.display(10, 20);
        pineTree.display(30, 40);
    }
}