package SortingAlgorithms.test.java;

import SortingAlgorithms.main.java.TimSort;
import org.junit.Test;

public class TimSortTest extends SortTest{

    @Test
    public void test() {
        TimSort tester = new TimSort();
        super.test(tester);
    }
}
