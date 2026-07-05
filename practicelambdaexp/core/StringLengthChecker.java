package com.frozen.practicelambdaexp.core;

@FunctionalInterface
public interface StringLengthChecker {
    boolean checkLength(String str, int minLength);
}
