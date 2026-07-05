package com.frozen.practicelambdaexp.core;

@FunctionalInterface
public interface StringReplace {
    String replace(String str, String oldChar, String newChar);
}
