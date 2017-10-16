package SortingAlgorithms.main.java;

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


    static int partition(ArrayList<Integer> list, int l, int r) {
        int midIndex = (r - l) / 2 + l;
        int pivot = list.get(midIndex);
        int pIndex = l; //pIndex starts at left bound
        for (int i = l; i < r; i ++) {
            if (list.get(i) <= pivot) { //if there is element right of pIndex
                swap(list,pIndex,i);
                pIndex++;
            }
        }
        swap(list,pIndex,midIndex);
        return pIndex;
    }

    public abstract void sort(ArrayList<Integer> list);
}

/**
 * End of Sort.java
 */
