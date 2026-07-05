package com.frozen.practicelambdaexp;



import com.frozen.practicelambdaexp.core.*;

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

        IntPredicate intPredicate = (num) -> num > 0;
        System.out.println(intPredicate.test(5));

        System.out.println("---------------custom functional interface-----------------");

        ConditionalExecutor conditionalExecutor =(boolean condition) -> condition;
        System.out.println(conditionalExecutor.execute(true));
        System.out.println(conditionalExecutor.execute(false));
        boolean condition = true;
        if(condition!=true)
        {
            System.out.println("Condition is true");
        }
                else
        {
            System.out.println("Condition is false");
        }
                Employee employee = (id, name) -> System.out.println("Employee ID: " + id + ", Name: " + name);
        employee.employeeDetails(1, "John");

        Laptop laptop = (brand, price) -> System.out.println("Brand: " + brand + ", Price: " + price);
        laptop.laptopDetails("Dell", 800.0);

        StringProcessor stringProcessor = (str) -> System.out.println("<" + str + ">");
        stringProcessor.processString("xworkzz");

        NumberValidatore numberValidatore = (num) -> System.out.println("Number " + num + " is " + (num > 0 ? "valid" : "invalid"));
        numberValidatore.validateNumber(10);
        numberValidatore.validateNumber(-5);

        ValueComparator<Integer > valueComparator = (a, b) -> a - b;
        System.out.println("Comparison: " + valueComparator.compare(10, 5));

        TriConsumer<Integer , String , Boolean> triConsumer = (a, b, c) -> System.out.println(a + " " + b + " " + c);
triConsumer.accept(10, "xworkzz", true);

        Transformer<Integer> transformer=(num)->num+5;
        System.out.println(transformer.transform(5));

        LazyInitializer<String> lazyInitializer = () -> "xworkzz";
        System.out.println(lazyInitializer.initialize());

        FallbackSupplier<String> fallbackSupplier = (fallback) -> fallback;
        System.out.println(fallbackSupplier.get("xworkzz"));

        ValueComp<String > v1=(x,y)-> x+y;
        System.out.println(v1.compar("xworkzz", "kodnext"));

        ValueComp<String > v2=(x,y)-> String.valueOf(x.length()-y.length());
        System.out.println(v2.compar("xworkzz", "xnotworkz"));

        StringToInt stringToInt = (str) -> Integer.parseInt(str);
        System.out.println(stringToInt.convert("123"));

        IntToString intToString = (num) -> String.valueOf(num);
        System.out.println(intToString.convert(456));

        DoubleToBoolean doubleToBoolean = (value) -> value > 0;
        System.out.println(doubleToBoolean.check(5.5));

        BooleanToInt booleanToInt = (value) -> value ? 1 : 0;
        System.out.println(booleanToInt.convert(true));

        StringToDouble stringToDouble = (str) -> Double.parseDouble(str);
        System.out.println(stringToDouble.convert("3.14"));

        TwoIntSum twoIntSum = (a, b) -> a + b;
        System.out.println(twoIntSum.sum(10, 20));

        StringLengthChecker stringLengthChecker = (str, minLength) -> str.length() >= minLength;
        System.out.println(stringLengthChecker.checkLength("Hello", 3));

        IntSquare intSquare = (num) -> num * num;
        System.out.println(intSquare.square(5));

        StringConcat stringConcat = (str1, str2) -> str1 + str2;
        System.out.println(stringConcat.concat("Hello", "World"));

        IntToBoolean intToBoolean = (num) -> num > 0;
        System.out.println(intToBoolean.check(10));

        DoubleToInt doubleToInt = (value) -> (int) value;
        System.out.println(doubleToInt.convert(5.7));

        StringToBoolean stringToBoolean = (str) -> !str.isEmpty();
        System.out.println(stringToBoolean.check(""));

        ThreeIntSum threeIntSum = (a, b, c) -> a + b + c;
        System.out.println(threeIntSum.sum(1, 2, 3));

        StringToUpper stringToUpper = (str) -> str.toUpperCase();
        System.out.println(stringToUpper.toUpper("hello"));

        IntCube intCube = (num) -> num * num * num;
        System.out.println(intCube.cube(3));

        TwoStringCompare twoStringCompare = (str1, str2) -> str1.equals(str2);
        System.out.println(twoStringCompare.compare("hello", "hello"));

        IntAbsolute intAbsolute = (num) -> num < 0 ? -num : num;
        System.out.println(intAbsolute.absolute(-10));

        StringReverse stringReverse = (str) -> new StringBuilder(str).reverse().toString();
        System.out.println(stringReverse.reverse("hello"));

        DoubleSquare doubleSquare = (value) -> value * value;
        System.out.println(doubleSquare.square(2.5));

        IntToStringLength intToStringLength = (num) -> String.valueOf(num).length();
        System.out.println(intToStringLength.getLength(12345));

        IntDoubler intDoubler = (num) -> num * 2;
        System.out.println(intDoubler.doubleValue(5));

        StringPrefix stringPrefix = (str, prefix) -> prefix + str;
        System.out.println(stringPrefix.addPrefix("world", "hello "));

        IntHalver intHalver = (num) -> num / 2;
        System.out.println(intHalver.halve(10));

        StringSuffix stringSuffix = (str, suffix) -> str + suffix;
        System.out.println(stringSuffix.addSuffix("hello", " world"));

        IntIncrement intIncrement = (num) -> num + 1;
        System.out.println(intIncrement.increment(5));

        StringFirstChar stringFirstChar = (str) -> str.charAt(0);
        System.out.println(stringFirstChar.getFirstChar("hello"));

        IntDecrement intDecrement = (num) -> num - 1;
        System.out.println(intDecrement.decrement(10));

        StringLastChar stringLastChar = (str) -> str.charAt(str.length() - 1);
        System.out.println(stringLastChar.getLastChar("hello"));

        IntNegate intNegate = (num) -> -num;
        System.out.println(intNegate.negate(5));

        StringLength stringLength = (str) -> str.length();
        System.out.println(stringLength.getLength("hello"));

        IntTriple intTriple = (num) -> num * 3;
        System.out.println(intTriple.triple(4));

        StringTrim stringTrim = (str) -> str.trim();
        System.out.println(stringTrim.trim("  hello  "));

        IntQuadruple intQuadruple = (num) -> num * 4;
        System.out.println(intQuadruple.quadruple(3));

        StringReplace stringReplace = (str, oldChar, newChar) -> str.replace(oldChar, newChar);
        System.out.println(stringReplace.replace("hello", "l", "x"));

        IntModulo intModulo = (a, b) -> a % b;
        System.out.println(intModulo.modulo(10, 3));



    }

}
