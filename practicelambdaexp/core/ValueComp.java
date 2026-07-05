package com.frozen.practicelambdaexp.core;

@FunctionalInterface
public interface ValueComp<T>{
    String compar(T t,T v);
}
