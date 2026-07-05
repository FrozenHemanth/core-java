package com.frozen.practicelambdaexp.core;

@FunctionalInterface
public interface ConditionalExecutor {
    boolean execute(boolean condition);
}
