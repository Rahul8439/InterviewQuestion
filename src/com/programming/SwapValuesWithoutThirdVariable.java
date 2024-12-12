package com.programming;
public class SwapValuesWithoutThirdVariable {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        // Swap using arithmetic operations
        a = a + b; // a now becomes 15
        b = a - b; // b now becomes 5 (original value of a)
        a = a - b; // a now becomes 10 (original value of b)

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
