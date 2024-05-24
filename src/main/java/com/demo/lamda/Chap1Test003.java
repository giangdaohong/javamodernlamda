package com.demo.lamda;

public class Chap1Test003 {
    // An example of capturing a local variable from the
// enclosing scope

    // Inrterface
    interface MyFunction {

        // Method inside the interface
        int func(int n);
    }

    // Custom initialization
    int data = 170;

    // Interface
    interface MyInterface {

        // Method inside the interface
        void myFunction();
    }

    // Main class

    // Main driver method
    public static void main(String[] args) {

        // Custom local variable that can be captured
        int number = 10;

        MyFunction myLambda = (n) ->
        {

            // This use of number is OK It does not modify
            // num
            int value = number + n;

            // However, the following is illegal because it
            // attempts to modify the value of number

            // number++;
            return value;
        };

        // The following line would also cause an error,
        // because it would remove the effectively final
        // status from num. number = 9;
        System.out.println(myLambda.func(100));
        System.out.println("GFG!");


        // Creating object of this class
        // inside the main() method
        Chap1Test003 gfg = new Chap1Test003();

        // Creating object of interface
        // inside the main() method
        MyInterface intFace = () ->
        {
            System.out.println("Data : " + gfg.data);
            gfg.data += 500;

            System.out.println("Data : " + gfg.data);
        };
        intFace.myFunction();
        gfg.data += 200;

        System.out.println("Data : " + gfg.data);
    }


}/**/
