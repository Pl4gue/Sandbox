package SortingAlgorithms.test.java;

import SortingAlgorithms.main.java.Sort;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Project "SortingAlgorithms"
 * "SortTest.java" created by David Wu on Sun,09.07.17.
 */

public class SortTest {
    static void test(Sort sortingAlgo) {
        AtomicReference<ArrayList<Integer>> list = new AtomicReference<>(new ArrayList<>());
        for(int i=0;i<10000;i++) {
            list.get().add((int)(Math.random()*1000));
        }
        ArrayList<String> expected = (ArrayList<String>) list.get().clone();
        Collections.sort(expected);
        sortingAlgo.sort(list.get());
        list.get().stream().forEach(integer -> System.out.println(integer));
        Assert.assertEquals(expected, list.get());
    }
}

/**
 * End of SortTest.java
 */