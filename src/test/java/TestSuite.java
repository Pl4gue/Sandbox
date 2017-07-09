package test.java;

import org.junit.Assert;
import org.junit.Test;

/**
 * Project "SortingAlgorithms"
 * "TestSuite.java" created by David Wu on Thu,29.06.17.
 */

class Test1 {
    @Test
    public void test1() {
        MyClass tester = new MyClass();
        Assert.assertEquals("10*5 must be 50",50,tester.multiply(10,5));
    }
}

class MyClass {
    public int multiply(int i, int j) {
        return i *j;
    }
}

/**
 * End of TestSuite.java
 */