package SortingAlgorithms.test.java;

import SortingAlgorithms.main.java.HeapSort;
import org.junit.Test;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class HeapSortTest extends SortTest{
    HeapSort tester=new HeapSort();
    AtomicReference<java.util.ArrayList<Integer>> list;
    ArrayList<Integer> expected;

    @Test
    public void test() {
        super.test(tester);
    }
}
