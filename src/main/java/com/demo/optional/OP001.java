package com.demo.optional;

import java.util.Optional;

public class OP001 {
    public static void main(String[] args) {

        // creating a string array
        String[] str = new String[5];

        // Setting value for 2nd index
        str[2] = "Geeks Classes are coming soon";

        // It returns a non-empty Optional
        Optional<String> value = Optional.of(str[2]);

        // It returns value of an Optional.
        // If value is not present, it throws
        // an NoSuchElementException
        System.out.println(value.get());

        // It returns hashCode of the value
        System.out.println(value.hashCode());

        // It returns true if value is present,
        // otherwise false
        System.out.println(value.isPresent());

        // create a Optional
        Optional<String> op2 = Optional.ofNullable(null);

        // print value
        System.out.println("Optional 2: " + op2);

        // create a Optional
        Optional<Integer> op = Optional.ofNullable(null);

        // print value
        System.out.println("Optional: " + op);

        // orElse value
        System.out.println("Value by orElse" + "(100) method: " + op.orElse(100));

        // create a Optional
        Optional<Integer> op001
                = Optional.of(9455);

        // print supplier
        System.out.println("Optional: "
                + op001);

        // orElseGet supplier
        System.out.println("Value by orElseGet"
                + "(Supplier) method: "
                + op001.orElseGet(
                () -> (int)(Math.random() * 10)));
    }
}
