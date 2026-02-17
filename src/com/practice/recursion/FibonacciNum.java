package com.practice.recursion;

public class FibonacciNum {
    public static void main(String[] args) {

        System.out.println(fibonacciCal(10));
    }

    private static int fibonacciCal(int n) {
        if (n == 0 || n == 1){
            return n;
        }
        int fib1 = fibonacciCal(n-1);
        int fib2 = fibonacciCal(n-2);
        return fib1 + fib2;
    }
}
