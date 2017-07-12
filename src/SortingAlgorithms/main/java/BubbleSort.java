package SortingAlgorithms.main.java;

import java.util.ArrayList;

/**
 * Project "SortingAlgorithms"
 * "BubbleSort.java" created by David Wu on Sun,09.07.17.
 */

public class BubbleSort extends Sort {
    @Override
    public void sort(ArrayList<Integer> list) {
        int sorted = 0;
        while (sorted != list.size() - 1) {
            for (int i = list.size() - 1; i > sorted; i--) {
                if (list.get(i) < list.get(i - 1)) {
                    swap(list, i, i - 1);
                }
            }
            sorted++;
        }
    }
}

/**
 * End of BubbleSort.java
 */