package com.donny.dendroroot.collections;

import java.math.BigDecimal;

public class DecimalAggregation<T> extends AbstractAggregation<T, BigDecimal> {
    public DecimalAggregation() {
        super(BigDecimal.ZERO);
    }

    @Override
    public boolean add(T key, BigDecimal val) {
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
