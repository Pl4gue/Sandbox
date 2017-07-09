package main.java;

import java.util.ArrayList;

/**
 * Project "SortingAlgorithms"
 * "Sort.java" created by David Wu on Sun,09.07.17.
 */

public abstract class Sort {

    static void swap(ArrayList<Integer> list, int l, int r) {
        int lt = list.get(l);
        int rt = list.get(r);
        list.set(l, rt);
        list.set(r, lt);
    }

    public abstract void sort(ArrayList<Integer> list);
}

/**
 * End of Sort.java
 */