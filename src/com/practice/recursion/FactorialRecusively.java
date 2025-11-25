package com.practice.recursion;

import java.util.Scanner;

public class FactorialRecusively {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate it's factorial");
        int number = sc.nextInt();
        System.out.println(factorial(number));
    }

    private static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
