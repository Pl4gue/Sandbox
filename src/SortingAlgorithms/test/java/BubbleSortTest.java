package SortingAlgorithms.test.java;

import SortingAlgorithms.main.java.BubbleSort;
import org.junit.Test;

/**
 * Project "SortingAlgorithms"
 * "BubbleSortTest.java" created by David Wu on Thu,29.06.17.
 */

public class BubbleSortTest extends SortTest{
    @Test
    public void test() {
        BubbleSort tester=new BubbleSort();
        super.test(tester);
    }
}

/**
 * End of BubbleSortTest.java
 */