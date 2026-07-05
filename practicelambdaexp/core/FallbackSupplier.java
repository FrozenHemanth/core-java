package com.frozen.practicelambdaexp.core;

@FunctionalInterface
public interface FallbackSupplier<T> {
    T get(T fallback);
}
