package SortingAlgorithms.main.java;

import java.util.ArrayList;

/**
 * Project "Sandbox"
 * "Iterative_QuickSort.java" created by David Wu on Sat,23.09.17.
 */

public class Iterative_QuickSort extends Sort{

    @Override
    public void sort(ArrayList<Integer> list) {
        quicksort(list,0,list.size()-1);
    }

    private void quicksort(ArrayList<Integer> list, int l, int r) {
    }

}

/**
 * End of Iterative_QuickSort.java
 */