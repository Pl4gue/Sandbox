package test.java;

import main.java.Quicksort;
import org.junit.Test;

/**
 * Project "SortingAlgorithms"
 * "QuicksortTest.java" created by David Wu on Sun,09.07.17.
 */

public class QuicksortTest extends SortTest{
    @Test
    public void test() {
        Quicksort tester = new Quicksort();
        super.test(tester);
    }
}

/**
 * End of QuicksortTest.java
 */