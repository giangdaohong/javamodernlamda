package com.demo.functional;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class F003 {
    public static void main(String[] args) {
        // Creating predicate
        Predicate<Integer> lesserthan = i -> (i < 18);

        // Calling Predicate method
        System.out.println(lesserthan.test(10));


        Predicate<Integer> greaterThanTen = (i) -> i > 10;

        // Creating predicate
        Predicate<Integer> lowerThanTwenty = (i) -> i < 20;
        boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
        System.out.println(result);

        // Calling Predicate method
        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
        System.out.println(result2);

        // This function returns a random value.
        Supplier<Double> randomValue = () -> Math.random();

        // Print the random value using get()
        System.out.println(randomValue.get());
    }
}
