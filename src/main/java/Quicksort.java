package main.java;

import java.util.ArrayList;

/**
 * Project "SortingAlgorithms"
 * "Quicksort.java" created by David Wu on Sun,09.07.17.
 */

public class Quicksort extends Sort {
    private final static int LEFT = 1;
    private final static int RIGHT = 2;
    private static int turn = 0;

    @Override
    public void sort(ArrayList<Integer> list) {
        quicksort(list,0,list.size()-1);
    }


    private void quicksort(ArrayList<Integer> numbers,int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = numbers.get(low + (high - low) / 2);

        // Divide into two lists
        while (i <= j) {
            while (numbers.get(i)< pivot) {
                i++;
            }
            while (numbers.get(j) > pivot) {
                j--;
            }

            if (i <= j) {
                swap(numbers,i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quicksort(numbers,low, j);
        if (i < high)
            quicksort(numbers,i, high);
    }
}

/**
 * End of Quicksort.java
 */