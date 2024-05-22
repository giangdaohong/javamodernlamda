package com.demo.lamda;

import java.util.TreeSet;

public class Chap1Test002 {
    interface FuncInter1 {
        int operation(int a, int b);
    }

    // sayMessage() is implemented using lambda expressions
    // above
    interface FuncInter2 {
        void sayMessage(String message);
    }

    // Performs FuncInter1's operation on 'a' and 'b'
    private int operate(int a, int b, FuncInter1 fobj)
    {
        return fobj.operation(a, b);
    }

    public static void main(String[] args)
    {
        // lambda expression for addition for two parameters
        // data type for x and y is optional.
        // This expression implements 'FuncInter1' interface
        FuncInter1 add = Integer::sum;

        // lambda expression multiplication for two
        // parameters This expression also implements
        // 'FuncInter1' interface
        FuncInter1 multiply = (int x, int y) -> x * y;

        // Creating an object of Test to call operate using
        // different implementations using lambda
        // Expressions
        Chap1Test002 tobj = new Chap1Test002();

        // Add two numbers using lambda expression
        System.out.println("Addition is "
                + tobj.operate(6, 3, add));

        // Multiply two numbers using lambda expression
        System.out.println("Multiplication is "
                + tobj.operate(6, 3, multiply));

        // lambda expression for single parameter
        // This expression implements 'FuncInter2' interface
        FuncInter2 fobj = message
                -> System.out.println("Hello " + message);
        fobj.sayMessage("Geek");


        // Pass a reverse comparator to TreeSet() via a lambda expression
        TreeSet<String> ts=new TreeSet<String>((aStr, bStr) -> bStr.compareTo(aStr));

        // Add elements to the Treeset
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("D");
        ts.add("E");
        ts.add("F");
        ts.add("G");

        //Display the elements .
        for(String element : ts) {
            System.out.println(element + "");
        }

        System.out.println();
    }
}
