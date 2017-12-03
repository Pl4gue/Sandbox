package SortingAlgorithms.test.java;

import SortingAlgorithms.main.java.Sort;
import javafx.util.Pair;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Project "SortingAlgorithms"
 * "SortTest.java" created by David Wu on Sun,09.07.17.
 */

public class SortTest {
    static void test(Sort sortingAlgo) {
        AtomicReference<ArrayList<Integer>> list = new AtomicReference<>(new ArrayList<>());
        for(int i=0;i<1000;i++) {
            list.get().add((int)(Math.random()*300));
        }
        ArrayList<Integer> expected = (ArrayList<Integer>) list.get().clone();
        Collections.sort(expected);
        sortingAlgo.sort(list.get());
        list.get().forEach(System.out::println);
        Assert.assertEquals(expected, list.get());
    }

    public static Pair gen() {
        AtomicReference<ArrayList<Integer>> list = new AtomicReference<>(new ArrayList<>());
        for(int i=0;i<1000;i++) {
            list.get().add((int)(Math.random()*300));
        }
        ArrayList<Integer> expected = (ArrayList<Integer>) list.get().clone();
        Collections.sort(expected);
        return new Pair(list, expected);
    }

    static void test(Sort sortingAlgo,AtomicReference<ArrayList<Integer>> list,ArrayList<Integer> expected) {
        sortingAlgo.sort(list.get());
        //list.get().forEach(System.out::println);
        Assert.assertEquals(expected, list.get());
    }
}

/**
 * End of SortTest.java
 */