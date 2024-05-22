package com.demo.lamda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Chap1Test001 {

    interface FuncInterface {
        // An abstract function
        int abstractFun(int x);

        // A non-abstract (or default) function
        default void normalFun() {
            System.out.println("Hello");
        }
    }


    public static void main(String args[]) {
        // lambda expression to implement above
        // functional interface. This interface
        // by default implements abstractFun()
        FuncInterface fobj = x -> {
            System.out.println(2 * x);
            return 2 * x;
        };

        // This calls above lambda expression and prints 10.
        fobj.abstractFun(5);
        fobj.normalFun();


        FuncInterface anInterface = new FuncInterface() {
            @Override
            public int abstractFun(int x) {
                return x*5;
            }
        };

        // Creating an ArrayList with elements
        // {1, 2, 3, 4}
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);

        // Using lambda expression to print all elements
        // of arrL
       // arrL.forEach(n -> System.out.println(n));

        // Using lambda expression to print even elements
        // of arrL
        /*arrL.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n);
        });*/


        Consumer<Integer> consumer = n -> {System.out.println(n);
            System.out.println(n*10);
        };

        Consumer<Integer> consumer2 = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer*1000);
            }
        };
        arrL.forEach(consumer2);
    }

}
