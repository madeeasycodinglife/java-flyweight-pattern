package com.madeeasy;

import com.madeeasy.impl.TreeType;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private Map<String, TreeType> treeTypes = new HashMap<>();

    public TreeType getTreeType(String name, String color) {
        TreeType treeType = treeTypes.get(name);
        if (treeType == null) {
            treeType = new TreeType(name, color);
            treeTypes.put(name, treeType);
        }
        return treeType;
    }
}
