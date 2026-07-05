package com.frozen.practicelambdaexp.core;

@FunctionalInterface
public interface Transformer<T> {
    int transform(T t);
}
