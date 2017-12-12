package LK.CustomList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.ArrayList;

class CustomListTest {

    void genInt(CustomList<Integer> list, ArrayList<Integer> tocompare) {
        for (int i = 0; i < 1000; i++) {
            int t = (int) (Math.random() * 2556);
            list.add(t);
            tocompare.add(t);
        }
    }

    void genString(CustomList<String> list, ArrayList<String> tocompare) {
        for (int i = 0; i < 1000; i++) {
            String t = String.valueOf(BigInteger.valueOf((long) Math.random()).multiply(new BigInteger("19287987941093874293")));
            list.add(t);
            tocompare.add(t);
        }
    }


    @Test
    public void test() {
        testIntList();
        testStringList();
    }

    void testIntList() {
        CustomList<Integer> listInt = new CustomList<>();
        ArrayList<Integer> tocompareInt = new ArrayList<>();
        genInt(listInt,tocompareInt);
        Assert.assertEquals(size(tocompareInt),listInt.size());
        Assert.assertEquals(contains(tocompareInt,8),listInt.contains(8));
        Assert.assertEquals(listInt.toString(), tocompareInt.toString());
    }

    void testStringList() {
        CustomList<String> listString = new CustomList<>();
        ArrayList<String> tocompareString = new ArrayList<>();
        genString(listString, tocompareString);
        Assert.assertEquals(size(tocompareString),listString.size());
        Assert.assertEquals(contains(tocompareString,8),listString.contains(8));
        Assert.assertEquals(tocompareString.toString(),listString.toString());
    }

    int size(ArrayList c) {
        return c.size();
    }

    boolean contains(ArrayList c, Object o) {
        return c.contains(o);
    }


}