package com.donny.dendroroot.collections;

public class LongAggregation<T> extends AbstractAggregation<T, Long> {
    public LongAggregation() {
        super(0L);
    }

    @Override
    public boolean add(T key, Long val) {
        if (containsKey(key)) {
            put(key, val+get(key));
            if (get(key).longValue() == DEFAULT_VALUE) {
                remove(key);
            }
            return true;
        } else {
            put(key, val);
            return false;
        }
    }
}
