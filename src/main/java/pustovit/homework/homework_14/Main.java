package pustovit.homework.homework_14;

import pustovit.homework.homework_14.interfaceFunctional.FiveDigitFunction;

import java.util.Arrays;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Predicate<Double> doublePredicate = (salary) -> salary > 1500.0;
        System.out.println(doublePredicate.test(1600.0));

        // Программа для преобразования строки в массив символов
        Consumer<String> stringConsumer = (str) -> {
            char[] chars = str.toCharArray();
            System.out.print(Arrays.toString(chars));
        };
        stringConsumer.accept("IHOR");

        Function<Integer, String> integerStringFunction = (intA) -> {
            String s;
            if (intA == 1) {
                s = "one";
                return s;
            } else if (intA == 2) {
                s = "two";
                return s;
            } else if (intA == 3) {
                s = "three";
                return s;
            } else if (intA == 4) {
                s = "four";
                return s;

            } else if (intA == 5) {
                s = "five";
                return s;

            } else if (intA == 6) {
                s = "six";
                return s;

            } else if (intA == 7) {
                s = "seven";
                return s;

            } else if (intA == 8) {
                s = "eight";
                return s;

            } else if (intA == 9) {
                s = "nine";
                return s;

            } else if (intA == 10) {
                s = "ten";
                return s;

            } else {
                System.out.println("unknown");
            }

            return intA.toString();
        };
        System.out.println("\n" + integerStringFunction.apply(6));

        Supplier<Double> integerSupplier = () -> Math.random();
        Supplier<Object> objectSupplier = () -> new Object();

        System.out.println(integerSupplier.get());
        objectSupplier.get();

        BiFunction<Double, Integer, String> doubleIntegerStringBiFunction = (doubleA, intA) -> {
            String s = "";
            double result = doubleA - intA;
            if (result < 1 | result == 0) {
                s = "you have less than 1 !";
                System.out.println(s);
                return s;
            } else if (result > 1) {
                System.out.println("You have result : " + (float) result);
            }
            return s;
        };
        doubleIntegerStringBiFunction.apply(2019.2, 201);

        FiveDigitFunction<Double, Integer, Float, Long, String> digitFunction = (aDouble, integer, aFloat, aLong) -> {
            String s = "";
            float result = (float) (aDouble + integer + aFloat + aLong);
            if (result > 1000) {
                s = "your result > 1000";
                System.out.println("Your result is " + result + " & " + s);
                return s;
            } else if (result < 1000) {
                s = "your result < 1000";
                System.out.println("Your result is " + result + " & " + s);
                return s;
            }
            return s;
        };
        digitFunction.summarize(200.2, 200, (float) 101.1, 100L);

        ToDoubleFunction<Float> doubleFunction = (valueFloat) -> valueFloat + 2.2;
        System.out.println();
        System.out.println(doubleFunction.applyAsDouble((float) 11.2));


    }
}
