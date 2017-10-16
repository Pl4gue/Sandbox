package net.egork.collections;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Project "Codeforces"
 * "ExtendedArrayList.java" created by David Wu on Wed,24.05.17.
 */

public class ExtendedArrayList<Integer> extends ArrayList<Integer> {
    private static long sum = 0;

    public ExtendedArrayList() {
        super();
    }

    public ExtendedArrayList(int initialCapacity) {
        super(initialCapacity);
    }

    public ExtendedArrayList(Collection<? extends Integer> c) {
        super(c);
        for (Integer i : (ArrayList<Integer>) super.clone()) {
            sum += Long.valueOf(String.valueOf(i));
        }
    }

    @Override
    public Integer set(int index, Integer element) {
        sum -= Long.valueOf(String.valueOf(super.get(index)));
        sum += Long.valueOf(String.valueOf(element));
        return super.set(index, element);
    }

    @Override
    public boolean add(Integer e) {
        sum += Long.valueOf(String.valueOf(e));
        return super.add(e);
    }

    @Override
    public Integer remove(int index) {
        sum += Long.valueOf(String.valueOf(super.get(index)));
        return super.remove(index);
    }

    @Override
    public boolean remove(Object o) {
        sum -= (Long) o;
        return super.remove(o);
    }

    public static long getSum() {
        return sum;
    }


}

/**
 * End of ExtendedArrayList.java
 */