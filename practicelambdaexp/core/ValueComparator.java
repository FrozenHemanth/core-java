package com.frozen.practicelambdaexp.core;

@FunctionalInterface
public interface ValueComparator<T> {
    int compare(T t1, T t2);
}
