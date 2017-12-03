package SortingAlgorithms.main.java;

import java.util.ArrayList;

public class TimSort extends Sort {
    final int runsize = 32;

    @Override
    public void sort(ArrayList<Integer> list) {
        int n = list.size();
        for(int i=0;i<n;i+=runsize) {
            insertionSort(list, i, Math.min(i+(runsize-1),(n-1)));
        }

        for(int size=runsize;size<n;size*=2) {

        }
    }

    private void insertionSort(ArrayList<Integer> list, int left, int right) {
        for (int i = left + 1; i < right; ++i) {
            int key = list.get(i);
            int j = i - 1;
            while (j >= left && list.get(j) > key) {
                int t = list.get(j);
                list.set(j + 1, t);
                j--;
            }
            list.set(j + 1, key);
        }
    }

    private void merge(ArrayList<Integer> list, int left, int middle, int right) {
        int len1 = middle - left + 1, len2 = right - middle;
        int[] leftfield = new int[len1], rightfield = new int[len2];

        for (int i = 0; i < len1; i++) {
            leftfield[i] = list.get(left + i);
        }
        for (int i = 0; i < len2; i++) {
            rightfield[i] = list.get(middle + 1 + i);
        }

        int i = 0, j = 0, k = left;

        while (i < len1 && j < len2) {
            if (leftfield[i] <= rightfield[j]) {
                list.set(k, leftfield[i]);
                i++;
            } else {
                list.set(k, rightfield[i]);
                j++;
            }
            k++;
        }

        while (i < len1) {
            list.set(k, leftfield[i]);
            k++;
            i++;
        }
        while (j < len2) {
            list.set(k, rightfield[j]);
            k++;
            j++;
        }
    }

}
