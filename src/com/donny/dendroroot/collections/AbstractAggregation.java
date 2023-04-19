package com.donny.dendroroot.collections;

import java.util.HashMap;

public abstract class AbstractAggregation<T, N> extends HashMap<T, N> {
    public final N DEFAULT_VALUE;

    public AbstractAggregation(N defaultValue) {
        DEFAULT_VALUE = defaultValue;
    }

    public abstract boolean add(T key, N val);

    @Override
    public N get(Object key) {
        return getOrDefault(key, DEFAULT_VALUE);
    }
}
