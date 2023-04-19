package com.donny.dendroroot.collections;

import java.math.BigInteger;

public class IntegerAggregation<T> extends AbstractAggregation<T, BigInteger> {
    public IntegerAggregation() {
        super(BigInteger.ZERO);
    }

    @Override
    public boolean add(T key, BigInteger val) {
        if (containsKey(key)) {
            put(key, val.add(get(key)));
            if (get(key).compareTo(DEFAULT_VALUE) == 0) {
                remove(key);
            }
            return true;
        } else {
            put(key, val);
            return false;
        }
    }
}
