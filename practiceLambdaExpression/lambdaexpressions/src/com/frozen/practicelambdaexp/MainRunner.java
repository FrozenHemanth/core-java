package com.frozen.practicelambdaexp;

import java.lang.reflect.Constructor;
import java.util.function.*;

public class MainRunner {
    public static void main(String[] args) {

        Supplier<Integer> supplier = () -> 10;
        System.out.println(supplier.get());

        Consumer<Integer> consumer = (num) -> System.out.println(num);
        consumer.accept(5);

        Runnable runnable = () -> System.out.println("Hello");
        runnable.run();

        Function<Integer, Integer> function = (num) -> num * 3;
        System.out.println(function.apply(7));

        IntPredicate  predicate = (num) -> num > 0;
        System.out.println(predicate.test(5));

        IntConsumer consumerr = (num) -> System.out.println(num);
        consumerr.accept(5);

        IntSupplier supplierr = () -> 5;
        System.out.println(supplierr.getAsInt());

        IntFunction<Integer> functionn = (num) -> num * 3;
        System.out.println(functionn.apply(7));

        IntUnaryOperator operator = (num) -> num * 3;
        System.out.println(operator.applyAsInt(7));

        BinaryOperator<Long> binaryOperator = (num1, num2) -> num1 + num2;
        System.out.println(binaryOperator.apply(5L, 10L));

        BiConsumer<String, Integer> biConsumer = (name, age) -> System.out.println(name + " is " + age);
        biConsumer.accept("John", 25);

        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a > b;
        System.out.println(biPredicate.test(10, 5));

        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;
        System.out.println(biFunction.apply(5, 3));

        Predicate<String> predicate1 = (str) -> str.length() > 5;
        System.out.println(predicate1.test("Hello"));

        UnaryOperator<Integer> unaryOperator = (num) -> num * 2;
        System.out.println(unaryOperator.apply(5));

        LongSupplier longSupplier = () -> 100L;
        System.out.println(longSupplier.getAsLong());

        DoubleSupplier doubleSupplier = () -> 3.14;
        System.out.println(doubleSupplier.getAsDouble());

        BooleanSupplier booleanSupplier = () -> true;
        System.out.println(booleanSupplier.getAsBoolean());

        LongConsumer longConsumer = (num) -> System.out.println("Long: " + num);
        longConsumer.accept(100L);

        DoubleConsumer doubleConsumer = (num) -> System.out.println("Double: " + num);
        doubleConsumer.accept(3.14);

        LongPredicate longPredicate = (num) -> num > 0;
        System.out.println(longPredicate.test(100L));

        DoublePredicate doublePredicate = (num) -> num > 0.0;
        System.out.println(doublePredicate.test(3.14));

        LongFunction<String> longFunction = (num) -> "Value: " + num;
        System.out.println(longFunction.apply(100L));

        DoubleFunction<String> doubleFunction = (num) -> "Value: " + num;
        System.out.println(doubleFunction.apply(3.14));

        IntToLongFunction intToLongFunction = (num) -> (long) num * 2;
        System.out.println(intToLongFunction.applyAsLong(5));

        IntToDoubleFunction intToDoubleFunction = (num) -> num * 2.5;
        System.out.println(intToDoubleFunction.applyAsDouble(4));

        LongToIntFunction longToIntFunction = (num) -> (int) num;
        System.out.println(longToIntFunction.applyAsInt(100L));

        LongToDoubleFunction longToDoubleFunction = (num) -> num / 2.0;
        System.out.println(longToDoubleFunction.applyAsDouble(100L));

        DoubleToIntFunction doubleToIntFunction = (num) -> (int) num;
        System.out.println(doubleToIntFunction.applyAsInt(3.14));

        DoubleToLongFunction doubleToLongFunction = (num) -> (long) num;
        System.out.println(doubleToLongFunction.applyAsLong(3.14));

        LongUnaryOperator longUnaryOperator = (num) -> num * 2;
        System.out.println(longUnaryOperator.applyAsLong(5L));

        DoubleUnaryOperator doubleUnaryOperator = (num) -> num * 2.0;
        System.out.println(doubleUnaryOperator.applyAsDouble(2.5));

        IntBinaryOperator intBinaryOperator = (a, b) -> a + b;
        System.out.println(intBinaryOperator.applyAsInt(5, 3));

        LongBinaryOperator longBinaryOperator = (a, b) -> a + b;
        System.out.println(longBinaryOperator.applyAsLong(5L, 3L));

        DoubleBinaryOperator doubleBinaryOperator = (a, b) -> a + b;
        System.out.println(doubleBinaryOperator.applyAsDouble(2.5, 3.5));

        ToIntFunction<String> toIntFunction = (str) -> str.length();
        System.out.println(toIntFunction.applyAsInt("Hello"));

        ToLongFunction<String> toLongFunction = (str) -> (long) str.length();
        System.out.println(toLongFunction.applyAsLong("Hello"));

        ToDoubleFunction<String> toDoubleFunction = (str) -> (double) str.length();
        System.out.println(toDoubleFunction.applyAsDouble("Hello"));

        ToIntBiFunction<String, String> toIntBiFunction = (s1, s2) -> s1.length() + s2.length();
        System.out.println(toIntBiFunction.applyAsInt("Hello", "World"));

        ToLongBiFunction<String, String> toLongBiFunction = (s1, s2) -> (long) (s1.length() + s2.length());
        System.out.println(toLongBiFunction.applyAsLong("Hello", "World"));

        ToDoubleBiFunction<String, String> toDoubleBiFunction = (s1, s2) -> (double) (s1.length() + s2.length());
        System.out.println(toDoubleBiFunction.applyAsDouble("Hel", "World"));

        ObjIntConsumer<String> objIntConsumer = (str, num) -> System.out.println(str + ": " + num);
        objIntConsumer.accept("Count", 5);

        ObjLongConsumer<String> objLongConsumer = (str, num) -> System.out.println(str + ": " + num);
        objLongConsumer.accept("Count", 100L);

        ObjDoubleConsumer<String> objDoubleConsumer = (str, num) -> System.out.println(str + ": " + num);
        objDoubleConsumer.accept("Value", 3.14);


    }

}
