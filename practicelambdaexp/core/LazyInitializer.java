package com.frozen.practicelambdaexp.core;

@FunctionalInterface
public interface LazyInitializer<T> {
    T initialize();
}
