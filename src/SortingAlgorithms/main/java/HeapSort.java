package SortingAlgorithms.main.java;

import java.util.ArrayList;

public class HeapSort extends Sort {

    @Override
    public void sort(ArrayList<Integer> list) {
        build_maxheap(list,list.size());
        int heapsize = list.size();
        while (heapsize > 1) {
            heapsize--;
            swap(list, heapsize, 0);
            max_heapify(list,0,heapsize);
        }
    }

    private void build_maxheap(ArrayList<Integer> list,int n) {
        for(int i=n/2-1;i>=0;i--) {
            max_heapify(list, i, n);
        }
    }

    private void max_heapify(ArrayList<Integer> list, int i, int n) {
        int largest = i;
        int l = 2 * largest + 1;
        int r = 2 * largest + 2;

        if (l < n && list.get(l) > list.get(largest)) {
            largest = l;
        }

        if (r < n && list.get(r) > list.get(largest)) {
            largest = r;
        }

        if (largest != i) {
            swap(list, largest, i);
            max_heapify(list, largest, n);
        }
    }
}
