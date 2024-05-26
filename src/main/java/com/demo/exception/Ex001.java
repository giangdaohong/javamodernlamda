package com.demo.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex001 {
    public static void main(String[] args) throws IOException {
        /*// Reading file from path in local directory
        FileReader file = new FileReader("C:\\test\\a.txt");

        // Creating object as one of ways of taking input
        BufferedReader fileInput = new BufferedReader(file);

        // Printing first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++)
            System.out.println(fileInput.readLine());

        // Closing file connections
        // using close() method
        fileInput.close();*/

        try {
            // code that might throw an exception
            int[] numbers = new int[5];
            int divisor = 0;
            for (int i = 0; i < numbers.length; i++) {
                int result = numbers[i] / divisor;
                System.out.println(result);
            }
        } catch (ArithmeticException e) {
            // create a new exception with the original exception as the cause
            throw new RuntimeException("Error: division by zero", e);
        }
    }
}
